from abc import ABC, abstractmethod


class TagIf(ABC):
    pass


class BlockTagIf(ABC):

    @abstractmethod
    def getTag(self) -> TagIf:
        pass
