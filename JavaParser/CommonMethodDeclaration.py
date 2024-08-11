from typing import List
from JavaParser.JavaDoc.BlockTag import BlockTag, ParamTag, ReturnTag
from JavaParser.JavaDoc.JavaDocIf import JavaDocIf
from JavaParser.JavaTreeElement import JavaTreeElement
from JavaParser.ParameterDeclarationIf import ParameterDeclarationIf
from JavaParser.JavaParserContextIf import JavaParserContextIf
from JavaParser.JavaTreeElementIf import JavaTreeElementIf
from JavaParser.MethodDeclarationIf import MethodDeclarationIf
from JavaParser.antlr.JavaParser import JavaParser
from PythonLib.JOptional import JOptional
from PythonLib.Stream import Stream


class ParameterDeclaration(JavaTreeElement, ParameterDeclarationIf):
    def __init__(self, paramType: str, identifier: str, description: str, parent: JavaTreeElement) -> None:
        JavaTreeElement.__init__(self, parent)

        self.paramType = paramType
        self.idintifier = identifier
        self.description = description

    def getChildren(self) -> List[JavaTreeElementIf]:
        return []

    def getType(self) -> str:
        return self.paramType

    def getName(self) -> str:
        return self.idintifier

    def getDescription(self) -> str:
        return self.description


class CommonMethodDeclaration(JavaTreeElement, MethodDeclarationIf):

    def __init__(self, javadocContext: JavaParser.JavadocContext, parent: JavaTreeElementIf, context: JavaParserContextIf) -> None:
        JavaTreeElement.__init__(self, parent)
        self.context = context
        self.javaDocAsString = JOptional(javadocContext).map(lambda ctx: ctx.getText()).orElse("")

        self.identifier = ""
        self.returnType = ""
        self.parameters: List[ParameterDeclarationIf] = []
        self.javaDoc: JavaDocIf = None

    def parse(self) -> None:
        self.javaDoc = self.context.createJavaDoc(self.javaDocAsString).parse()

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

        paramJavaDoc = Stream(self.javaDoc.getTagsByType(ParamTag)) \
            .filter(lambda param: param.getName() == name) \
            .collectToList()

        paramDescription = ""
        if paramJavaDoc:
            paramDescription = paramJavaDoc[0]

        self.parameters.append(ParameterDeclaration(paramType, name, paramDescription, self))

    def getIdentifier(self) -> str:
        return self.identifier

    def getReturnType(self) -> str:
        return self.returnType

    def getParameters(self) -> List[ParameterDeclarationIf]:
        return self.parameters

    def getDescription(self) -> str:
        return self.javaDoc.getDescription()

    def getReturnDescription(self) -> str:
        returnTags = self.javaDoc.getTagsByType(ReturnTag)
        if returnTags:
            return returnTags[0]
        return ""
