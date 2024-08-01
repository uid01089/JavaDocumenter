from JavaDocuWriter.InterfaceWriterIf import InterfaceWriterIf
from JavaDocuWriter.JavaDocuContextIf import JavaDocuContextIf
from JavaParser.InterfaceDeclarationIf import InterfaceDeclarationIf


class InterfaceWriter(InterfaceWriterIf):
    def __init__(self, javaInterface: InterfaceDeclarationIf, context: JavaDocuContextIf) -> None:
        self.javaInterface = javaInterface
        self.context = context

    def getDocu(self) -> str:
        doc = f'''

        # Interface {self.javaInterface.getFullQualifiedName()}

        ## Description
        {self.javaInterface.getShortName()}

        ## Superclasses
        {self.javaInterface.getImplementedClasses()}


        '''

        return doc
