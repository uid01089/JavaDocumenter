from __future__ import annotations
from abc import ABC, abstractmethod
from typing import List, Optional, Type, TypeVar

T = TypeVar('T')


class JavaTreeElementIf(ABC):

    @abstractmethod
    def getChildren(self) -> List[JavaTreeElementIf]:
        pass

    @abstractmethod
    def getParent(self) -> JavaTreeElementIf:
        pass

    @abstractmethod
    def getParentElement(self, classType: Type[T]) -> Optional[T]:
        pass

    @abstractmethod
    def getUsedTypes(self) -> List[str]:
        pass
