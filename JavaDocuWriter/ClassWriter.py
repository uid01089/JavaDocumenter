from ContextIf import ContextIf
from JavaDocuWriter.ClassWriterIf import ClassWriterIf
from JavaDocuWriter.JavaDocuContextIf import JavaDocuContextIf
from JavaParser.ClassDeclarationIf import ClassDeclarationIf
from JavaParser.InterfaceDeclarationIf import InterfaceDeclarationIf
from PythonLib.StringUtil import StringUtil


class ClassWriter(ClassWriterIf):
    def __init__(self, javaClass: ClassDeclarationIf, context: JavaDocuContextIf) -> None:
        self.javaClass = javaClass
        self.context: ContextIf = context

    def getDocu(self) -> str:
        doc = StringUtil.dedent(f'''

        # Class `{self.javaClass.getShortName()}`

        ## Description

        {self.javaClass.getDescription()}

        ## Super Classes

        {self.context.getPlantUml().getSuperClassesDiagram(self.javaClass)}

        ## Methods

        {self.context.getAsciiDoc().getMethodTable(self.javaClass.getMethods())}

        ## Uses

        {self.context.getPlantUml().getUsedTypesDiagram(self.javaClass)}



        ''')

        return doc
