
from pathlib import Path
from typing import List
from antlr4 import CommonTokenStream, InputStream
from JavaParser.ClassDeclarationIf import ClassDeclarationIf
from JavaParser.CompilationUnit import CompilationUnit
from JavaParser.InterfaceDeclarationIf import InterfaceDeclarationIf
from JavaParser.JavaParserContextIf import JavaParserContextIf
from JavaParser.JavaFileIf import JavaFileIf
from JavaParser.antlr.JavaLexer import JavaLexer
from JavaParser.antlr.JavaParser import JavaParser


class JavaFile(JavaFileIf):
    def __init__(self, context: JavaParserContextIf) -> None:
        self.context = context
        self.compilationUnit: CompilationUnit = None
        self.path: Path = None

    def parse(self, filePath: Path) -> JavaFileIf:
        self.path = filePath
        with open(filePath, "r", encoding="utf8") as file:
            javaCode = file.read()
            codeStream = InputStream(javaCode)
            lexer = JavaLexer(codeStream)
            parser = JavaParser(CommonTokenStream(lexer))
            tree = parser.compilationUnit()

            self.compilationUnit = self.context.getCompilationUnit(tree)
            self.compilationUnit.parse()
            return self

    def getClassDeclarations(self) -> List[ClassDeclarationIf]:
        return self.compilationUnit.getClassDeclarations()

    def getInterfaceDeclaration(self) -> List[InterfaceDeclarationIf]:
        return self.compilationUnit.getInterfaceDeclaration()

    def getPackageDeclaration(self) -> str:
        return self.compilationUnit.getPackageDeclaration()
