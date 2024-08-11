
from pathlib import Path
from typing import List
from antlr4 import CommonTokenStream, InputStream
from JavaParser.ClassDeclarationIf import ClassDeclarationIf
from JavaParser.CompilationUnit import CompilationUnit
from JavaParser.InterfaceDeclarationIf import InterfaceDeclarationIf
from JavaParser.JavaParserContextIf import JavaParserContextIf
from JavaParser.JavaFileIf import JavaFileIf
from JavaParser.JavaTreeElement import JavaTreeElement
from JavaParser.JavaTreeElementIf import JavaTreeElementIf
from JavaParser.antlr.JavaLexer import JavaLexer
from JavaParser.antlr.JavaParser import JavaParser


class JavaFile(JavaTreeElement, JavaFileIf):
    def __init__(self, parent: JavaTreeElementIf, context: JavaParserContextIf) -> None:
        JavaTreeElement.__init__(self, parent)

        self.context = context
        self.compilationUnit: CompilationUnit = None
        self.path: Path = None
        self.classDeclarations: List[ClassDeclarationIf] = []
        self.interfaceDeclarations: List[InterfaceDeclarationIf] = []
        self.packageDeclaration = ""
        self.javaCode = ""

    def parse(self, filePath: Path) -> JavaFileIf:
        self.path = filePath
        with open(filePath, "r", encoding="utf8") as file:
            self.javaCode = file.read()
            codeStream = InputStream(self.javaCode)
            lexer = JavaLexer(codeStream)
            parser = JavaParser(CommonTokenStream(lexer))
            compilationUnit = parser.compilationUnit()

            self.compilationUnit = self.context.createCompilationUnit(compilationUnit, self)
            self.compilationUnit.parse()

        self.classDeclarations = self.compilationUnit.createClassDeclarations()
        self.interfaceDeclarations = self.compilationUnit.createInterfaceDeclaration()
        self.packageDeclaration = self.compilationUnit.getPackageDeclaration()

        return self

    def getClassDeclarations(self) -> List[ClassDeclarationIf]:
        return self.classDeclarations

    def getInterfaceDeclaration(self) -> List[InterfaceDeclarationIf]:
        return self.interfaceDeclarations

    def getPackageDeclaration(self) -> str:
        return self.packageDeclaration

    def getChildren(self) -> List[JavaTreeElementIf]:
        return self.classDeclarations + self.interfaceDeclarations

    def getJavaCode(self) -> str:
        return self.javaCode
