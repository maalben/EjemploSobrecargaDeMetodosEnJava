package constantes;

public enum ParafiscalesDouble {

    CERO_PUNTO_DOS(0.02),
    CERO_PUNTO_TRES(0.03),
    CERO_PUNTO_CUATRO(0.04),
    CERO_PUNTO_CINCO(0.05);

    private double descuento;

    ParafiscalesDouble(double v) {
        this.descuento = v;
    }

    public double getDescuento() {
        return descuento;
    }
}
