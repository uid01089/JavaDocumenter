from typing import Dict, List, Optional
from JavaParser.JavaFileIf import JavaFileIf
from JavaParser.JavaPackageIf import JavaPackageIf
from JavaParser.JavaParserContextIf import JavaParserContextIf
from JavaParser.JavaTreeElement import JavaTreeElement
from JavaParser.JavaTreeElementIf import JavaTreeElementIf


class JavaPackage(JavaTreeElement, JavaPackageIf):
    def __init__(self, name: str, context: JavaParserContextIf, parent: JavaTreeElementIf) -> None:
        JavaTreeElement.__init__(self, None, parent)

        self.name = name
        self.context = context

        self.subPackages: Dict[str, JavaPackageIf] = {}
        self.javaFiles: List[JavaFileIf] = []

    def addPackage(self, name: str, root: JavaPackageIf) -> JavaPackageIf:

        if name in self.subPackages:
            return self.subPackages[name]
        else:
            newPackage = self.context.createJavaPackage(name, root)
            self.subPackages[name] = newPackage
            return newPackage

    def addJavaFile(self, javaFile: JavaFileIf) -> None:
        self.javaFiles.append(javaFile)

    def getChildren(self) -> List[JavaTreeElementIf]:
        return list(self.subPackages.values()) + self.javaFiles
