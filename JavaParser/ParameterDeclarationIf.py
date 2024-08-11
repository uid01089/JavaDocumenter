from abc import ABC, abstractmethod


class ParameterDeclarationIf(ABC):
    @abstractmethod
    def getType(self) -> str:
        pass

    @abstractmethod
    def getName(self) -> str:
        pass

    @abstractmethod
    def getDescription(self) -> str:
        pass
