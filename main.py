
from pathlib import Path
from Context import Context
from ContextIf import ContextIf
import argparse


class JavaDocCreator:
    def __init__(self, context: ContextIf) -> None:
        self.context = context
        self.javaProject = context.createJavaProject()
        self.docWriter = context.createDocWriter(self.javaProject)

    def parse(self, direcotry: Path) -> None:
        self.javaProject.addClassPath(direcotry)
        self.javaProject.parse()

        self.docWriter.write(Path("docu.adoc"))


def main():

    context = Context()

    # Setup argument parser for command-line interface
    parser = argparse.ArgumentParser(description="Document Java Project")
    parser.add_argument("--dir", "-d", help="Path to be documented", type=str, required=True)
    args = parser.parse_args()

    javaDocCreator = JavaDocCreator(context)
    javaDocCreator.parse(Path(args.dir))

    print()

    # https://stackoverflow.com/questions/60578638/parsing-javadoc-with-antlr-python


if __name__ == "__main__":
    main()
