from abc import ABC, abstractmethod
from typing import List

from JavaParser.ClassOrInterfaceDeclarationIf import ClassOrInterfaceDeclarationIf
from JavaParser.FieldDeclarationIf import FieldDeclarationIf
from JavaParser.MethodDeclarationIf import MethodDeclarationIf


class AsciiDocIf(ABC):

    @abstractmethod
    def getMethodTable(self, methods: List[MethodDeclarationIf]) -> str:
        pass

    @abstractmethod
    def getFieldTable(self, fields: List[FieldDeclarationIf]) -> str:
        pass

    @abstractmethod
    def getJaveClassOrInterfaceTable(self, classOrInterfaces: List[ClassOrInterfaceDeclarationIf]) -> str:
        pass

    @abstractmethod
    def getDescriptionTable(self, classOrInterfaces: List[ClassOrInterfaceDeclarationIf]) -> str:
        pass
