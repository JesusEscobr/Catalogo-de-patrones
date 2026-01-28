class Numero {
    constructor(valor) {
        this.valor = valor;
    }

    interpretar() {
        return this.valor;
    }
}

class Suma {
    constructor(izq, der) {
        this.izq = izq;
        this.der = der;
    }

    interpretar() {
        return this.izq.interpretar() + this.der.interpretar();
    }
}
