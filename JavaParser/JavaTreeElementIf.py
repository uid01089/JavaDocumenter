from __future__ import annotations
from abc import ABC, abstractmethod
from typing import List


class JavaTreeElementIf(ABC):

    @abstractmethod
    def getChildren(self) -> List[JavaTreeElementIf]:
        pass
