class Real:
    def ejecutar(self): print("Ejecutando...")

class Proxy:
    def __init__(self, real): self.real = real
    def ejecutar(self):
        print("Validando acceso"); self.real.ejecutar()