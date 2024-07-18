from JavaDocuWriter.InterfaceWriterIf import InterfaceWriterIf
from JavaDocuWriter.JavaDocuContextIf import JavaDocuContextIf
from JavaParser.InterfaceDeclarationIf import InterfaceDeclarationIf


class InterfaceWriter(InterfaceWriterIf):
    def __init__(self, javaInterface: InterfaceDeclarationIf, context: JavaDocuContextIf) -> None:
        self.javaInterface = javaInterface

    def getDocu(self) -> str:
        return "InterfaceWriter"
