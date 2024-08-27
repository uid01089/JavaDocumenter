from typing import List
from JavaDocuWriter.AsciiDocIf import AsciiDocIf
from JavaDocuWriter.JavaDocuContextIf import JavaDocuContextIf
from JavaParser.ClassDeclarationIf import ClassDeclarationIf
from JavaParser.ClassOrInterfaceDeclarationIf import ClassOrInterfaceDeclarationIf
from JavaParser.FieldDeclarationIf import FieldDeclarationIf
from JavaParser.InterfaceDeclarationIf import InterfaceDeclarationIf
from JavaParser.MethodDeclarationIf import MethodDeclarationIf


class AsciiDoc(AsciiDocIf):
    def __init__(self, context: JavaDocuContextIf) -> None:
        self.context = context

    def getMethodTable(self, methods: List[MethodDeclarationIf]) -> str:
        doc = ""
        for method in methods:

            doc = doc + f"#### Method: {method.getIdentifier()}\n\n"
            doc = doc + '[cols="s,a,a"]\n'
            doc = doc + '|===\n'
            doc = doc + "|Code 2+| \n"
            doc = doc + f'''
                    [source,java]
                    ----
                    {method.getJavaCodeMethodDeclaration()}
                    ----
                    '''
            doc = doc + f"|Description 2+|{method.getDescription()}\n"
            doc = doc + f"|Return|{method.getReturnType()}|{method.getReturnDescription()}\n"

            for parameter in method.getParameters():
                doc = doc + f"|{parameter.getName()}|{parameter.getType()}|{parameter.getDescription()}\n"
            doc = doc + '|===\n\n'

        return doc

    def getFieldTable(self, fields: List[FieldDeclarationIf]) -> str:
        doc = ""
        doc = doc + '[cols="a,a,a"]\n'
        doc = doc + '|===\n'
        doc = doc + '|Name|Type|Description\n\n'

        for field in fields:
            for identifier in field.getIdentifiers():
                doc = doc + f'| {identifier} | {field.getType()} | {field.getDescription()}\n'

        doc = doc + '|===\n\n'

        return doc

    def getJaveClassOrInterfaceTable(self, classOrInterfaces: List[ClassOrInterfaceDeclarationIf]) -> str:
        doc = ""
        doc = doc + '[cols="a,a"]\n'
        doc = doc + '|===\n'
        doc = doc + '|Type|Name\n\n'

        for classOrInterface in classOrInterfaces:

            match classOrInterface:
                case InterfaceDeclarationIf():
                    doc = doc + f"| interface | <<{classOrInterface.getFullQualifiedName()},{classOrInterface.getFullQualifiedName()}>>\n"
                case ClassDeclarationIf():
                    doc = doc + f"| class | <<{classOrInterface.getFullQualifiedName()},{classOrInterface.getFullQualifiedName()}>>\n"

        doc = doc + '|===\n\n'

        return doc

    def getDescriptionTable(self, classOrInterfaces: List[ClassOrInterfaceDeclarationIf]) -> str:
        doc = ""

        if classOrInterfaces:

            doc = doc + '[cols="a,a"]\n'
            doc = doc + '|===\n'
            doc = doc + '|Name | Description \n\n'

            for classOrInterface in classOrInterfaces:
                doc = doc + f"| <<{classOrInterface.getFullQualifiedName()},{classOrInterface.getFullQualifiedName()}>> | {classOrInterface.getDescription()}\n"

            doc = doc + '|===\n\n'

        return doc
