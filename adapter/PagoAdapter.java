package adapter;

interface Pago {
    void pagar(double monto);
}

class PagoExterno {
    public void realizarPago(double cantidad) {
        System.out.println("Pagando $" + cantidad + " con sistema externo");
    }
}

public class PagoAdapter implements Pago {

    private PagoExterno pagoExterno;

    public PagoAdapter(PagoExterno pagoExterno) {
        this.pagoExterno = pagoExterno;
    }

    @Override
    public void pagar(double monto) {
        pagoExterno.realizarPago(monto);
    }
}
