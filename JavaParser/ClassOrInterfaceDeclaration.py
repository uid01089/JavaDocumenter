from types import NoneType
from typing import List
from JavaParser.ClassDeclarationIf import ClassDeclarationIf
from JavaParser.ClassOrInterfaceDeclarationIf import ClassOrInterfaceDeclarationIf
from JavaParser.CompilationUnitIf import CompilationUnitIf
from JavaParser.InterfaceDeclarationIf import InterfaceDeclarationIf
from JavaParser.JavaParserContextIf import JavaParserContextIf
from JavaParser.JavaTreeElementIf import JavaTreeElementIf
from JavaParser.MethodDeclarationIf import MethodDeclarationIf
from JavaParser.antlr.JavaParser import JavaParser
from PythonLib.JOptional import JOptional
from PythonLib.Stream import Stream


class ClassOrInterfaceDeclaration(ClassOrInterfaceDeclarationIf, JavaTreeElementIf):
    def __init__(self, intClassDeclarationContext: InterfaceDeclarationIf | ClassDeclarationIf, parent: CompilationUnitIf, context: JavaParserContextIf) -> None:
        self.intClassDeclarationContext = intClassDeclarationContext
        self.context = context
        self.parent = parent
        self.identifier = ""
        self.implementedClasses: List[str] = []
        self.methods: List[MethodDeclarationIf] = []

    def parse(self) -> None:
        self.identifier = JOptional(self.intClassDeclarationContext.identifier()) \
            .map(lambda identifierContext: identifierContext.getText()) \
            .orElse("")

        self.implementedClasses = Stream(self.intClassDeclarationContext.typeList()) \
            .flatMap(lambda typeListContext: Stream(typeListContext.typeType())) \
            .map(lambda typeTypeContext: typeTypeContext.classOrInterfaceType()) \
            .map(lambda classOrInterfaceTypeContext: classOrInterfaceTypeContext.getText()) \
            .collectToList()

    def getChildren(self) -> List[JavaTreeElementIf]:
        return self.methods

    def getShortName(self) -> str:
        return self.identifier

    def getMethods(self) -> List[MethodDeclarationIf]:
        return self.methods

    def getImplementedClasses(self) -> List[str]:
        return self.implementedClasses

    def getFullQualifiedName(self) -> str:
        return JOptional(self.parent.getPackageDeclaration()) \
            .map(lambda package: f'{package}.{self.getShortName()}') \
            .orElse(self.getShortName())
