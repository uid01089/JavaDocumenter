from JavaParser.JavaDoc.BlockTag import BlockTag
from JavaParser.JavaDoc.BlockTagIf import BlockTagIf
from JavaParser.JavaDoc.JavaDoc import JavaDoc
from JavaParser.JavaDoc.JavaDocContextIf import JavaDocContextIf
from JavaParser.JavaDoc.JavaDocIf import JavaDocIf
from JavaParser.antlr.JavadocParser import JavadocParser


class JavaDocContext(JavaDocContextIf):
    def createJavaDoc(self, javaDoc: str) -> JavaDocIf:
        return JavaDoc(javaDoc, self)

    def createBlockTag(self, blockTagContext: JavadocParser.BlockTagContext) -> BlockTagIf:
        return BlockTag(blockTagContext, self)
