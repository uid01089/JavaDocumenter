from pathlib import Path
from JavaDocuWriter.DocWriterIf import DocWriterIf
from JavaDocuWriter.JavaDocuContextIf import JavaDocuContextIf
from JavaParser.ClassDeclarationIf import ClassDeclarationIf
from JavaParser.InterfaceDeclarationIf import InterfaceDeclarationIf
from JavaParser.JavaPackageIf import JavaPackageIf
from JavaParser.JavaProjectIf import JavaProjectIf
from JavaParser.JavaTreeElementIf import JavaTreeElementIf
from PythonLib.StringUtil import StringUtil


class DocWriter(DocWriterIf):
    def __init__(self, javaProject: JavaProjectIf, context: JavaDocuContextIf) -> None:
        self.javaProject = javaProject
        self.context = context

    def write(self, path: Path) -> None:

        document = StringUtil.dedent(f'''
        = The documentation for my Java project

        :toc:

        == Architecture

        === Decompostion

        {self.context.createDecompDiagram(self.javaProject.getRootPackage()).getDocu()}

        === Interfaces

        {self.context.createInterfaceDiagrams(self.javaProject.getRootPackage()).getDocu()}

        == Design

        {self.context.createClassDiagrams(self.javaProject.getRootPackage()).getDocu()}



        ''')

        # document = document + self.__walkDecompostion(self.javaProject.getRootPackage(), 4)
        with open(path, "w", encoding="utf-8") as text_file:
            text_file.write(document)

    def __walkDecompostion(self, javaElement: JavaTreeElementIf, level: int = 1) -> str:

        docuString = ""

        match javaElement:
            case JavaPackageIf():
                docuString = docuString + self.context.createPackageWriter(javaElement, level).getDocu()
            # case InterfaceDeclarationIf():
            #     docuString = docuString + self.context.createInterfaceWriter(javaElement).getDocu()
            # case ClassDeclarationIf():
            #     docuString = docuString + self.context.createClassWriter(javaElement).getDocu()

            case _:
                pass

        # At first dive into tree --> bottom up
        for child in javaElement.getChildren():
            docuString = docuString + self.__walkDecompostion(child, level + 1)

        return docuString
