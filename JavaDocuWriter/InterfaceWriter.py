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
        {self.__getSuperInterfacesDiagram()}

        ## Methods
        {self.context.getAsciiDoc().getMethodTable(self.javaInterface.getMethods())}



        ''')
        return doc

    def __getSuperInterfacesDiagram(self) -> str:

        thisInterface = self.context.getPlantUml().getFullInterface(self.javaInterface)
        thisShortName = self.javaInterface.getShortName()

        superInterfaces = ""
        for interfaze in self.javaInterface.getImplementedClasses():
            superInterfaces = superInterfaces + f"interface {interfaze}\n"
            superInterfaces = superInterfaces + f"{interfaze} ^-- {thisShortName}\n"

        doc = StringUtil.dedent(f'''
        [plantuml, "{self.context.getPlantUml().getValidPictureName(self.javaInterface.getFullQualifiedName())}", svg]
        ....
        {thisInterface}
        {superInterfaces}
        ....

        ''')

        return doc
