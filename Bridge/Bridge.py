class Color: pass
class Rojo(Color): pass

class Forma:
    def __init__(self, color): self.color = color

circulo_rojo = Forma(Rojo())