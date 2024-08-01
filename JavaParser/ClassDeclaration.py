
from types import NoneType
from JavaParser.ClassDeclarationIf import ClassDeclarationIf
from JavaParser.ClassOrInterfaceDeclaration import ClassOrInterfaceDeclaration
from JavaParser.CompilationUnitIf import CompilationUnitIf
from JavaParser.JavaParserContextIf import JavaParserContextIf
from JavaParser.antlr.JavaParser import JavaParser
from PythonLib.JOptional import JOptional
from PythonLib.Stream import Stream


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

        memberDeclarationWithJavaDocContexts = JOptional(self.classDeclarationContext).toStream() \
            .map(lambda classDeclarationContext: classDeclarationContext.classBody()) \
            .flatMap(lambda classBodyContext: Stream(classBodyContext.classBodyDeclaration())) \
            .map(lambda classBodyDeclarationContext: classBodyDeclarationContext.memberDeclarationWithJavaDoc()) \
            .collectToList()

        self.methods = self.methods + Stream(memberDeclarationWithJavaDocContexts) \
            .map(lambda memberDeclarationWithJavaDocContext: (memberDeclarationWithJavaDocContext.memberDeclaration(), memberDeclarationWithJavaDocContext.javadoc())) \
            .filter(lambda memDecContJavadocCont: not isinstance(memDecContJavadocCont[0], NoneType)) \
            .map(lambda memDecContJavadocCont: (memDecContJavadocCont[0].methodDeclaration(), memDecContJavadocCont[1])) \
            .filter(lambda methDecContextJavadocCont: not isinstance(methDecContextJavadocCont[0], NoneType)) \
            .map(lambda methDecContextJavadocCont: self.context.getCassMethodDeclaration(methDecContextJavadocCont[0], methDecContextJavadocCont[1])) \
            .collectToList()

        self.methods = self.methods + Stream(memberDeclarationWithJavaDocContexts) \
            .map(lambda memberDeclarationWithJavaDocContext: (memberDeclarationWithJavaDocContext.memberDeclaration(), memberDeclarationWithJavaDocContext.javadoc())) \
            .filter(lambda memDecContJavadocCont: not isinstance(memDecContJavadocCont[0], NoneType)) \
            .map(lambda memDecContJavadocCont: (memDecContJavadocCont[0].genericMethodDeclaration(), memDecContJavadocCont[1])) \
            .filter(lambda genMethDecContextJavadocCont: not isinstance(genMethDecContextJavadocCont[0], NoneType)) \
            .map(lambda genMethDecContextJavadocCont: (genMethDecContextJavadocCont[0].methodDeclaration(), genMethDecContextJavadocCont[1])) \
            .filter(lambda methDecContextJavadocCont: not isinstance(methDecContextJavadocCont[0], NoneType)) \
            .map(lambda methDecContextJavadocCont: self.context.getCassMethodDeclaration(methDecContextJavadocCont[0], methDecContextJavadocCont[1])) \
            .collectToList()

        Stream(self.methods).foreach(lambda method: method.parse())

    def getSuperClass(self) -> str:
        return self.superClass
