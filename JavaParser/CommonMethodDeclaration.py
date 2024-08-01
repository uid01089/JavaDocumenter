from typing import List
from JavaParser.JavaParserContextIf import JavaParserContextIf
from JavaParser.JavaTreeElementIf import JavaTreeElementIf
from JavaParser.MethodDeclarationIf import MethodDeclarationIf
from JavaParser.antlr.JavaParser import JavaParser
from PythonLib.JOptional import JOptional


class ParameterDeclaration(JavaTreeElementIf):
    def __init__(self, paramType: str, identifier: str) -> None:
        self.paramType = paramType
        self.idintifier = identifier

    def getChildren(self) -> List[JavaTreeElementIf]:
        return []


class CommonMethodDeclaration(MethodDeclarationIf):

    def __init__(self, context: JavaParserContextIf) -> None:
        self.context = context

        self.identifier = ""
        self.returnValue = ""
        self.parameters: List[ParameterDeclaration] = []

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
