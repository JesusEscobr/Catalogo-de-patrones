class Memento:
    def __init__(self, estado):
        self.estado = estado


class Editor:
    def __init__(self):
        self.contenido = ""

    def escribir(self, texto):
        self.contenido = texto

    def guardar(self):
        return Memento(self.contenido)

    def restaurar(self, memento):
        self.contenido = memento.estado
