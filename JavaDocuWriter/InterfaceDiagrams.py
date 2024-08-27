from typing import List
from JavaDocuWriter.InterfaceDiagramsIf import InterfaceDiagramsIf
from JavaDocuWriter.JavaDocuContextIf import JavaDocuContextIf
from JavaParser.InterfaceDeclarationIf import InterfaceDeclarationIf
from JavaParser.JavaPackageIf import JavaPackageIf
from PythonLib.TreeStream import TreeElement, TreeStream


class InterfaceDiagrams(InterfaceDiagramsIf):
    def __init__(self, rootPackage: JavaPackageIf, context: JavaDocuContextIf) -> None:
        self.rootPackage = rootPackage
        self.context = context

    def getDocu(self) -> str:

        treeElement = TreeElement(self.rootPackage, "getChildren")
        allInterfaces: List[InterfaceDeclarationIf] = TreeStream(treeElement) \
            .toStream() \
            .filter(lambda element: isinstance(element, InterfaceDeclarationIf)) \
            .collectToList()

        interfacesString = ""
        for interfaze in allInterfaces:
            interfacesString = interfacesString + self.context.createInterfaceWriter(interfaze).getDocu()

        return interfacesString
