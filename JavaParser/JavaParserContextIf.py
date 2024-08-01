from abc import ABC, abstractmethod
from typing import Optional

from JavaParser.ClassDeclarationIf import ClassDeclarationIf
from JavaParser.CompilationUnitIf import CompilationUnitIf
from JavaParser.InterfaceDeclarationIf import InterfaceDeclarationIf
from JavaParser.JavaFileIf import JavaFileIf
from JavaParser.JavaPackageIf import JavaPackageIf
from JavaParser.JavaProjectIf import JavaProjectIf
from JavaParser.MethodDeclarationIf import MethodDeclarationIf
from JavaParser.antlr.JavaParser import JavaParser


class JavaParserContextIf(ABC):

    @abstractmethod
    def getJavaFile(self) -> JavaFileIf:
        pass

    @abstractmethod
    def getCompilationUnit(self, compilationUnitContext: JavaParser.CompilationUnitContext) -> CompilationUnitIf:
        pass

    @abstractmethod
    def getClassDeclaration(self, classDeclarationContext: JavaParser.ClassDeclarationContext,
                            javadocContext: JavaParser.JavadocContext, parent: CompilationUnitIf) -> ClassDeclarationIf:
        pass

    @abstractmethod
    def getInterfaceDeclaration(self, interfaceDeclarationContext: JavaParser.InterfaceDeclarationContext,
                                javadocContext: JavaParser.JavadocContext, parent: CompilationUnitIf) -> InterfaceDeclarationIf:
        pass

    @abstractmethod
    def getCassMethodDeclaration(self, methodDeclarationContext: JavaParser.MethodDeclarationContext, javadocContext: JavaParser.JavadocContext) -> MethodDeclarationIf:
        pass

    @abstractmethod
    def getInterfaceMethodDeclaration(self, methodDeclarationContext: JavaParser.InterfaceMethodDeclarationContext, javadocContext: JavaParser.JavadocContext) -> MethodDeclarationIf:
        pass

    @abstractmethod
    def getJavaProject(self) -> JavaProjectIf:
        pass

    @abstractmethod
    def getJavaPackage(self, name: str, root: Optional[JavaPackageIf] = None) -> JavaPackageIf:
        pass
