class Componente: pass
class Hoja(Componente): pass
class Compuesto(Componente):
    def __init__(self): self.hijos = []