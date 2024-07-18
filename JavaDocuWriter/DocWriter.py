from pathlib import Path
from JavaDocuWriter.DocWriterIf import DocWriterIf
from JavaDocuWriter.JavaDocuContextIf import JavaDocuContextIf
from JavaParser.ClassDeclarationIf import ClassDeclarationIf
from JavaParser.InterfaceDeclarationIf import InterfaceDeclarationIf
from JavaParser.JavaPackageIf import JavaPackageIf
from JavaParser.JavaProjectIf import JavaProjectIf
from JavaParser.JavaTreeElementIf import JavaTreeElementIf


class DocWriter(DocWriterIf):
    def __init__(self, javaProject: JavaProjectIf, context: JavaDocuContextIf) -> None:
        self.javaProject = javaProject
        self.context = context

    def write(self, path: Path) -> None:
        documentationpath = self.__walk(self.javaProject.getRootPackage(), 0)
        with open(path, "w", encoding="utf-8") as text_file:
            text_file.write(documentationpath)

    def __walk(self, javaElement: JavaTreeElementIf, level: int = 0) -> str:

        docuString = ""

        # At first dive into tree --> bottom up
        for child in javaElement.getChildren():
            docuString = docuString + self.__walk(child, level + 1)

        match javaElement:
            case JavaPackageIf():
                docuString = docuString + self.context.createPackageWriter(javaElement).getDocu()
            case InterfaceDeclarationIf():
                docuString = docuString + self.context.createInterfaceWriter(javaElement).getDocu()
            case ClassDeclarationIf():
                docuString = docuString + self.context.createClassWriter(javaElement).getDocu()

            case _:
                pass

        return docuString
