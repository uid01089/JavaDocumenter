from typing import List
from JavaParser.ClassDeclaration import ClassDeclaration
from JavaParser.InterfaceDeclaration import InterfaceDeclaration
from JavaParser.antlr.JavaParser import JavaParser
from PythonLib.Optional import Optional
from PythonLib.Stream import Stream


class CompilationUnit:
    def __init__(self, compilationUnitContext: JavaParser.CompilationUnitContext) -> None:
        self.compilationUnitContext = compilationUnitContext
        self.packageDeclaration = ""
        self.classDeclaration: List[ClassDeclaration] = []
        self.interfaceDeclaration: List[InterfaceDeclaration] = []

    def parse(self) -> None:

        self.packageDeclaration = Optional(self.compilationUnitContext.packageDeclaration()) \
            .map(lambda packageDecklarationContext: packageDecklarationContext.qualifiedName().getText()) \
            .orElse("")

        self.classDeclaration = Stream(self.compilationUnitContext.typeDeclarationWithJavaDoc()) \
            .map(lambda typeDeclarationWithJavaDocCotext: (typeDeclarationWithJavaDocCotext.typeDeclaration(), typeDeclarationWithJavaDocCotext.javadoc)) \
            .map(lambda typeDecContJavaDocCont: (typeDecContJavaDocCont[0].classDeclaration(), typeDecContJavaDocCont[1])) \
            .map(lambda classDecContJavaDocCont: ClassDeclaration(classDecContJavaDocCont[0], classDecContJavaDocCont[1])) \
            .collectToList()
