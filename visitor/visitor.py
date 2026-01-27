class Empleado:
    def __init__(self, nombre, salario):
        self.nombre = nombre
        self.salario = salario

    def aceptar(self, visitor):
        visitor.visitar(self)


class CalculadoraImpuestos:
    def visitar(self, empleado):
        impuesto = empleado.salario * 0.15
        print(f"Impuesto: {impuesto}")
