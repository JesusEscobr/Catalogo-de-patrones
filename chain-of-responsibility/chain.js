class Aprobador {
    constructor(nombre, limite, siguiente = null) {
        this.nombre = nombre;
        this.limite = limite;
        this.siguiente = siguiente;
    }

    aprobar(monto) {
        if (monto <= this.limite) {
            console.log(`${this.nombre} aprueba`);
        } else if (this.siguiente) {
            this.siguiente.aprobar(monto);
        }
    }
}
