from antlr4 import *
from grammer.JavaLexer import JavaLexer
from  grammer.JavaParser import JavaParser
from  grammer.JavaParserListener import JavaParserListener



def main():

    code = open('helloworld.java', 'r').read()
    codeStream = InputStream(code)
    

    lexer = JavaLexer(codeStream)
    stream = CommonTokenStream(lexer)
    parser = JavaParser(stream)

    tree = parser.compilationUnit()

    print(tree.toStringTree(recog=parser))

    walker = ParseTreeWalker()
    walker.walk(JavaParserListener(), tree)

if __name__=="__main__":
    main()