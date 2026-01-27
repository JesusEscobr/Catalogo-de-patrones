class CPU: def encender(self): pass
class Disco: def leer(self): pass

class ComputadoraFacade:
    def iniciar(self):
        CPU().encender()
        Disco().leer()