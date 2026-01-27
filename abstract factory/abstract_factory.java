interface Silla {
    void sentarse();
}


class SillaMadera implements Silla {
    public void sentarse() {
        System.out.println("Silla de madera");
    }
}

interface FabricaMuebles {
    Silla crearSilla();
}


class FabricaModerna implements FabricaMuebles {
    public Silla crearSilla() {
        return new SillaMadera();
    }
}

