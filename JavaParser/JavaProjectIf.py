from __future__ import annotations
from abc import ABC, abstractmethod
from pathlib import Path

from JavaParser.JavaPackageIf import JavaPackageIf
from JavaParser.JavaTreeElementIf import JavaTreeElementIf


class JavaProjectIf(JavaTreeElementIf):
    @abstractmethod
    def addClassPath(self, directory: Path) -> JavaProjectIf:
        pass

    @abstractmethod
    def parse(self) -> JavaProjectIf:
        pass

    @abstractmethod
    def getRootPackage(self) -> JavaPackageIf:
        pass

    @abstractmethod
    def getElementByFullQualName(self, fullQualName: str) -> JavaTreeElementIf:
        pass
