from typing import List
from JavaParser.CommonMethodDeclaration import CommonMethodDeclaration
from JavaParser.JavaFileIf import JavaFileIf
from JavaParser.JavaParserContextIf import JavaParserContextIf
from JavaParser.JavaTreeElementIf import JavaTreeElementIf
from JavaParser.antlr.JavaParser import JavaParser
from PythonLib.JOptional import JOptional
from PythonLib.Stream import Stream
from PythonLib.StringUtil import StringUtil
from PythonLib.TreeStream import TreeElement, TreeStream


class ClassMethodDeclaration(CommonMethodDeclaration, JavaTreeElementIf):
    def __init__(self, methodDeclarationContext: JavaParser.MethodDeclarationContext, javadocContext: JavaParser.JavadocContext, parent: JavaTreeElementIf, context: JavaParserContextIf) -> None:
        CommonMethodDeclaration.__init__(self, javadocContext, parent, context)
        self.methodDeclarationContext = methodDeclarationContext

    def parse(self) -> None:

        CommonMethodDeclaration.parse(self)

        self.identifier = JOptional(self.methodDeclarationContext.identifier()) \
            .map(lambda identifierContext: identifierContext.getText()) \
            .orElse("")

        self.returnType = JOptional(self.methodDeclarationContext.typeTypeOrVoid()) \
            .map(lambda typeTypeOrVoidContext: typeTypeOrVoidContext.typeType()) \
            .map(lambda typeTypeContext: self._getType(typeTypeContext)) \
            .orElse("void")

        JOptional(self.methodDeclarationContext.formalParameters()).toStream() \
            .map(lambda formalParametersContext: formalParametersContext.formalParameterList()) \
            .flatMap(lambda formalParameterListContext: Stream(formalParameterListContext.formalParameter())) \
            .foreach(lambda formalParameterContext: self._handleFormalParameter(formalParameterContext))

        self.getCallOuts()

    def getChildren(self) -> List[JavaTreeElementIf]:
        return self.parameters

    def getJavaCode(self) -> str:

        javaCode = self.getParentElement(JavaFileIf).getJavaCode()

        start = self.methodDeclarationContext.start
        stop = self.methodDeclarationContext.stop

        return StringUtil.extractSubString(javaCode, start.line - 1, start.column, stop.line - 1, stop.column + 1)

    def getJavaCodeMethodDeclaration(self) -> str:
        javaCode = self.getParentElement(JavaFileIf).getJavaCode()

        start = self.methodDeclarationContext.start
        stop = self.methodDeclarationContext.methodBody().start

        return StringUtil.extractSubString(javaCode, start.line - 1, start.column, stop.line - 1, stop.column)

    def getCallOuts(self) -> None:
        methodBody: JavaParser.MethodBodyContext = self.methodDeclarationContext.methodBody()

        treeElement = TreeElement(methodBody, "getChildren")

        methodCallContexts: List[JavaParser.MethodCallContext] = TreeStream(treeElement) \
            .toStream() \
            .filter(lambda element: isinstance(element, JavaParser.MethodCallContext)) \
            .collectToList()

        for method in methodCallContexts:
            parent = method.parentCtx
            print(f'{parent.getText()} . {method.getText()}')
