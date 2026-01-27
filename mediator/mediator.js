class ChatRoom {
    mostrar(usuario, mensaje) {
        console.log(`[${usuario}]: ${mensaje}`);
    }
}

class Usuario {
    constructor(nombre, chat) {
        this.nombre = nombre;
        this.chat = chat;
    }

    enviar(mensaje) {
        this.chat.mostrar(this.nombre, mensaje);
    }
}
