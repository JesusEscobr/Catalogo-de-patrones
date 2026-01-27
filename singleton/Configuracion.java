public class Configuracion {

    private static Configuracion instancia;

    private String idioma;

    private Configuracion() {
        idioma = "inglés";
    }

    public static Configuracion getInstancia() {
        if (instancia == null) {
            instancia = new Configuracion();
        }
        return instancia;
    }

    public String getIdioma() {
        return idioma;
    }
}
