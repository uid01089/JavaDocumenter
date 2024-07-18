from JavaDocuWriter.JavaDocuContextIf import JavaDocuContextIf
from JavaDocuWriter.MethodWriterIf import MethodWriterIf
from JavaParser.MethodDeclarationIf import MethodDeclarationIf


class MethodWriter(MethodWriterIf):
    def __init__(self, javaMethod: MethodDeclarationIf, context: JavaDocuContextIf) -> None:
        self.javaMethod = javaMethod

    def getDocu(self) -> str:
        return "MethodWriter"
