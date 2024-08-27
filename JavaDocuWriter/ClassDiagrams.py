from typing import List
from JavaDocuWriter.JavaDocuContextIf import JavaDocuContextIf
from JavaDocuWriter.ClassDiagramsIf import ClassDiagramsIf
from JavaParser.ClassDeclarationIf import ClassDeclarationIf
from JavaParser.JavaPackageIf import JavaPackageIf
from PythonLib.TreeStream import TreeElement, TreeStream


class ClassDiagrams(ClassDiagramsIf):
    def __init__(self, rootPackage: JavaPackageIf, context: JavaDocuContextIf) -> None:
        self.rootPackage = rootPackage
        self.context = context

    def getDocu(self) -> str:

        treeElement = TreeElement(self.rootPackage, "getChildren")
        allClasses: List[ClassDeclarationIf] = TreeStream(treeElement) \
            .toStream() \
            .filter(lambda element: isinstance(element, ClassDeclarationIf)) \
            .collectToList()

        classString = ""
        for clazz in allClasses:
            classString = classString + self.context.createClassWriter(clazz).getDocu()

        return classString
