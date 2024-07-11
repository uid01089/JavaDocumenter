#! /bin/bin

java -jar antlr-4.13.1-complete.jar -Dlanguage=Python3 -lib *.g4 JavaLexer.g4
java -jar antlr-4.13.1-complete.jar -Dlanguage=Python3 -lib *.g4 JavadocLexer.g4