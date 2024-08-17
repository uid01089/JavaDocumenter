from typing import Optional
from JavaParser.ClassDeclarationIf import ClassDeclarationIf
from JavaParser.CompilationUnitIf import CompilationUnitIf
from JavaParser.InterfaceDeclaration import InterfaceDeclaration
from JavaParser.InterfaceDeclarationIf import InterfaceDeclarationIf
from JavaParser.InterfaceMethodDeclaration import InterfaceMethodDeclaration
from JavaParser.JavaDoc.JavaDocContext import JavaDocContext
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
from JavaParser.JavaTreeElementIf import JavaTreeElementIf
from JavaParser.MethodDeclarationIf import MethodDeclarationIf
from JavaParser.antlr.JavaParser import JavaParser


class JavaParserContext(JavaDocContext, JavaParserContextIf):
    def __init__(self) -> None:
        JavaDocContext.__init__(self)

        self.javaProject: JavaProjectIf = None

    def createJavaFile(self, parent: JavaTreeElementIf) -> JavaFileIf:
        return JavaFile(parent, self)

    def createCompilationUnit(self, compilationUnitContext: JavaParser.CompilationUnitContext, parent: JavaTreeElementIf) -> CompilationUnitIf:
        return CompilationUnit(compilationUnitContext, parent, self)

    def createClassDeclaration(self, classDeclarationContext: JavaParser.ClassDeclarationContext,
                               javadocContext: JavaParser.JavadocContext, parent: JavaTreeElementIf) -> ClassDeclarationIf:
        return ClassDeclaration(classDeclarationContext, javadocContext, parent, self)

    def createInterfaceDeclaration(self, interfaceDeclarationContext: JavaParser.InterfaceDeclarationContext,
                                   javadocContext: JavaParser.JavadocContext, parent: JavaTreeElementIf) -> InterfaceDeclarationIf:
        return InterfaceDeclaration(interfaceDeclarationContext, javadocContext, parent, self)

    def createCassMethodDeclaration(self, methodDeclarationContext: JavaParser.MethodDeclarationContext, javadocContext: JavaParser.JavadocContext, parent: JavaTreeElementIf) -> MethodDeclarationIf:
        return ClassMethodDeclaration(methodDeclarationContext, javadocContext, parent, self)

    def createInterfaceMethodDeclaration(self, methodDeclarationContext: JavaParser.InterfaceMethodDeclarationContext, javadocContext: JavaParser.JavadocContext, parent: JavaTreeElementIf) -> MethodDeclarationIf:
        return InterfaceMethodDeclaration(methodDeclarationContext, javadocContext, parent, self)

    def createJavaProject(self) -> JavaProjectIf:
        self.javaProject = JavaProject(self)
        return self.javaProject

    def getJavaProject(self) -> JavaProjectIf:
        return self.javaProject

    def createJavaPackage(self, name: str, root: Optional[JavaPackageIf] = None) -> JavaPackageIf:
        return JavaPackage(name, self, root)
