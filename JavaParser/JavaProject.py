from __future__ import annotations
from pathlib import Path
from typing import Dict, List
from JavaParser.ClassDeclarationIf import ClassDeclarationIf
from JavaParser.InterfaceDeclarationIf import InterfaceDeclarationIf
from JavaParser.JavaPackageIf import JavaPackageIf
from JavaParser.JavaTreeElement import JavaTreeElement
from PythonLib.FileUtil import FileOperations
from JavaParser.JavaParserContextIf import JavaParserContextIf
from JavaParser.JavaProjectIf import JavaProjectIf
from JavaParser.JavaTreeElementIf import JavaTreeElementIf
from PythonLib.Stream import Stream


class JavaProject(JavaTreeElement, JavaProjectIf):

    def __init__(self, context: JavaParserContextIf) -> None:
        JavaTreeElement.__init__(self, None)

        self.pathCollection: List[Path] = []
        self.context = context
        self.rootPackage = context.createJavaPackage("")
        self.allClasses: Dict[str, ClassDeclarationIf] = {}
        self.allInterfaces: Dict[str, InterfaceDeclarationIf] = {}

    def addClassPath(self, directory: Path) -> JavaProjectIf:
        self.pathCollection.append(directory)
        return self

    def parse(self) -> JavaProjectIf:

        for path in self.pathCollection:
            FileOperations.treeWalker(path, self._fileVisitor)
        return self

    def _fileVisitor(self, path: Path) -> None:
        if path.suffix.lower() == ".java":
            reader = self.context.createJavaFile(self)
            print("Open " + str(path))
            javaFile = reader.parse(path)

            # build up java package structure
            runningPackage = self.rootPackage
            for package in javaFile.getPackageDeclaration().split("."):
                runningPackage = runningPackage.addPackage(package, runningPackage)

            classes = javaFile.getClassDeclarations()
            for clazz in classes:
                self.allClasses[clazz.getFullQualifiedName()] = clazz
            runningPackage.addClassDeclarations(classes)

            interfaces = javaFile.getInterfaceDeclaration()
            for interface in interfaces:
                self.allInterfaces[interface.getFullQualifiedName()] = interface

            runningPackage.addInterfaceDeclarations(interfaces)

    def getRootPackage(self) -> JavaPackageIf:
        return self.rootPackage

    def getChildren(self) -> List[JavaTreeElementIf]:
        return [self.rootPackage]
