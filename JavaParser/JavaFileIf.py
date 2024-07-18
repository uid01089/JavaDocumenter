from __future__ import annotations
from abc import ABC, abstractmethod
from pathlib import Path
from typing import List
from JavaParser.ClassDeclarationIf import ClassDeclarationIf
from JavaParser.InterfaceDeclarationIf import InterfaceDeclarationIf


class JavaFileIf(ABC):

    @abstractmethod
    def parse(self, filePath: Path) -> JavaFileIf:
        pass

    @abstractmethod
    def getClassDeclarations(self) -> List[ClassDeclarationIf]:
        pass

    @abstractmethod
    def getInterfaceDeclaration(self) -> List[InterfaceDeclarationIf]:
        pass

    @abstractmethod
    def getPackageDeclaration(self) -> str:
        pass
