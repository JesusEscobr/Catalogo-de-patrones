interface Pizza {
    void preparar();
}


class PizzaQueso implements Pizza {
    public void preparar() {
        System.out.println("Preparando pizza de queso");
    }
}

class PizzaPepperoni implements Pizza {
    public void preparar() {
        System.out.println("Preparando pizza de pepperoni");
    }
}

class PizzaFactory {
    public static Pizza crearPizza(String tipo) {
        if (tipo.equals("queso")) {
            return new PizzaQueso();
        } else if (tipo.equals("pepperoni")) {
            return new PizzaPepperoni();
        }
        return null;
    }
}


