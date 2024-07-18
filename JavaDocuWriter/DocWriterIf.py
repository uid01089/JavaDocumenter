from abc import ABC, abstractmethod
from pathlib import Path


class DocWriterIf(ABC):

    @abstractmethod
    def write(self, path: Path) -> None:
        pass
