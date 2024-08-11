from __future__ import annotations
from abc import ABC, abstractmethod
from typing import List

from JavaParser.JavaDoc.BlockTagIf import TagIf


class JavaDocIf(ABC):

    @abstractmethod
    def getDescription(self) -> str:
        pass

    @abstractmethod
    def getTags(self) -> List[TagIf]:
        pass

    @abstractmethod
    def getTagsByType(self, typeof: TagIf) -> List[TagIf]:
        pass

    @abstractmethod
    def parse(self) -> JavaDocIf:
        pass
