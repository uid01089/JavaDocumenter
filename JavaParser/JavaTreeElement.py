from typing import List, Type, TypeVar, Optional

from antlr4 import ParserRuleContext
from JavaParser.CompilationUnitIf import CompilationUnitIf
from JavaParser.JavaTreeElementIf import T, JavaTreeElementIf
from JavaParser.antlr.JavaParser import JavaParser
from PythonLib.JOptional import JOptional
from PythonLib.Stream import Stream
from PythonLib.TreeStream import TreeElement, TreeStream


class JavaTreeElement(JavaTreeElementIf):
    def __init__(self, this: Optional[ParserRuleContext], parent: JavaTreeElementIf) -> None:
        self.parent = parent
        self.this = this

    def getParent(self) -> JavaTreeElementIf:
        return self.parent

    def getParentElement(self, classType: Type[T]) -> Optional[T]:
        runner = self
        while runner:
            if isinstance(runner, classType):
                return runner
            try:
                runner = runner.getParent()
            except AttributeError:
                return None
        return None

    def getUsedTypes(self) -> List[str]:
        if self.this:
            treeElement = TreeElement(self.this, "getChildren")
            usedTypes: List[str] = TreeStream(treeElement) \
                .toStream() \
                .filter(lambda element: isinstance(element, JavaParser.ClassOrInterfaceTypeContext)) \
                .map(lambda element: element.typeIdentifier()) \
                .map(lambda typeIdentifierContext: typeIdentifierContext.getText()) \
                .collectToSet()

            fullQualifiedTypes = self.__getFullQualifiedName(usedTypes)

            return fullQualifiedTypes
        return []

    def __getFullQualifiedName(self, shortNames: List[str]) -> List[str]:

        fullQualifiedNames: List[str] = []

        compilationUnit: CompilationUnitIf = self.getParentElement(CompilationUnitIf)
        importDeclarations = compilationUnit.getImportDeclarations()

        for shortName in shortNames:
            for importDec in importDeclarations:
                if importDec.endswith(f".{shortName}"):
                    fullQualifiedNames.append(importDec)
                    break
            else:
                # No match and break, add the shortname
                fullQualifiedNames.append(shortName)

        return fullQualifiedNames
