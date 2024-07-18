from __future__ import annotations
from abc import ABC, abstractmethod
from pathlib import Path

from JavaParser.JavaPackageIf import JavaPackageIf


class JavaProjectIf(ABC):
    @abstractmethod
    def addClassPath(self, directory: Path) -> JavaProjectIf:
        pass

    @abstractmethod
    def parse(self) -> JavaProjectIf:
        pass

    @abstractmethod
    def getRootPackage(self) -> JavaPackageIf:
        pass
