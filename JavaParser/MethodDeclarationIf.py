from abc import ABC, abstractmethod


class MethodDeclarationIf(ABC):

    @abstractmethod
    def parse(self) -> None:
        pass
