from abc import ABC, abstractmethod
from typing import List

from JavaParser.ClassDeclarationIf import ClassDeclarationIf
from JavaParser.ClassOrInterfaceDeclarationIf import ClassOrInterfaceDeclarationIf
from JavaParser.InterfaceDeclarationIf import InterfaceDeclarationIf
from JavaParser.JavaPackageIf import JavaPackageIf


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

    @abstractmethod
    def getSuperClassesDiagram(self, javaClass: ClassDeclarationIf) -> str:
        pass

    @abstractmethod
    def getPackageDiagram(self, allClassOrInterfaces: List[ClassOrInterfaceDeclarationIf]) -> str:
        pass
