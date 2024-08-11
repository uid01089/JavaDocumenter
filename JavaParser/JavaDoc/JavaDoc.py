

from typing import ClassVar, List
from antlr4 import CommonTokenStream, InputStream
from JavaParser.JavaDoc.BlockTagIf import BlockTagIf, TagIf
from JavaParser.JavaDoc.JavaDocContextIf import JavaDocContextIf
from JavaParser.JavaDoc.JavaDocIf import JavaDocIf
from JavaParser.antlr.JavadocLexer import JavadocLexer
from JavaParser.antlr.JavadocParser import JavadocParser
from PythonLib.JOptional import JOptional
from PythonLib.Stream import Stream


class JavaDoc(JavaDocIf):
    def __init__(self, javaDoc: str, context: JavaDocContextIf) -> None:
        self.javaDoc = javaDoc
        self.context = context
        self.description = ""
        self.blockTags: List[BlockTagIf] = []

    def parse(self) -> JavaDocIf:

        if self.javaDoc:
            codeStream = InputStream(self.javaDoc)
            lexer = JavadocLexer(codeStream)
            parser = JavadocParser(CommonTokenStream(lexer))

            # print(parser.documentation().toStringTree(recog=parser))

            documentationContentContext = JOptional(parser.documentation()) \
                .map(lambda documentationContext: documentationContext.documentationContent())

            # description
            descriptions = documentationContentContext \
                .map(lambda documentationContentContext: documentationContentContext.description()) \
                .toStream() \
                .flatMap(lambda descriptionContext: Stream(descriptionContext.descriptionLine())) \
                .map(lambda descriptionLineContext: descriptionLineContext.getText()) \
                .collectToList()
            self.description = "\n".join(descriptions)

            # tags
            self.blockTags = documentationContentContext \
                .map(lambda documentationContentContext: documentationContentContext.tagSection()) \
                .toStream() \
                .flatMap(lambda tagSectionContext: Stream(tagSectionContext.blockTag())) \
                .map(lambda blockTagContext: self.context.createBlockTag(blockTagContext).parse()) \
                .collectToList()

        return self

    def getDescription(self) -> str:
        return self.description

    def getTags(self) -> List[TagIf]:
        return Stream(self.blockTags) \
            .map(lambda blockTags: blockTags.getTag()) \
            .collectToList()

    def getTagsByType(self, typeof: TagIf) -> List[TagIf]:
        return Stream(self.blockTags) \
            .map(lambda blockTags: blockTags.getTag()) \
            .filter(lambda tag: isinstance(tag, typeof)) \
            .collectToList()
