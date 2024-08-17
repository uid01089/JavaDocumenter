from abc import ABC, abstractmethod
from typing import List, Optional
from JavaParser.ClassDeclarationIf import ClassDeclarationIf
from JavaParser.InterfaceDeclarationIf import InterfaceDeclarationIf
from JavaParser.JavaTreeElementIf import JavaTreeElementIf


class CompilationUnitIf(JavaTreeElementIf):

    @abstractmethod
    def parse(self) -> None:
        pass

    @abstractmethod
    def createClassDeclarations(self) -> List[ClassDeclarationIf]:
        pass

    @abstractmethod
    def createInterfaceDeclaration(self) -> List[InterfaceDeclarationIf]:
        pass

    @abstractmethod
    def getPackageDeclaration(self) -> Optional[str]:
        pass

    @abstractmethod
    def getImportDeclarations(self) -> List[str]:
        pass
