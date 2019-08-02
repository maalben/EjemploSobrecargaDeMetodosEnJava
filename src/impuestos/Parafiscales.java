package impuestos;

import static constantes.ParafiscalesEnteros.CERO;

public class Parafiscales {

    private double salario;

    public Parafiscales(double salario) {
        this.salario = salario;
    }

    public Parafiscales() {
        this.salario = CERO.getNumero();
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
