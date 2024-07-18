from typing import List
from JavaParser.JavaParserContextIf import JavaParserContextIf
from JavaParser.JavaTreeElementIf import JavaTreeElementIf
from JavaParser.MethodDeclarationIf import MethodDeclarationIf
from JavaParser.antlr.JavaParser import JavaParser
from PythonLib.JOptional import JOptional
from PythonLib.Stream import Stream


class ParameterDeclaration(JavaTreeElementIf):
    def __init__(self, paramType: str, identifier: str) -> None:
        self.paramType = paramType
        self.idintifier = identifier

    def getChildren(self) -> List[JavaTreeElementIf]:
        return []


class MethodDeclaration(MethodDeclarationIf, JavaTreeElementIf):
    def __init__(self, methodDeclarationContext: JavaParser.MethodDeclarationContext, javadocContext: JavaParser.JavadocContext, context: JavaParserContextIf) -> None:
        self.methodDeclarationContext = methodDeclarationContext
        self.javadocContext = javadocContext
        self.context = context

        self.identifier = ""
        self.returnValue = ""
        self.parameters: List[ParameterDeclaration] = []

    def parse(self) -> None:
        self.identifier = JOptional(self.methodDeclarationContext.identifier()) \
            .map(lambda identifierContext: identifierContext.getText()) \
            .orElse("")

        self.returnValue = JOptional(self.methodDeclarationContext.typeTypeOrVoid()) \
            .map(lambda typeTypeOrVoidContext: typeTypeOrVoidContext.typeType()) \
            .map(lambda typeTypeContext: self._getType(typeTypeContext))

        JOptional(self.methodDeclarationContext.formalParameters()).toStream() \
            .map(lambda formalParametersContext: formalParametersContext.formalParameterList()) \
            .flatMap(lambda formalParameterListContext: Stream(formalParameterListContext.formalParameter())) \
            .foreach(lambda formalParameterContext: self._handleFormalParameter(formalParameterContext))

    def _getType(self, typeTypeContext: JavaParser.TypeTypeContext) -> str:
        return JOptional(typeTypeContext) \
            .map(lambda typeTypeContext: typeTypeContext.classOrInterfaceType()) \
            .map(lambda classOrInterfaceTypeContext: classOrInterfaceTypeContext.typeIdentifier()) \
            .map(lambda typeIdentifierContext: typeIdentifierContext.getText()) \
            .orElse(JOptional(typeTypeContext)
                    .map(lambda typeTypeContext: typeTypeContext.primitiveType())
                    .map(lambda primitiveType: primitiveType.getText())
                    .orElse("")
                    )

    def _handleFormalParameter(self, formalParameterContext: JavaParser.FormalParameterContext) -> None:

        paramType = self._getType(formalParameterContext.typeType())
        name = JOptional(formalParameterContext) \
            .map(lambda formalParameterContext: formalParameterContext.variableDeclaratorId()) \
            .map(lambda variableDeclaratorIdContext: variableDeclaratorIdContext.identifier()) \
            .map(lambda identifierContext: identifierContext.getText()) \
            .orElse("")

        self.parameters.append(ParameterDeclaration(paramType, name))

    def getChildren(self) -> List[JavaTreeElementIf]:
        return self.parameters
