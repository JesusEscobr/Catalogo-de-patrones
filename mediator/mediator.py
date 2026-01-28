class ChatRoom:
    def mostrar(self, usuario, mensaje):
        print(f"[{usuario}]: {mensaje}")


class Usuario:
    def __init__(self, nombre, chat):
        self.nombre = nombre
        self.chat = chat

    def enviar(self, mensaje):
        self.chat.mostrar(self.nombre, mensaje)
