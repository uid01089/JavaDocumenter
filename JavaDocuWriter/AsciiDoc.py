from typing import List
from JavaDocuWriter.AsciiDocIf import AsciiDocIf
from JavaDocuWriter.JavaDocuContextIf import JavaDocuContextIf
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
