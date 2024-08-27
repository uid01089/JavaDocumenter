from typing import List, Set
from JavaDocuWriter.JavaDocuContextIf import JavaDocuContextIf
from JavaDocuWriter.PlantUmlIf import PlantUmlIf
from JavaParser.ClassDeclarationIf import ClassDeclarationIf
from JavaParser.ClassOrInterfaceDeclarationIf import ClassOrInterfaceDeclarationIf
from JavaParser.InterfaceDeclarationIf import InterfaceDeclarationIf
from JavaParser.JavaPackageIf import JavaPackageIf
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
        interface "{javaInterface.getShortName()}"
        {{
            {"\n".join(methods)}
        }}
        ''')

        return doc

    def getFullClass(self, javaClass: ClassDeclarationIf) -> str:
        methods = Stream(javaClass.getMethods()) \
            .map(lambda method: self.getMethod(method)) \
            .collectToList()

        fieldStr = ""
        for field in javaClass.getFields():
            for identifier in field.getIdentifiers():
                fieldStr = fieldStr + f'{identifier}:{field.getType()}\n'

        doc = StringUtil.dedent(f'''
        class "{javaClass.getShortName()}"
        {{
            {fieldStr}
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

    def getUsedTypesDiagram(self, javaElement: ClassOrInterfaceDeclarationIf) -> str:

        usedTypes = javaElement.getUsedTypes()
        javaProject = self.context.getJavaProject()

        useString = ""

        match (javaElement):
            case ClassDeclarationIf():
                useString = useString + 'set namespaceSeparator none\n'
                useString = useString + f'class "{javaElement.getShortName()}"\n'
            case InterfaceDeclarationIf():
                useString = useString + 'set namespaceSeparator none\n'
                useString = useString + f'interface "{javaElement.getShortName()}"\n'

        for usedType in usedTypes:
            javaTreeElement = javaProject.getElementByFullQualName(usedType)

            match (javaTreeElement):
                case ClassDeclarationIf():
                    useString = useString + 'set namespaceSeparator none\n'
                    useString = useString + f'class "{javaTreeElement.getShortName()}"\n'
                    useString = useString + f'"{javaElement.getShortName()}" --> "{javaTreeElement.getShortName()}" : use\n'
                case InterfaceDeclarationIf():
                    useString = useString + 'set namespaceSeparator none\n'
                    useString = useString + f'interface "{javaTreeElement.getShortName()}"\n'
                    useString = useString + f'"{javaElement.getShortName()}" --> "{javaTreeElement.getShortName()}" : use\n'
                case _:
                    useString = useString + f'entity "{usedType}"\n'
                    useString = useString + f'"{javaElement.getShortName()}" --> "{usedType}" : use\n'

        doc = StringUtil.dedent(f'''
        [plantuml, "{self.getValidPictureName(javaElement.getFullQualifiedName())}", svg]
        ....
        {useString}
        ....

        ''')

        return doc

    def getSuperInterfaceDiagram(self, javaInterface: InterfaceDeclarationIf) -> str:
        thisInterface = self.getFullInterface(javaInterface)
        thisShortName = javaInterface.getShortName()

        superInterfaces = ""
        for interfaze in javaInterface.getImplementedClasses():
            superInterfaces = superInterfaces + 'set namespaceSeparator none\n'
            superInterfaces = superInterfaces + f'interface "{interfaze}"\n'
            superInterfaces = superInterfaces + f'"{interfaze}" ^-- "{thisShortName}"\n'

        doc = StringUtil.dedent(f'''
        [plantuml, "{self.getValidPictureName(javaInterface.getFullQualifiedName())}", svg]
        ....
        {thisInterface}
        {superInterfaces}
        ....

        ''')

        return doc

    def getSuperClassesDiagram(self, javaClass: ClassDeclarationIf) -> str:
        thisClass = self.getFullClass(javaClass)
        thisShortName = javaClass.getShortName()

        superClass = javaClass.getSuperClass()
        superClassesStr = ""
        if superClass:
            superClassesStr = superClassesStr + 'set namespaceSeparator none\n'
            superClassesStr = superClassesStr + f'class "{superClass}"\n'
            superClassesStr = superClassesStr + f'"{superClass}" ^-- "{thisShortName}"\n'

        implementedInterfaces = ''
        for interfaze in javaClass.getImplementedClasses():
            implementedInterfaces = implementedInterfaces + 'set namespaceSeparator none\n'
            implementedInterfaces = implementedInterfaces + f'interface "{interfaze}"\n'
            implementedInterfaces = implementedInterfaces + f'"{interfaze}" <|.. "{thisShortName}"\n'

        doc = StringUtil.dedent(f'''
        [plantuml, "{self.getValidPictureName(javaClass.getFullQualifiedName())}", svg]
        ....
        {thisClass}
        {superClassesStr}
        {implementedInterfaces}
        ....

        ''')

        return doc

    def getPackageDiagram(self, allClassOrInterfaces: List[ClassOrInterfaceDeclarationIf]) -> str:

        javaElements = ""
        for javaElement in allClassOrInterfaces:
            match javaElement:
                case InterfaceDeclarationIf():
                    javaElements = javaElements + f"interface {javaElement.getFullQualifiedName()} {{}}\n"
                case ClassDeclarationIf():
                    javaElements = javaElements + f"class {javaElement.getFullQualifiedName()} {{}}\n"

        doc = StringUtil.dedent(f'''
        [plantuml, "{self.getValidPictureName("PackageDiagram")}", svg]
        ....
        {javaElements}

        ....

        ''')

        return doc
