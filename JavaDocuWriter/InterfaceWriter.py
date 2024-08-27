from JavaDocuWriter.InterfaceWriterIf import InterfaceWriterIf
from JavaDocuWriter.JavaDocuContextIf import JavaDocuContextIf
from JavaParser.InterfaceDeclarationIf import InterfaceDeclarationIf
from PythonLib.Stream import Stream
from PythonLib.StringUtil import StringUtil


class InterfaceWriter(InterfaceWriterIf):
    def __init__(self, javaInterface: InterfaceDeclarationIf, context: JavaDocuContextIf) -> None:
        self.javaInterface = javaInterface
        self.context = context

    def getDocu(self) -> str:

        superClasses = Stream(self.javaInterface.getImplementedClasses()) \
            .map(lambda classStr: self.context.getJavaProject().getElementByFullQualName(classStr)) \
            .collectToList()

        usedTypes = Stream(self.javaInterface.getUsedTypes()) \
            .map(lambda classStr: self.context.getJavaProject().getElementByFullQualName(classStr)) \
            .collectToList()

        doc = StringUtil.dedent(f'''

        [[{self.javaInterface.getFullQualifiedName()}]]
        == Interface `{self.javaInterface.getShortName()}`

        === Description

        {self.javaInterface.getDescription()}

        === Uml diagram

        {self.context.getPlantUml().getSuperInterfaceDiagram(self.javaInterface)}
        {self.context.getAsciiDoc().getDescriptionTable(superClasses)}

        === Methods

        {self.context.getAsciiDoc().getMethodTable(self.javaInterface.getMethods())}

        === Uses

        {self.context.getPlantUml().getUsedTypesDiagram(self.javaInterface)}
        {self.context.getAsciiDoc().getDescriptionTable(usedTypes)}

        ''')
        return doc
