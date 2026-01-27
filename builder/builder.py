class Computadora:
    def __init__(self):
        self.partes = []

    def agregar(self, parte):
        self.partes.append(parte)

class Builder:
    def construir(self):
        pass

class BuilderPC(Builder):
    def construir(self):
        pc = Computadora()
        pc.agregar("CPU")
        pc.agregar("RAM")
        return pc
