class Reporte {
    generar() {
        this.obtenerDatos();
        this.formatear();
    }

    obtenerDatos() {
        console.log("Obteniendo datos...");
    }

    formatear() {}
}

class ReportePDF extends Reporte {
    formatear() {
        console.log("Formato PDF");
    }
}
