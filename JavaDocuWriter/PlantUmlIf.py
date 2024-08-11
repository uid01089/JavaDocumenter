from abc import ABC, abstractmethod

from JavaParser.ClassDeclarationIf import ClassDeclarationIf
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
