import copy

class Documento:
    def __init__(self, nombre):
        self.valor = nombre

    def clonar(self):
        return copy.copy(self)
