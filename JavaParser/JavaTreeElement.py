from typing import Type, TypeVar, Optional
from JavaParser.JavaTreeElementIf import T, JavaTreeElementIf


class JavaTreeElement(JavaTreeElementIf):
    def __init__(self, parent: JavaTreeElementIf) -> None:
        self.parent = parent

    def getParent(self) -> JavaTreeElementIf:
        return self.parent

    def getParentElement(self, classType: Type[T]) -> Optional[T]:
        runner = self
        while runner:
            if isinstance(runner, classType):
                return runner
            try:
                runner = runner.getParent()
            except AttributeError:
                return None
        return None
