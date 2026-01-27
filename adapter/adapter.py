class Pago:
    def pagar(self, monto):
        pass
    
class PagoExterno:
    def realizar_pago(self, cantidad):
        print(f"Pagando ${cantidad} con un sistema externo")

class PagoAdapter(Pago):
    def __init__(self, pago_externo):
        self.pago_externo = pago_externo

    def pagar(self, monto):
        self.pago_externo.realizar_pago(monto)
