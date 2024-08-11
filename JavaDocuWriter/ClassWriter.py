from JavaDocuWriter.ClassWriterIf import ClassWriterIf
from JavaDocuWriter.JavaDocuContextIf import JavaDocuContextIf
from JavaParser.ClassDeclarationIf import ClassDeclarationIf
from PythonLib.StringUtil import StringUtil


class ClassWriter(ClassWriterIf):
    def __init__(self, javaClass: ClassDeclarationIf, context: JavaDocuContextIf) -> None:
        self.javaClass = javaClass
        self.context = context

    def getDocu(self) -> str:
        doc = StringUtil.dedent(f'''

        # Class `{self.javaClass.getShortName()}`

        ## Description
        {self.javaClass.getDescription()}

        ## Super Classes
        {self.__getSuperClassesDiagram()}

        ## Methods
        {self.context.getAsciiDoc().getMethodTable(self.javaClass.getMethods())}



        ''')

        return doc

    def __getSuperClassesDiagram(self) -> str:

        thisClass = self.context.getPlantUml().getFullClass(self.javaClass)
        thisShortName = self.javaClass.getShortName()

        superClass = self.javaClass.getSuperClass()
        superClassesStr = ""
        if superClass:
            superClassesStr = superClassesStr + f"class {superClass}\n"
            superClassesStr = superClassesStr + f"{superClass} ^-- {thisShortName}\n"

        implementedInterfaces = ""
        for interfaze in self.javaClass.getImplementedClasses():
            implementedInterfaces = implementedInterfaces + f"interface {interfaze}\n"
            implementedInterfaces = implementedInterfaces + f"{interfaze} <|.. {thisShortName}\n"

        doc = StringUtil.dedent(f'''
        [plantuml, "{self.context.getPlantUml().getValidPictureName(self.javaClass.getFullQualifiedName())}", svg]
        ....
        {thisClass}
        {superClassesStr}
        {implementedInterfaces}
        ....

        ''')

        return doc
