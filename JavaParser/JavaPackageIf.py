from abc import ABC, abstractmethod

from JavaParser.JavaFileIf import JavaFileIf
from JavaParser.JavaTreeElementIf import JavaTreeElementIf


class JavaPackageIf(JavaTreeElementIf):

    @abstractmethod
    def addJavaFile(self, javaFile: JavaFileIf) -> None:
        pass
