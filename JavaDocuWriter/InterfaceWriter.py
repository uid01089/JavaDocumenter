from JavaDocuWriter.InterfaceWriterIf import InterfaceWriterIf
from JavaDocuWriter.JavaDocuContextIf import JavaDocuContextIf
from JavaParser.InterfaceDeclarationIf import InterfaceDeclarationIf
from PythonLib.StringUtil import StringUtil


class InterfaceWriter(InterfaceWriterIf):
    def __init__(self, javaInterface: InterfaceDeclarationIf, context: JavaDocuContextIf) -> None:
        self.javaInterface = javaInterface
        self.context = context

    def getDocu(self) -> str:
        doc = StringUtil.dedent(f'''

        # Interface `{self.javaInterface.getShortName()}`

        ## Description

        {self.javaInterface.getDescription()}

        ## Super interfaces

        {self.context.getPlantUml().getSuperInterfaceDiagram(self.javaInterface)}

        ## Methods

        {self.context.getAsciiDoc().getMethodTable(self.javaInterface.getMethods())}



        ''')
        return doc
