class Numero:
    def __init__(self, valor):
        self.valor = valor

    def interpretar(self):
        return self.valor


class Suma:
    def __init__(self, izq, der):
        self.izq = izq
        self.der = der

    def interpretar(self):
        return self.izq.interpretar() + self.der.interpretar()
