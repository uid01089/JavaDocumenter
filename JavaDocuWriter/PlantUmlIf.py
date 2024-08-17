from abc import ABC, abstractmethod

from JavaParser.ClassDeclarationIf import ClassDeclarationIf
from JavaParser.ClassOrInterfaceDeclarationIf import ClassOrInterfaceDeclarationIf
from JavaParser.InterfaceDeclarationIf import InterfaceDeclarationIf


class PlantUmlIf(ABC):
    @abstractmethod
    def getFullInterface(self, javaInterface: InterfaceDeclarationIf) -> str:
        pass

    @abstractmethod
    def getFullClass(self, javaClass: ClassDeclarationIf) -> str:
        pass

    @abstractmethod
    def getValidPictureName(self, name: str) -> str:
        pass

    @abstractmethod
    def getUsedTypesDiagram(self, javaElement: ClassOrInterfaceDeclarationIf) -> str:
        pass

    @abstractmethod
    def getSuperInterfaceDiagram(self, javaInterface: InterfaceDeclarationIf) -> str:
        pass

    def getSuperClassesDiagram(self, javaClass: ClassDeclarationIf) -> str:
        pass
