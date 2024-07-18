from JavaDocuWriter.JavaDocuContextIf import JavaDocuContextIf
from JavaDocuWriter.PackageWriterIf import PackageWriterIf
from JavaParser.JavaPackageIf import JavaPackageIf


class PackageWriter(PackageWriterIf):
    def __init__(self, javaPackage: JavaPackageIf, context: JavaDocuContextIf) -> None:
        self.javaPackage = javaPackage

    def getDocu(self) -> str:
        return "PackageWriter"
