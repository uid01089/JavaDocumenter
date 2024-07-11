from typing import List, TypedDict
from JavaParser.antlr.JavaParser import JavaParser
from PythonLib.Optional import Optional
from PythonLib.Stream import Stream


class ParameterDeclaration:
    def __init__(self, paramType: str, identifier: str) -> None:
        self.paramType = paramType
        self.idintifier = identifier


class MethodDeclaration:
    def __init__(self, methodDeclarationContext: JavaParser.MethodDeclarationContext, javadocContext: JavaParser.JavadocContext) -> None:
        self.methodDeclarationContext = methodDeclarationContext
        self.javadocContext = javadocContext

        self.identifier = ""
        self.returnValue = ""
        self.parameters: List[ParameterDeclaration] = []

    def parse(self) -> None:
        self.identifier = Optional(self.methodDeclarationContext.identifier()) \
            .map(lambda identifierContext: identifierContext.getText()) \
            .orElse("")

        self.returnValue = Optional(self.methodDeclarationContext.typeTypeOrVoid()) \
            .map(lambda typeTypeOrVoidContext: typeTypeOrVoidContext.typeType()) \
            .map(lambda typeTypeContext: self._getType(typeTypeContext))

        Optional(self.methodDeclarationContext.formalParameters()).toStream() \
            .map(lambda formalParametersContext: formalParametersContext.formalParameterList()) \
            .flatMap(lambda formalParameterListContext: Stream(formalParameterListContext.formalParameter())) \
            .foreach(lambda formalParameterContext: self._handleFormalParameter(formalParameterContext))

    def _getType(self, typeTypeContext: JavaParser.TypeTypeContext) -> str:
        return Optional(typeTypeContext) \
            .map(lambda typeTypeContext: typeTypeContext.classOrInterfaceType()) \
            .map(lambda classOrInterfaceTypeContext: classOrInterfaceTypeContext.typeIdentifier()) \
            .map(lambda typeIdentifierContext: typeIdentifierContext.getText()) \
            .orElse(Optional(typeTypeContext)
                    .map(lambda typeTypeContext: typeTypeContext.primitiveType())
                    .map(lambda primitiveType: primitiveType.getText())
                    .orElse("")
                    )

    def _handleFormalParameter(self, formalParameterContext: JavaParser.FormalParameterContext) -> None:

        paramType = self._getType(formalParameterContext.typeType())
        name = Optional(formalParameterContext) \
            .map(lambda formalParameterContext: formalParameterContext.variableDeclaratorId()) \
            .map(lambda variableDeclaratorIdContext: variableDeclaratorIdContext.identifier()) \
            .map(lambda identifierContext: identifierContext.getText()) \
            .orElse("")

        self.parameters.append(ParameterDeclaration(paramType, name))
