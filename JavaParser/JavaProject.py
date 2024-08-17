from __future__ import annotations
from pathlib import Path
from typing import Dict, List
from JavaParser.JavaFileIf import JavaFileIf
from JavaParser.JavaPackageIf import JavaPackageIf
from JavaParser.JavaTreeElement import JavaTreeElement
from JavaParser.JavaParserContextIf import JavaParserContextIf
from JavaParser.JavaProjectIf import JavaProjectIf
from JavaParser.JavaTreeElementIf import JavaTreeElementIf
from PythonLib.FileUtil import FileOperations
from PythonLib.Stream import Stream


class JavaProject(JavaTreeElement, JavaProjectIf):

    def __init__(self, context: JavaParserContextIf) -> None:
        JavaTreeElement.__init__(self, None, None)

        self.pathCollection: List[Path] = []
        self.javaFiles: List[JavaFileIf] = []
        self.context = context
        self.rootPackage = context.createJavaPackage("")
        self.allJavaElements: Dict[str, JavaTreeElementIf] = {}

    def addClassPath(self, directory: Path) -> JavaProjectIf:
        self.pathCollection.append(directory)
        return self

    def parse(self) -> JavaProjectIf:

        this = self

        def __createJavaFile(this: JavaTreeElementIf, path: Path) -> JavaFileIf:
            print("Open " + str(path))
            return this.context.createJavaFile(this).parse(path)

        self.javaFiles = Stream(self.pathCollection) \
            .flatMap(lambda path: Stream(FileOperations.getAllFilesNested(path))) \
            .filter(lambda path: path.suffix.lower() == ".java") \
            .map(lambda path: __createJavaFile(this, path)) \
            .collectToList()

        for javaFile in self.javaFiles:

            # build up java package tree
            runningPackage = self.rootPackage
            for package in javaFile.getPackageDeclaration().split("."):
                runningPackage = runningPackage.addPackage(package, runningPackage)
            runningPackage.addJavaFile(javaFile)

            # Create index
            for clazz in javaFile.getClassDeclarations():
                self.allJavaElements[clazz.getFullQualifiedName()] = clazz
            for interface in javaFile.getInterfaceDeclaration():
                self.allJavaElements[interface.getFullQualifiedName()] = interface

        return self

    def getRootPackage(self) -> JavaPackageIf:
        return self.rootPackage

    def getChildren(self) -> List[JavaTreeElementIf]:
        return [self.rootPackage]

    def getElementByFullQualName(self, fullQualName: str) -> JavaTreeElementIf:
        return self.allJavaElements.get(fullQualName)
