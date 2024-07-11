
from types import NoneType
from typing import List
from JavaParser.MethodDeclaration import MethodDeclaration
from JavaParser.antlr.JavaParser import JavaParser
from PythonLib.Optional import Optional
from PythonLib.Stream import Stream


class ClassDeclaration:
    def __init__(self, classDeclarationContext: JavaParser.ClassDeclarationContext, javadocContext: JavaParser.JavadocContext) -> None:
        self.classDeclarationContext = classDeclarationContext
        self.javadocContext = javadocContext
        self.identifier = ""
        self.superClass: str = None
        self.implementedClasses: List[str] = []
        self.methods: List[MethodDeclaration] = []

        self.parse()

    def parse(self) -> None:
        self.identifier = Optional(self.classDeclarationContext.identifier()) \
            .map(lambda x: x.getText()) \
            .orElse("")

        self.superClass = Optional(self.classDeclarationContext.typeType()) \
            .map(lambda t: t.classOrInterfaceType()) \
            .map(lambda i: i.getText()) \
            .orElse(None)

        self.implementedClasses = Stream(self.classDeclarationContext.typeList()) \
            .flatMap(lambda x: Stream(x.typeType())) \
            .map(lambda t: t.classOrInterfaceType()) \
            .map(lambda i: i.getText()) \
            .collectToList()

        memberDeclarationWithJavaDocContexts = Optional(self.classDeclarationContext).toStream() \
            .map(lambda classDeclarationContext: classDeclarationContext.classBody()) \
            .flatMap(lambda classBodyContext: Stream(classBodyContext.classBodyDeclaration())) \
            .map(lambda classBodyDeclarationContext: classBodyDeclarationContext.memberDeclarationWithJavaDoc()) \
            .collectToList()

        self.methods = self.methods + Stream(memberDeclarationWithJavaDocContexts) \
            .map(lambda memberDeclarationWithJavaDocContext: (memberDeclarationWithJavaDocContext.memberDeclaration(), memberDeclarationWithJavaDocContext.javadoc())) \
            .map(lambda memDecContJavadocCont: (memDecContJavadocCont[0].methodDeclaration(), memDecContJavadocCont[1])) \
            .filter(lambda methDecContextJavadocCont: not isinstance(methDecContextJavadocCont[0], NoneType)) \
            .map(lambda methDecContextJavadocCont: MethodDeclaration(methDecContextJavadocCont[0], methDecContextJavadocCont[1])) \
            .collectToList()

        self.methods = self.methods + Stream(memberDeclarationWithJavaDocContexts) \
            .map(lambda memberDeclarationWithJavaDocContext: (memberDeclarationWithJavaDocContext.memberDeclaration(), memberDeclarationWithJavaDocContext.javadoc())) \
            .map(lambda memDecContJavadocCont: (memDecContJavadocCont[0].genericMethodDeclaration(), memDecContJavadocCont[1])) \
            .filter(lambda genMethDecContextJavadocCont: not isinstance(genMethDecContextJavadocCont[0], NoneType)) \
            .map(lambda genMethDecContextJavadocCont: (genMethDecContextJavadocCont[0].methodDeclaration(), genMethDecContextJavadocCont[1])) \
            .map(lambda methDecContextJavadocCont: MethodDeclaration(methDecContextJavadocCont[0], methDecContextJavadocCont[1])) \
            .collectToList()

        Stream(self.methods).foreach(lambda method: method.parse())
