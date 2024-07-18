from JavaDocuWriter.ClassWriterIf import ClassWriterIf
from JavaDocuWriter.JavaDocuContextIf import JavaDocuContextIf
from JavaParser.ClassDeclarationIf import ClassDeclarationIf


class ClassWriter(ClassWriterIf):
    def __init__(self, javaClass: ClassDeclarationIf, context: JavaDocuContextIf) -> None:
        self.javaClass = javaClass

    def getDocu(self) -> str:
        return "ClassWriter"
