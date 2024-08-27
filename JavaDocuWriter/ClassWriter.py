from ContextIf import ContextIf
from JavaDocuWriter.ClassWriterIf import ClassWriterIf
from JavaDocuWriter.JavaDocuContextIf import JavaDocuContextIf
from JavaParser.ClassDeclarationIf import ClassDeclarationIf
from PythonLib.Stream import Stream
from PythonLib.StringUtil import StringUtil


class ClassWriter(ClassWriterIf):
    def __init__(self, javaClass: ClassDeclarationIf, context: JavaDocuContextIf) -> None:
        self.javaClass = javaClass
        self.context: ContextIf = context

    def getDocu(self) -> str:

        superClasses = Stream.of(self.javaClass.getSuperClass()) \
            .map(lambda classStr: self.context.getJavaProject().getElementByFullQualName(classStr)) \
            .collectToList()

        usedTypes = Stream(self.javaClass.getUsedTypes()) \
            .map(lambda classStr: self.context.getJavaProject().getElementByFullQualName(classStr)) \
            .collectToList()

        doc = StringUtil.dedent(f'''

        [[{self.javaClass.getFullQualifiedName()}]]
        == Class `{self.javaClass.getShortName()}`

        === Description

        {self.javaClass.getDescription()}

        === Uml diagram

        {self.context.getPlantUml().getSuperClassesDiagram(self.javaClass)}
        {self.context.getAsciiDoc().getDescriptionTable(superClasses)}

        === Fields

        {self.context.getAsciiDoc().getFieldTable(self.javaClass.getFields())}


        === Methods

        {self.context.getAsciiDoc().getMethodTable(self.javaClass.getMethods())}

        === Uses

        {self.context.getPlantUml().getUsedTypesDiagram(self.javaClass)}
        {self.context.getAsciiDoc().getDescriptionTable(usedTypes)}



        ''')

        return doc
