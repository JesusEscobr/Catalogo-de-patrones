package prototype;

public class Contrato implements Cloneable {
    String nombre;
    String fecha;

    public Contrato(String nombre, String fecha) {
        this.nombre = nombre;
        this.fecha = fecha;
    }

    public Contrato clonar() {
        return new Contrato(nombre, fecha);
    }
}
