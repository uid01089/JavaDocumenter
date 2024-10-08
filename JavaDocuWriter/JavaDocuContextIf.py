from abc import ABC, abstractmethod

from JavaDocuWriter import ClassDiagramsIf
from JavaDocuWriter.AsciiDocIf import AsciiDocIf
from JavaDocuWriter.ClassWriterIf import ClassWriterIf
from JavaDocuWriter.DecompDiagramIf import DecompDiagramIf
from JavaDocuWriter.DocWriterIf import DocWriterIf
from JavaDocuWriter.InterfaceDiagramsIf import InterfaceDiagramsIf
from JavaDocuWriter.InterfaceWriterIf import InterfaceWriterIf
from JavaDocuWriter.MethodWriterIf import MethodWriterIf
from JavaDocuWriter.PackageWriterIf import PackageWriterIf
from JavaDocuWriter.PlantUmlIf import PlantUmlIf
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
    def createPackageWriter(self, javaPackage: JavaPackageIf, level: int) -> PackageWriterIf:
        pass

    @abstractmethod
    def createMethodWriter(self, javaMethod: MethodDeclarationIf) -> MethodWriterIf:
        pass

    @abstractmethod
    def getPlantUml(self) -> PlantUmlIf:
        pass

    @abstractmethod
    def getAsciiDoc(self) -> AsciiDocIf:
        pass

    @abstractmethod
    def createDecompDiagram(self, rootPackage: JavaPackageIf) -> DecompDiagramIf:
        pass

    @abstractmethod
    def createInterfaceDiagrams(self, rootPackage: JavaPackageIf) -> InterfaceDiagramsIf:
        pass

    @abstractmethod
    def createClassDiagrams(self, rootPackage: JavaPackageIf) -> ClassDiagramsIf:
        pass
