from typing import List, TypedDict
from antlr4 import CommonTokenStream, InputStream, ParseTreeWalker
from JavaParser.CompilationUnit import CompilationUnit
from JavaParser.JavaListener import CompilationUnit1, JavaListener
from JavaParser.antlr.JavaLexer import JavaLexer
from JavaParser.antlr.JavaParser import JavaParser


class JavaReader:
    def __init__(self) -> None:
        self.compilationUnit: CompilationUnit = None

    def parse(self, javaCode: str) -> None:
        codeStream = InputStream(javaCode)
        lexer = JavaLexer(codeStream)
        parser = JavaParser(CommonTokenStream(lexer))
        tree = parser.compilationUnit()

        # walker.walk(listener, tree)

        self.compilationUnit = CompilationUnit(tree)
        self.compilationUnit.parse()
