from abc import ABC, abstractmethod
from typing import List

from JavaParser.MethodDeclarationIf import MethodDeclarationIf


class AsciiDocIf(ABC):

    @abstractmethod
    def getMethodTable(self, methods: List[MethodDeclarationIf]) -> str:
        pass
