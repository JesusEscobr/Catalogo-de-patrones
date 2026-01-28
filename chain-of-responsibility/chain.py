class Aprobador:
    def __init__(self, nombre, limite, siguiente=None):
        self.nombre = nombre
        self.limite = limite
        self.siguiente = siguiente

    def aprobar(self, monto):
        if monto <= self.limite:
            print(f"{self.nombre} aprueba")
        elif self.siguiente:
            self.siguiente.aprobar(monto)
