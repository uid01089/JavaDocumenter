from abc import abstractmethod

from JavaParser.ClassOrInterfaceDeclarationIf import ClassOrInterfaceDeclarationIf


class ClassDeclarationIf(ClassOrInterfaceDeclarationIf):

    @abstractmethod
    def getSuperClass(self) -> str:
        pass

    @abstractmethod
    def parse(self) -> None:
        pass
