class Hamburguesa:
    def servir(self):
        pass

class HamburguesaBBQ(Hamburguesa):
    def servir(self):
        print("Hamburguesa BBQ")

class HamburguesaClasica(Hamburguesa):
    def servir(self):
        print("Hamburguesa clásica")

class RestauranteFactory:
    def crear_hamburguesa(self):
        pass

class RestauranteBBQ(RestauranteFactory):
    def crear_hamburguesa(self):
        return HamburguesaBBQ()
