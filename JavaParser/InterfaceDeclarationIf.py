from abc import abstractmethod

from JavaParser.ClassOrInterfaceDeclarationIf import ClassOrInterfaceDeclarationIf


class InterfaceDeclarationIf(ClassOrInterfaceDeclarationIf):

    @abstractmethod
    def parse(self) -> None:
        pass
