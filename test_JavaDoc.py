from JavaParser.JavaDoc.JavaDoc import JavaDoc
from JavaParser.JavaDoc.JavaDocContext import JavaDocContext
context = JavaDocContext()


def test() -> None:
    javaDocStr = '''/**
* A description text.
*/
'''

    javaDoc = context.createJavaDoc(javaDocStr)
    description = javaDoc.parse().getDescription()
    assert description == 'This is the first line\n a 2nd line\n End of description'


def test1() -> None:
    javaDocStr = '''/**
        * This is the first line
        * a 2nd line
        *
        * End of description */'''

    javaDoc = context.createJavaDoc(javaDocStr)
    description = javaDoc.parse().getDescription()
    assert description == 'This is the first line\n a 2nd line\n End of description'


def test2() -> None:
    javaDocStr = '''/**
    * Ein Hello-World-Programm in Java.
    * Dies ist ein Javadoc-Kommentar.
    *
    * @author John Doe
    * @version 1.0 */'''

    javaDoc = context.createJavaDoc(javaDocStr)
    description = javaDoc.parse().getDescription()
    assert description == 'Ein Hello-World-Programm in Java.\n Dies ist ein Javadoc-Kommentar.'


def test3() -> None:
    javaDocStr = '''/**
     * Eine Methode
     *
     * @param  param1  an absolute URL giving the base location of the image
     * @param  param2 the location of the image, relative to the url argument
     * @return      The reference of the self-class */'''

    javaDoc = context.createJavaDoc(javaDocStr)
    description = javaDoc.parse().getDescription()
    assert description == 'Eine Methode'
