from abc import ABC, abstractmethod
from typing import List

from JavaParser.JavaTreeElementIf import JavaTreeElementIf
from JavaParser.MethodDeclarationIf import MethodDeclarationIf


class ClassOrInterfaceDeclarationIf(JavaTreeElementIf):

    @abstractmethod
    def getShortName(self) -> str:
        pass

    @abstractmethod
    def getFullQualifiedName(self) -> str:
        pass

    @abstractmethod
    def getMethods(self) -> List[MethodDeclarationIf]:
        pass

    @abstractmethod
    def getImplementedClasses(self) -> List[str]:
        pass

    @abstractmethod
    def getDescription(self) -> str:
        pass
