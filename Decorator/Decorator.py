def decorador(func):
    def envoltura():
        print("Antes"); func(); print("Después")
    return envoltura

@decorador
def saludar(): print("Hola!")
