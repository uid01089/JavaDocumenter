from abc import ABC, abstractmethod
from typing import List, Optional
from JavaParser.ClassDeclarationIf import ClassDeclarationIf
from JavaParser.InterfaceDeclarationIf import InterfaceDeclarationIf


class CompilationUnitIf(ABC):
    pass

    @abstractmethod
    def parse(self) -> None:
        pass

    @abstractmethod
    def getClassDeclarations(self) -> List[ClassDeclarationIf]:
        pass

    @abstractmethod
    def getInterfaceDeclaration(self) -> List[InterfaceDeclarationIf]:
        pass

    @abstractmethod
    def getPackageDeclaration(self) -> Optional[str]:
        pass
