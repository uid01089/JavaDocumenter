from JavaDocuWriter.AsciiDoc import AsciiDoc
from JavaDocuWriter.AsciiDocIf import AsciiDocIf
from JavaDocuWriter.ClassDiagrams import ClassDiagrams
from JavaDocuWriter.ClassDiagramsIf import ClassDiagramsIf
from JavaDocuWriter.ClassWriter import ClassWriter
from JavaDocuWriter.DecompDiagram import DecompDiagram
from JavaDocuWriter.DecompDiagramIf import DecompDiagramIf
from JavaDocuWriter.DocWriter import DocWriter
from JavaDocuWriter.DocWriterIf import DocWriterIf
from JavaDocuWriter.InterfaceDiagrams import InterfaceDiagrams
from JavaDocuWriter.InterfaceDiagramsIf import InterfaceDiagramsIf
from JavaDocuWriter.InterfaceWriter import InterfaceWriter
from JavaDocuWriter.JavaDocuContextIf import JavaDocuContextIf
from JavaDocuWriter.MethodWriter import MethodWriter
from JavaDocuWriter.PackageWriter import PackageWriter
from JavaDocuWriter.PlantUml import PlantUml
from JavaDocuWriter.PlantUmlIf import PlantUmlIf
from JavaParser.JavaProjectIf import JavaProjectIf


from JavaDocuWriter.ClassWriterIf import ClassWriterIf
from JavaDocuWriter.InterfaceWriterIf import InterfaceWriterIf
from JavaDocuWriter.MethodWriterIf import MethodWriterIf
from JavaDocuWriter.PackageWriterIf import PackageWriterIf
from JavaParser.ClassDeclarationIf import ClassDeclarationIf
from JavaParser.InterfaceDeclarationIf import InterfaceDeclarationIf
from JavaParser.JavaPackageIf import JavaPackageIf
from JavaParser.MethodDeclarationIf import MethodDeclarationIf


class JavaDocuContext(JavaDocuContextIf):

    def __init__(self) -> None:
        self.plantUml = PlantUml(self)
        self.asciiDoc = AsciiDoc(self)

    def createDocWriter(self, javaProject: JavaProjectIf) -> DocWriterIf:
        return DocWriter(javaProject, self)

    def createClassWriter(self, javaClass: ClassDeclarationIf) -> ClassWriterIf:
        return ClassWriter(javaClass, self)

    def createInterfaceWriter(self, javaInterface: InterfaceDeclarationIf) -> InterfaceWriterIf:
        return InterfaceWriter(javaInterface, self)

    def createPackageWriter(self, javaPackage: JavaPackageIf, level: int) -> PackageWriterIf:
        return PackageWriter(javaPackage, level, self)

    def createMethodWriter(self, javaMethod: MethodDeclarationIf) -> MethodWriterIf:
        return MethodWriter(javaMethod, self)

    def getPlantUml(self) -> PlantUmlIf:
        return self.plantUml

    def getAsciiDoc(self) -> AsciiDocIf:
        return self.asciiDoc

    def createDecompDiagram(self, rootPackage: JavaPackageIf) -> DecompDiagramIf:
        return DecompDiagram(rootPackage, self)

    def createInterfaceDiagrams(self, rootPackage: JavaPackageIf) -> InterfaceDiagramsIf:
        return InterfaceDiagrams(rootPackage, self)

    def createClassDiagrams(self, rootPackage: JavaPackageIf) -> ClassDiagramsIf:
        return ClassDiagrams(rootPackage, self)
