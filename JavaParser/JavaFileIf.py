from __future__ import annotations
from abc import ABC, abstractmethod
from pathlib import Path
from typing import List
from JavaParser.ClassDeclarationIf import ClassDeclarationIf
from JavaParser.InterfaceDeclarationIf import InterfaceDeclarationIf
from JavaParser.JavaTreeElementIf import JavaTreeElementIf


class JavaFileIf(JavaTreeElementIf):

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

    @abstractmethod
    def getJavaCode(self) -> str:
        pass
