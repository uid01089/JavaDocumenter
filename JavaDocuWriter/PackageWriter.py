from JavaDocuWriter.JavaDocuContextIf import JavaDocuContextIf
from JavaDocuWriter.PackageWriterIf import PackageWriterIf
from JavaParser.JavaPackageIf import JavaPackageIf
from PythonLib.StringUtil import StringUtil


class PackageWriter(PackageWriterIf):
    def __init__(self, javaPackage: JavaPackageIf, level: int, context: JavaDocuContextIf) -> None:
        self.javaPackage = javaPackage
        self.level = level
        self.context = context

    def getDocu(self) -> str:
        if self.javaPackage.getName():
            doc = StringUtil.dedent(f'''

            {'=' * self.level} {self.javaPackage.getName()}

            {self.context.getPlantUml().getPackageDiagram(self.javaPackage)}

            ''')
        else:
            doc = ""
        return doc
