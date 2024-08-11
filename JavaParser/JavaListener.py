from types import NoneType
from typing import List, TypedDict
from antlr4 import CommonTokenStream, InputStream
from JavaParser.antlr.JavadocLexer import JavadocLexer
from JavaParser.antlr.JavadocParser import JavadocParser
from JavaParser.antlr.JavaLexer import JavaLexer
from JavaParser.antlr.JavaParser import JavaParser
from JavaParser.antlr.JavaParserListener import JavaParserListener


class Clazz(TypedDict):
    pass


class Interfaze(TypedDict):
    pass


class CompilationUnit1(TypedDict):
    imports: List[str]
    interface: List[Interfaze]
    classes: List[Clazz]


class JavaListener(JavaParserListener):

    def __init__(self) -> None:
        super().__init__()

        self.compilationUnit = CompilationUnit1()
        self.compilationUnit['classes'] = []
        self.compilationUnit['imports'] = []
        self.compilationUnit['interface'] = []

    def enterCompilationUnit(self, ctx: JavaParser.CompilationUnitContext):
        return super().enterCompilationUnit(ctx)

    def createCompilationUnit(self) -> CompilationUnit1:
        return self.compilationUnit

    def enterImportDeclaration(self, ctx: JavaParser.ImportDeclarationContext):
        importStatement = ctx.qualifiedName().getText()
        self.compilationUnit['imports'].append(importStatement)

    def enterInterfaceDeclaration(self, ctx: JavaParser.InterfaceDeclarationContext):
        name = ctx.identifier().IDENTIFIER().getText()

    def enterClassDeclaration(self, ctx: JavaParser.ClassDeclarationContext):
        name = ctx.identifier().IDENTIFIER().getText()
        print(name)

    def enterMethodDeclaration(self, ctx: JavaParser.MethodDeclarationContext):
        previous_token_index = ctx.getSourceInterval()[0] - 4
        previous_token = ctx.parser.getTokenStream().tokens[previous_token_index]

        test = ctx.identifier().IDENTIFIER().getText()

        # method_name = ctx. methodHeader().methodDeclarator().identifier().getText()
        javadoc = previous_token.text if previous_token.type == JavaLexer.JAVADOC_COMMENT else None
        print('method: {}, javadoc: {}'.format(test, javadoc))

        if javadoc:
            codeStream = InputStream(javadoc)
            lexer = JavadocLexer(codeStream)
            parser = JavadocParser(CommonTokenStream(lexer))
            tree = parser.documentation()
            print(tree.toStringTree(recog=parser))
