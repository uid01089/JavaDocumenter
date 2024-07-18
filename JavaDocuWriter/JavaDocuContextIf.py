from abc import ABC, abstractmethod

from JavaDocuWriter.ClassWriterIf import ClassWriterIf
from JavaDocuWriter.DocWriterIf import DocWriterIf
from JavaDocuWriter.InterfaceWriterIf import InterfaceWriterIf
from JavaDocuWriter.MethodWriterIf import MethodWriterIf
from JavaDocuWriter.PackageWriterIf import PackageWriterIf
from JavaParser.ClassDeclarationIf import ClassDeclarationIf
from JavaParser.InterfaceDeclarationIf import InterfaceDeclarationIf
from JavaParser.JavaPackageIf import JavaPackageIf
from JavaParser.JavaProjectIf import JavaProjectIf
from JavaParser.MethodDeclarationIf import MethodDeclarationIf


class JavaDocuContextIf(ABC):
    @abstractmethod
    def createDocWriter(self, javaProject: JavaProjectIf) -> DocWriterIf:
        pass

    @abstractmethod
    def createClassWriter(self, javaClass: ClassDeclarationIf) -> ClassWriterIf:
        pass

    @abstractmethod
    def createInterfaceWriter(self, javaInterface: InterfaceDeclarationIf) -> InterfaceWriterIf:
        pass

    @abstractmethod
    def createPackageWriter(self, javaPackage: JavaPackageIf) -> PackageWriterIf:
        pass

    @abstractmethod
    def createMethodWriter(self, javaMethod: MethodDeclarationIf) -> MethodWriterIf:
        pass
