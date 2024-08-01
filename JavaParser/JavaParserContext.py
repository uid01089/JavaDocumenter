from typing import Optional
from JavaParser.ClassDeclarationIf import ClassDeclarationIf
from JavaParser.CompilationUnitIf import CompilationUnitIf
from JavaParser.InterfaceDeclaration import InterfaceDeclaration
from JavaParser.InterfaceDeclarationIf import InterfaceDeclarationIf
from JavaParser.InterfaceMethodDeclaration import InterfaceMethodDeclaration
from JavaParser.JavaPackage import JavaPackage
from JavaParser.JavaPackageIf import JavaPackageIf
from JavaParser.JavaParserContextIf import JavaParserContextIf
from JavaParser.ClassDeclaration import ClassDeclaration
from JavaParser.CompilationUnit import CompilationUnit
from JavaParser.JavaFile import JavaFile
from JavaParser.JavaFileIf import JavaFileIf
from JavaParser.JavaProject import JavaProject
from JavaParser.JavaProjectIf import JavaProjectIf
from JavaParser.ClassMethodDeclaration import ClassMethodDeclaration
from JavaParser.MethodDeclarationIf import MethodDeclarationIf
from JavaParser.antlr.JavaParser import JavaParser


class JavaParserContext(JavaParserContextIf):
    def __init__(self) -> None:
        pass

    def getJavaFile(self) -> JavaFileIf:
        return JavaFile(self)

    def getCompilationUnit(self, compilationUnitContext: JavaParser.CompilationUnitContext) -> CompilationUnitIf:
        return CompilationUnit(compilationUnitContext, self)

    def getClassDeclaration(self, classDeclarationContext: JavaParser.ClassDeclarationContext,
                            javadocContext: JavaParser.JavadocContext, parent: CompilationUnitIf) -> ClassDeclarationIf:
        return ClassDeclaration(classDeclarationContext, javadocContext, parent, self)

    def getInterfaceDeclaration(self, interfaceDeclarationContext: JavaParser.InterfaceDeclarationContext,
                                javadocContext: JavaParser.JavadocContext, parent: CompilationUnitIf) -> InterfaceDeclarationIf:
        return InterfaceDeclaration(interfaceDeclarationContext, javadocContext, parent, self)

    def getCassMethodDeclaration(self, methodDeclarationContext: JavaParser.MethodDeclarationContext, javadocContext: JavaParser.JavadocContext) -> MethodDeclarationIf:
        return ClassMethodDeclaration(methodDeclarationContext, javadocContext, self)

    def getInterfaceMethodDeclaration(self, methodDeclarationContext: JavaParser.InterfaceMethodDeclarationContext, javadocContext: JavaParser.JavadocContext) -> MethodDeclarationIf:
        return InterfaceMethodDeclaration(methodDeclarationContext, javadocContext, self)

    def getJavaProject(self) -> JavaProjectIf:
        return JavaProject(self)

    def getJavaPackage(self, name: str, root: Optional[JavaPackageIf] = None) -> JavaPackageIf:
        return JavaPackage(name, self, root)
