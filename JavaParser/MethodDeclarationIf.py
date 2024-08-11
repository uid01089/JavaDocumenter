from abc import ABC, abstractmethod
from typing import List

from JavaParser.ParameterDeclarationIf import ParameterDeclarationIf


class MethodDeclarationIf(ABC):

    @abstractmethod
    def parse(self) -> None:
        pass

    @abstractmethod
    def getIdentifier(self) -> str:
        pass

    @abstractmethod
    def getReturnType(self) -> str:
        pass

    @abstractmethod
    def getReturnDescription(self) -> str:
        pass

    @abstractmethod
    def getParameters(self) -> List[ParameterDeclarationIf]:
        pass

    @abstractmethod
    def getDescription(self) -> str:
        pass

    @abstractmethod
    def getJavaCode(self) -> str:
        pass

    @abstractmethod
    def getJavaCodeMethodDeclaration(self) -> str:
        pass
