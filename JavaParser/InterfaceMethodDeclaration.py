from typing import List
from JavaParser.CommonMethodDeclaration import CommonMethodDeclaration
from JavaParser.JavaParserContextIf import JavaParserContextIf
from JavaParser.JavaTreeElementIf import JavaTreeElementIf
from JavaParser.antlr.JavaParser import JavaParser
from PythonLib.JOptional import JOptional
from PythonLib.Stream import Stream


class InterfaceMethodDeclaration(CommonMethodDeclaration, JavaTreeElementIf):
    def __init__(self, methodDeclarationContext: JavaParser.InterfaceMethodDeclarationContext, javadocContext: JavaParser.JavadocContext, context: JavaParserContextIf) -> None:
        CommonMethodDeclaration.__init__(self, context)

        self.methodDeclarationContext = methodDeclarationContext
        self.javadocContext = javadocContext

    def parse(self) -> None:

        self.identifier = JOptional(self.methodDeclarationContext.interfaceCommonBodyDeclaration()) \
            .map(lambda interfaceCommonBodyDeclaration: interfaceCommonBodyDeclaration.identifier()) \
            .map(lambda identifierContext: identifierContext.getText()) \
            .orElse("")

        self.returnValue = JOptional(self.methodDeclarationContext.interfaceCommonBodyDeclaration()) \
            .map(lambda interfaceCommonBodyDeclaration: interfaceCommonBodyDeclaration.typeTypeOrVoid()) \
            .map(lambda typeTypeOrVoidContext: typeTypeOrVoidContext.typeType()) \
            .map(lambda typeTypeContext: self._getType(typeTypeContext))

        JOptional(self.methodDeclarationContext.interfaceCommonBodyDeclaration()) \
            .map(lambda interfaceCommonBodyDeclaration: interfaceCommonBodyDeclaration.formalParameters()).toStream() \
            .map(lambda formalParametersContext: formalParametersContext.formalParameterList()) \
            .flatMap(lambda formalParameterListContext: Stream(formalParameterListContext.formalParameter())) \
            .foreach(lambda formalParameterContext: self._handleFormalParameter(formalParameterContext))

    def getChildren(self) -> List[JavaTreeElementIf]:
        return self.parameters
