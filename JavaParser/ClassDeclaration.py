
from JavaParser.ClassDeclarationIf import ClassDeclarationIf
from JavaParser.ClassOrInterfaceDeclaration import ClassOrInterfaceDeclaration
from JavaParser.CompilationUnitIf import CompilationUnitIf
from JavaParser.JavaParserContextIf import JavaParserContextIf
from JavaParser.antlr.JavaParser import JavaParser
from PythonLib.JOptional import JOptional


class ClassDeclaration(ClassOrInterfaceDeclaration, ClassDeclarationIf):
    def __init__(self, classDeclarationContext: JavaParser.ClassDeclarationContext,
                 javadocContext: JavaParser.JavadocContext, parent: CompilationUnitIf, context: JavaParserContextIf) -> None:

        ClassOrInterfaceDeclaration.__init__(self, classDeclarationContext, parent, context)

        self.classDeclarationContext = classDeclarationContext
        self.javadocContext = javadocContext
        self.superClass: str = None

        self.parse()

    def parse(self) -> None:

        ClassOrInterfaceDeclaration.parse(self)

        self.superClass = JOptional(self.classDeclarationContext.typeType()) \
            .map(lambda t: t.classOrInterfaceType()) \
            .map(lambda i: i.getText()) \
            .orElse(None)

    def getSuperClass(self) -> str:
        return self.superClass
