class Auto:
    def conducir(self):
        pass

class AutoElectrico(Auto):
    def conducir(self):
        print("Conduciendo auto eléctrico")

class AutoGasolina(Auto):
    def conducir(self):
        print("Conduciendo auto de gasolina")

class AutoFactory:
    @staticmethod
    def crear_auto(tipo):
        if tipo == "electrico":
            return AutoElectrico()
        elif tipo == "gasolina":
            return AutoGasolina()
