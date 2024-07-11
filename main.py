from antlr4 import *
from pprint import pprint
from JavaParser.JavaReader import JavaReader
from JavaParser.JavaListener import JavaListener


def main():

    code = open('helloworld.java', 'r').read()
    reader = JavaReader()
    reader.parse(code)

    print()

    # https://stackoverflow.com/questions/60578638/parsing-javadoc-with-antlr-python


if __name__ == "__main__":
    main()
