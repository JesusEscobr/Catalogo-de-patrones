class Empleado {
    constructor(nombre, salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    aceptar(visitor) {
        visitor.visitar(this);
    }
}

class CalculadoraImpuestos {
    visitar(empleado) {
        const impuesto = empleado.salario * 0.15;
        console.log(`Impuesto: ${impuesto}`);
    }
}
