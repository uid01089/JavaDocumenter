from abc import ABC, abstractmethod


class WriterIf(ABC):
    @abstractmethod
    def getDocu(self) -> str:
        pass
