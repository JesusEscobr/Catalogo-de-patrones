class Memento {
    constructor(estado) {
        this.estado = estado;
    }
}

class Editor {
    constructor() {
        this.contenido = "";
    }

    escribir(texto) {
        this.contenido = texto;
    }

    guardar() {
        return new Memento(this.contenido);
    }

    restaurar(memento) {
        this.contenido = memento.estado;
    }
}
