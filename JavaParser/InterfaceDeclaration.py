from types import NoneType
from JavaParser.ClassOrInterfaceDeclaration import ClassOrInterfaceDeclaration
from JavaParser.CompilationUnitIf import CompilationUnitIf
from JavaParser.InterfaceDeclarationIf import InterfaceDeclarationIf
from JavaParser.JavaParserContextIf import JavaParserContextIf
from JavaParser.antlr.JavaParser import JavaParser
from PythonLib.JOptional import JOptional
from PythonLib.Stream import Stream


class InterfaceDeclaration(ClassOrInterfaceDeclaration, InterfaceDeclarationIf):
    def __init__(self, interfaceDeclarationContext: JavaParser.InterfaceDeclarationContext,
                 javadocContext: JavaParser.JavadocContext, parent: CompilationUnitIf, context: JavaParserContextIf) -> None:

        ClassOrInterfaceDeclaration.__init__(self, interfaceDeclarationContext, parent, context)

        self.interfaceDeclarationContext = interfaceDeclarationContext
        self.javadocContext = javadocContext

        self.parse()

    def parse(self) -> None:

        ClassOrInterfaceDeclaration.parse(self)

        interfaceMemberDeclarationWithJavaDocContexts = JOptional(self.interfaceDeclarationContext).toStream() \
            .map(lambda interfaceDeclarationContext: interfaceDeclarationContext.interfaceBody()) \
            .flatMap(lambda interfaceBodyContext: Stream(interfaceBodyContext.interfaceBodyDeclaration())) \
            .map(lambda interfaceBodyDeclarationContext: interfaceBodyDeclarationContext.interfaceMemberDeclarationWithJavaDoc()) \
            .collectToList()

        self.methods = self.methods + Stream(interfaceMemberDeclarationWithJavaDocContexts) \
            .map(lambda interfaceMemberDeclarationWithJavaDocContexts: (interfaceMemberDeclarationWithJavaDocContexts.interfaceMemberDeclaration(), interfaceMemberDeclarationWithJavaDocContexts.javadoc())) \
            .map(lambda memDecContJavadocCont: (memDecContJavadocCont[0].interfaceMethodDeclaration(), memDecContJavadocCont[1])) \
            .filter(lambda methDecContextJavadocCont: not isinstance(methDecContextJavadocCont[0], NoneType)) \
            .map(lambda methDecContextJavadocCont: self.context.getInterfaceMethodDeclaration(methDecContextJavadocCont[0], methDecContextJavadocCont[1])) \
            .collectToList()

        self.methods = self.methods + Stream(interfaceMemberDeclarationWithJavaDocContexts) \
            .map(lambda interfaceMemberDeclarationWithJavaDocContexts: (interfaceMemberDeclarationWithJavaDocContexts.interfaceMemberDeclaration(), interfaceMemberDeclarationWithJavaDocContexts.javadoc())) \
            .map(lambda memDecContJavadocCont: (memDecContJavadocCont[0].genericInterfaceMethodDeclaration(), memDecContJavadocCont[1])) \
            .filter(lambda genMethDecContextJavadocCont: not isinstance(genMethDecContextJavadocCont[0], NoneType)) \
            .map(lambda genMethDecContextJavadocCont: (genMethDecContextJavadocCont[0].interfaceMethodDeclaration(), genMethDecContextJavadocCont[1])) \
            .filter(lambda methDecContextJavadocCont: not isinstance(methDecContextJavadocCont[0], NoneType)) \
            .map(lambda methDecContextJavadocCont: self.context.getInterfaceMethodDeclaration(methDecContextJavadocCont[0], methDecContextJavadocCont[1])) \
            .collectToList()

        Stream(self.methods).foreach(lambda method: method.parse())
