package impuestos;

import static constantes.ParafiscalesEnteros.NOVECIENTOS;
import static constantes.ParafiscalesDouble.*;

public class ParafiscalesLogica extends ParafiscalesNombre {

    public double calcularSalud(){
        if(this.getSalario() > NOVECIENTOS.getNumero()){
            return (this.getSalario() * CERO_PUNTO_CUATRO.getDescuento());
        }else{
            return (this.getSalario() * CERO_PUNTO_DOS.getDescuento());
        }
    }

    public double calcularPension(){
        if(this.getSalario() > NOVECIENTOS.getNumero()){
            return (this.getSalario() * CERO_PUNTO_CINCO.getDescuento());
        }else{
            return (this.getSalario() * CERO_PUNTO_TRES.getDescuento());
        }
    }

    public double totalSalario(){
        return (this.getSalario() - (this.calcularSalud() + this.calcularPension()));
    }
}