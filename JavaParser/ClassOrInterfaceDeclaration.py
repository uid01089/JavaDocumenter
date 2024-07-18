from types import NoneType
from typing import List
from JavaParser.ClassDeclarationIf import ClassDeclarationIf
from JavaParser.ClassOrInterfaceDeclarationIf import ClassOrInterfaceDeclarationIf
from JavaParser.CompilationUnitIf import CompilationUnitIf
from JavaParser.InterfaceDeclarationIf import InterfaceDeclarationIf
from JavaParser.JavaParserContextIf import JavaParserContextIf
from JavaParser.JavaTreeElementIf import JavaTreeElementIf
from JavaParser.MethodDeclarationIf import MethodDeclarationIf
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

        memberDeclarationWithJavaDocContexts = JOptional(self.intClassDeclarationContext).toStream() \
            .map(lambda classDeclarationContext: classDeclarationContext.classBody()) \
            .flatMap(lambda classBodyContext: Stream(classBodyContext.classBodyDeclaration())) \
            .map(lambda classBodyDeclarationContext: classBodyDeclarationContext.memberDeclarationWithJavaDoc()) \
            .collectToList()

        self.methods = self.methods + Stream(memberDeclarationWithJavaDocContexts) \
            .map(lambda memberDeclarationWithJavaDocContext: (memberDeclarationWithJavaDocContext.memberDeclaration(), memberDeclarationWithJavaDocContext.javadoc())) \
            .map(lambda memDecContJavadocCont: (memDecContJavadocCont[0].methodDeclaration(), memDecContJavadocCont[1])) \
            .filter(lambda methDecContextJavadocCont: not isinstance(methDecContextJavadocCont[0], NoneType)) \
            .map(lambda methDecContextJavadocCont: self.context.getMethodDeclaration(methDecContextJavadocCont[0], methDecContextJavadocCont[1])) \
            .collectToList()

        self.methods = self.methods + Stream(memberDeclarationWithJavaDocContexts) \
            .map(lambda memberDeclarationWithJavaDocContext: (memberDeclarationWithJavaDocContext.memberDeclaration(), memberDeclarationWithJavaDocContext.javadoc())) \
            .map(lambda memDecContJavadocCont: (memDecContJavadocCont[0].genericMethodDeclaration(), memDecContJavadocCont[1])) \
            .filter(lambda genMethDecContextJavadocCont: not isinstance(genMethDecContextJavadocCont[0], NoneType)) \
            .map(lambda genMethDecContextJavadocCont: (genMethDecContextJavadocCont[0].methodDeclaration(), genMethDecContextJavadocCont[1])) \
            .filter(lambda methDecContextJavadocCont: not isinstance(methDecContextJavadocCont[0], NoneType)) \
            .map(lambda methDecContextJavadocCont: self.context.getMethodDeclaration(methDecContextJavadocCont[0], methDecContextJavadocCont[1])) \
            .collectToList()

        Stream(self.methods).foreach(lambda method: method.parse())

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
