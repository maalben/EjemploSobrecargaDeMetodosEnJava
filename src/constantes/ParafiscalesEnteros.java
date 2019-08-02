package constantes;

public enum ParafiscalesEnteros {

    CERO(0),
    NOVECIENTOS(900000);

    private int numero;

    ParafiscalesEnteros(int i) {
        this.numero = i;
    }

    public int getNumero() {
        return numero;
    }
}
