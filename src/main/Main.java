package main;

import impuestos.ParafiscalesLogica;
import javax.swing.*;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

import static constantes.ParafiscalesStrings.*;

public class Main {

    public static void main(String[] args){
        DecimalFormatSymbols simbolo=new DecimalFormatSymbols();
        simbolo.setDecimalSeparator('.');
        simbolo.setGroupingSeparator(',');
        DecimalFormat formateador = new DecimalFormat("###,###.##", simbolo);

        ParafiscalesLogica parafiscalesLogica = new ParafiscalesLogica();

        String nombre = JOptionPane.showInputDialog(null,
                SOLICITUD_NOMBRE.getMensaje());
        String salario = JOptionPane.showInputDialog(null,
                SOLICITUD_SALARIO.getMensaje());

        parafiscalesLogica.setNombre(nombre);
        parafiscalesLogica.setSalario(Double.parseDouble(salario));
        JOptionPane.showMessageDialog(null,
                EMPLEADO.getMensaje() + parafiscalesLogica.getNombre() + "\n"+
                SU_SALARIO.getMensaje() + formateador.format(parafiscalesLogica.getSalario()) + "\n"+
                DESCUENTO_PENSIONES.getMensaje() + formateador.format(parafiscalesLogica.calcularPension()) + "\n"+
                DESCUENTO_SALUD.getMensaje() + formateador.format(parafiscalesLogica.calcularSalud()) + "\n"+
                SALARIO_FINAL.getMensaje() + formateador.format(parafiscalesLogica.totalSalario()));
    }
}