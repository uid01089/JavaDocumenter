from typing import List
from JavaDocuWriter.DecompDiagramIf import DecompDiagramIf
from JavaDocuWriter.JavaDocuContextIf import JavaDocuContextIf
from JavaParser.ClassOrInterfaceDeclarationIf import ClassOrInterfaceDeclarationIf
from JavaParser.JavaPackageIf import JavaPackageIf
from PythonLib.StringUtil import StringUtil
from PythonLib.TreeStream import TreeElement, TreeStream


class DecompDiagram(DecompDiagramIf):
    def __init__(self, rootPackage: JavaPackageIf, context: JavaDocuContextIf) -> None:
        self.rootPackage = rootPackage
        self.context = context

    def getDocu(self) -> str:

        treeElement = TreeElement(self.rootPackage, "getChildren")
        allClassOrInterfaces: List[ClassOrInterfaceDeclarationIf] = TreeStream(treeElement) \
            .toStream() \
            .filter(lambda element: isinstance(element, ClassOrInterfaceDeclarationIf)) \
            .collectToList()

        doc = StringUtil.dedent(f'''

        {self.context.getPlantUml().getPackageDiagram(allClassOrInterfaces)}

        {self.context.getAsciiDoc().getJaveClassOrInterfaceTable(allClassOrInterfaces)}

        ''')

        return doc
