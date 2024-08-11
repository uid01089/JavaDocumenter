from abc import ABC, abstractmethod

from JavaParser.JavaDoc.BlockTagIf import BlockTagIf
from JavaParser.JavaDoc.JavaDocIf import JavaDocIf
from JavaParser.antlr.JavadocParser import JavadocParser


class JavaDocContextIf(ABC):
    @abstractmethod
    def createJavaDoc(self, javaDoc: str) -> JavaDocIf:
        pass

    @abstractmethod
    def createBlockTag(self, blockTagContext: JavadocParser.BlockTagContext) -> BlockTagIf:
        pass
