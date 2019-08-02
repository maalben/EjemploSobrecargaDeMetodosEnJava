package constantes;

public enum ParafiscalesStrings {

    SOLICITUD_NOMBRE("Ingresa el nombre del empleado: "),
    SOLICITUD_SALARIO("Ingresa el salario del empleado: "),
    EMPLEADO("Empleado: "),
    SU_SALARIO("Su salario base es: $"),
    DESCUENTO_PENSIONES("Su descuento de Pensiones es $"),
    DESCUENTO_SALUD("Su descuento de Salud es $"),
    SALARIO_FINAL("Su salario final es de $");

    private String mensaje;

    ParafiscalesStrings(String s) {
        this.mensaje = s;
    }

    public String getMensaje() {
        return mensaje;
    }
}
