from ContextIf import ContextIf
from JavaDocuWriter.JavaDocuContext import JavaDocuContext
from JavaParser.JavaParserContext import JavaParserContext


class Context(ContextIf, JavaParserContext, JavaDocuContext):
    def __init__(self) -> None:
        pass
