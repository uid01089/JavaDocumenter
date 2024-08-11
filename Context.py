from ContextIf import ContextIf
from JavaDocuWriter.JavaDocuContext import JavaDocuContext
from JavaParser.JavaParserContext import JavaParserContext


class Context(ContextIf, JavaParserContext, JavaDocuContext):
    def __init__(self) -> None:
        JavaParserContext.__init__(self)
        JavaDocuContext.__init__(self)
