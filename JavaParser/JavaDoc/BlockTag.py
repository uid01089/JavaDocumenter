from abc import ABC
from typing import TypeAlias
from JavaParser.JavaDoc.BlockTagIf import BlockTagIf, TagIf
from JavaParser.JavaDoc.JavaDocContextIf import JavaDocContextIf
from JavaParser.antlr.JavadocParser import JavadocParser
from PythonLib.JOptional import JOptional
from PythonLib.Stream import Stream

# https://www.oracle.com/technical-resources/articles/java/javadoc-tool.html


class DescriptionTag(TagIf):
    def __init__(self, description: str) -> None:
        self.description = description

    def getDescription(self) -> str:
        return self.description


class ParamTag(DescriptionTag):
    def __init__(self, paramName: str, description: str) -> None:
        super().__init__(description)
        self.name = paramName

    def getName(self) -> str:
        return self.name


class ReturnTag(DescriptionTag):
    pass


class AuthorTag(DescriptionTag):
    pass


class VersionTag(DescriptionTag):
    pass


class SeeTag(DescriptionTag):
    pass


class SinceTag(DescriptionTag):
    pass


class ExceptionTag(DescriptionTag):
    pass


class SerialTag(DescriptionTag):
    pass


class DeprecatedTag(DescriptionTag):
    pass


class BlockTag(BlockTagIf):
    def __init__(self, blockTagContext: JavadocParser.BlockTagContext, context: JavaDocContextIf) -> None:
        self.blockTagContext = blockTagContext
        self.context = context
        self.tag: TagIf = None

    def parse(self) -> BlockTagIf:
        tagName = JOptional(self.blockTagContext) \
            .map(lambda blockTagContext: blockTagContext.blockTagName()) \
            .map(lambda blockTagNameContext: blockTagNameContext.getText()) \
            .orElse("")

        tagValues = JOptional(self.blockTagContext) \
            .toStream() \
            .flatMap(lambda blockTagContext: Stream(blockTagContext.blockTagContent())) \
            .map(lambda blockTagContentContext: blockTagContentContext.blockTagText()) \
            .flatMap(lambda blockTagTextContext: Stream(blockTagTextContext.blockTagTextElement())) \
            .map(lambda blockTagTextElementContext: blockTagTextElementContext.getText()) \
            .collectToList()

        match(tagName):
            case 'author':
                self.tag = AuthorTag(" ".join(tagValues))
            case 'version':
                self.tag = VersionTag(" ".join(tagValues))
            case 'param':
                self.tag = ParamTag(tagValues[0], " ".join(tagValues[1:]))
            case 'return':
                self.tag = ReturnTag(" ".join(tagValues))
            case 'exception':
                self.tag = ExceptionTag(" ".join(tagValues))
            case 'see':
                self.tag = SeeTag(" ".join(tagValues))
            case 'since':
                self.tag = SinceTag(" ".join(tagValues))
            case 'serial':
                self.tag = SerialTag(" ".join(tagValues))
            case 'deprecated':
                self.tag = DeprecatedTag(" ".join(tagValues))
            case _:
                pass

    def getTag(self) -> TagIf:
        return self.tag
