from types import NoneType
from typing import List, Optional
from JavaParser.ClassDeclarationIf import ClassDeclarationIf
from JavaParser.CompilationUnitIf import CompilationUnitIf
from JavaParser.InterfaceDeclarationIf import InterfaceDeclarationIf
from JavaParser.JavaParserContextIf import JavaParserContextIf
from JavaParser.antlr.JavaParser import JavaParser
from PythonLib.JOptional import JOptional
from PythonLib.Stream import Stream


class CompilationUnit(CompilationUnitIf):
    def __init__(self, compilationUnitContext: JavaParser.CompilationUnitContext, context: JavaParserContextIf) -> None:
        self.compilationUnitContext = compilationUnitContext
        self.context = context
        self.packageDeclaration = None
        self.classDeclaration: List[ClassDeclarationIf] = []
        self.interfaceDeclaration: List[InterfaceDeclarationIf] = []

    def parse(self) -> None:

        self.packageDeclaration = JOptional(self.compilationUnitContext.packageDeclaration()) \
            .map(lambda packageDecklarationContext: packageDecklarationContext.qualifiedName().getText()) \
            .orElse(None)

        typeDecContJavaDocCont: List[JavaParser.TypeDeclarationContext] = \
            Stream(self.compilationUnitContext.typeDeclarationWithJavaDoc()) \
            .map(lambda typeDeclarationWithJavaDocContext: (typeDeclarationWithJavaDocContext.typeDeclaration(), typeDeclarationWithJavaDocContext.javadoc)) \
            .collectToList()

        self.classDeclaration = Stream(typeDecContJavaDocCont) \
            .map(lambda typeDecContJavaDocCont: (typeDecContJavaDocCont[0].classDeclaration(), typeDecContJavaDocCont[1])) \
            .filter(lambda typeDecContJavaDocCont: not isinstance(typeDecContJavaDocCont[0], NoneType)) \
            .map(lambda classDecContJavaDocCont: self.context.getClassDeclaration(classDecContJavaDocCont[0], classDecContJavaDocCont[1], self)) \
            .collectToList()

        self.interfaceDeclaration = Stream(typeDecContJavaDocCont) \
            .map(lambda typeDecContJavaDocCont: (typeDecContJavaDocCont[0].interfaceDeclaration(), typeDecContJavaDocCont[1])) \
            .filter(lambda typeDecContJavaDocCont: not isinstance(typeDecContJavaDocCont[0], NoneType)) \
            .map(lambda interfaceDecContJavaDocCont: self.context.getInterfaceDeclaration(interfaceDecContJavaDocCont[0], interfaceDecContJavaDocCont[1], self)) \
            .collectToList()

    def getClassDeclarations(self) -> List[ClassDeclarationIf]:
        return self.classDeclaration

    def getInterfaceDeclaration(self) -> List[InterfaceDeclarationIf]:
        return self.interfaceDeclaration

    def getPackageDeclaration(self) -> Optional[str]:
        return self.packageDeclaration
