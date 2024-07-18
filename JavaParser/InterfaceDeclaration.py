from JavaParser.ClassOrInterfaceDeclaration import ClassOrInterfaceDeclaration
from JavaParser.CompilationUnitIf import CompilationUnitIf
from JavaParser.InterfaceDeclarationIf import InterfaceDeclarationIf
from JavaParser.JavaParserContextIf import JavaParserContextIf
from JavaParser.antlr.JavaParser import JavaParser


class InterfaceDeclaration(ClassOrInterfaceDeclaration, InterfaceDeclarationIf):
    def __init__(self, interfaceDeclarationContext: JavaParser.InterfaceDeclarationContext,
                 javadocContext: JavaParser.JavadocContext, parent: CompilationUnitIf, context: JavaParserContextIf) -> None:

        ClassOrInterfaceDeclaration.__init__(self, interfaceDeclarationContext, parent, context)

        self.interfaceDeclarationContext = interfaceDeclarationContext
        self.javadocContext = javadocContext

    def parse(self) -> None:
        ClassOrInterfaceDeclaration.parse(self)
