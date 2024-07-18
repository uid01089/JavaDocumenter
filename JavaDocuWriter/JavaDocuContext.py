from JavaDocuWriter.ClassWriter import ClassWriter
from JavaDocuWriter.DocWriter import DocWriter
from JavaDocuWriter.DocWriterIf import DocWriterIf
from JavaDocuWriter.InterfaceWriter import InterfaceWriter
from JavaDocuWriter.JavaDocuContextIf import JavaDocuContextIf
from JavaDocuWriter.MethodWriter import MethodWriter
from JavaDocuWriter.PackageWriter import PackageWriter
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
    def createDocWriter(self, javaProject: JavaProjectIf) -> DocWriterIf:
        return DocWriter(javaProject, self)

    def createClassWriter(self, javaClass: ClassDeclarationIf) -> ClassWriterIf:
        return ClassWriter(javaClass, self)

    def createInterfaceWriter(self, javaInterface: InterfaceDeclarationIf) -> InterfaceWriterIf:
        return InterfaceWriter(javaInterface, self)

    def createPackageWriter(self, javaPackage: JavaPackageIf) -> PackageWriterIf:
        return PackageWriter(javaPackage, self)

    def createMethodWriter(self, javaMethod: MethodDeclarationIf) -> MethodWriterIf:
        return MethodWriter(javaMethod, self)
