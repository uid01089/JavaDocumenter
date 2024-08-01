
from pathlib import Path
from Context import Context
from ContextIf import ContextIf


class JavaDocCreator:
    def __init__(self, context: ContextIf) -> None:
        self.context = context
        self.javaProject = context.getJavaProject()
        self.docWriter = context.createDocWriter(self.javaProject)

    def parse(self, direcotry: Path) -> None:
        self.javaProject.addClassPath(direcotry)
        self.javaProject.parse()

        self.docWriter.write(Path("docu.adoc"))


def main():

    context = Context()
    javaDocCreator = JavaDocCreator(context)
    javaDocCreator.parse(Path("./javaModelDb"))

    print()

    # https://stackoverflow.com/questions/60578638/parsing-javadoc-with-antlr-python


if __name__ == "__main__":
    main()
