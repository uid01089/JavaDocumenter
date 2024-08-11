from typing import Dict, List, Optional
from JavaParser.InterfaceDeclarationIf import InterfaceDeclarationIf
from JavaParser.ClassDeclarationIf import ClassDeclarationIf
from JavaParser.JavaPackageIf import JavaPackageIf
from JavaParser.JavaParserContextIf import JavaParserContextIf
from JavaParser.JavaTreeElement import JavaTreeElement
from JavaParser.JavaTreeElementIf import JavaTreeElementIf


class JavaPackage(JavaTreeElement, JavaPackageIf):
    def __init__(self, name: str, context: JavaParserContextIf, parent: JavaTreeElementIf) -> None:
        JavaTreeElement.__init__(self, parent)

        self.name = name
        self.context = context

        self.subPackages: Dict[str, JavaPackage] = {}
        self.classDeclarations: List[ClassDeclarationIf] = []
        self.interfaceDeclarations: List[InterfaceDeclarationIf] = []

    def addPackage(self, name: str, root: JavaPackageIf) -> JavaPackageIf:

        if name in self.subPackages:
            return self.subPackages[name]
        else:
            newPackage = self.context.createJavaPackage(name, root)
            self.subPackages[name] = newPackage
            return newPackage

    def addClassDeclarations(self, classDeclarations: List[ClassDeclarationIf]) -> JavaPackageIf:
        self.classDeclarations = self.classDeclarations + classDeclarations
        return self

    def addInterfaceDeclarations(self, interfaceDeclarations: List[InterfaceDeclarationIf]) -> JavaPackageIf:
        self.interfaceDeclarations = self.interfaceDeclarations + interfaceDeclarations
        return self

    def getChildren(self) -> List[JavaTreeElementIf]:
        return list(self.subPackages.values()) + self.classDeclarations + self.interfaceDeclarations
