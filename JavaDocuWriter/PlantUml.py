from typing import Set
from JavaDocuWriter.JavaDocuContextIf import JavaDocuContextIf
from JavaDocuWriter.PlantUmlIf import PlantUmlIf
from JavaParser.ClassDeclarationIf import ClassDeclarationIf
from JavaParser.InterfaceDeclarationIf import InterfaceDeclarationIf
from JavaParser.MethodDeclarationIf import MethodDeclarationIf
from PythonLib.Stream import Stream
from PythonLib.StringUtil import StringUtil


class PlantUml(PlantUmlIf):
    def __init__(self, context: JavaDocuContextIf) -> None:
        self.context = context
        self.pictureNames: Set[str] = set()

    def getMethod(self, methodDeclaration: MethodDeclarationIf) -> str:
        identifier = methodDeclaration.getIdentifier()
        parameterStr = ""
        for param in methodDeclaration.getParameters():
            parameterStr = parameterStr + f"{param.getName()}: {param.getType()}"

        returnType = methodDeclaration.getReturnType()

        return f'{identifier}({parameterStr}):{returnType}'

    def getFullInterface(self, javaInterface: InterfaceDeclarationIf) -> str:

        methods = Stream(javaInterface.getMethods()) \
            .map(lambda method: self.getMethod(method)) \
            .collectToList()

        doc = StringUtil.dedent(f'''
        interface {javaInterface.getShortName()}
        {{
            {"\n".join(methods)}
        }}
        ''')

        return doc

    def getFullClass(self, javaClass: ClassDeclarationIf) -> str:
        methods = Stream(javaClass.getMethods()) \
            .map(lambda method: self.getMethod(method)) \
            .collectToList()

        doc = StringUtil.dedent(f'''
        class {javaClass.getShortName()}
        {{
            {"\n".join(methods)}
        }}
        ''')

        return doc

    def getValidPictureName(self, name: str) -> str:
        if not name in self.pictureNames:
            self.pictureNames.add(name)
            return name
        else:
            i = 0
            while f"name{i}" in self.pictureNames:
                i = i + 1
            self.pictureNames.add(f"name{i}")
            return f"name{i}"
