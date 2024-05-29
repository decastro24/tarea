package cuentas;

public class CCuenta {

    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    public CCuenta() {
    }

    public CCuenta(String nom, String cue, double sal, double tipo) {
        nombre = nom;
        cuenta = cue;
        saldo = sal;
        tipoInterés = tipo;
    }

    public double estado() {
        return saldo;
    }

    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }

    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0)
            throw new Exception("No se puede retirar una cantidad negativa");
        if (estado() < cantidad)
            throw new Exception("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }

    /**
     * Método para retirar dinero de la cuenta.
     *
     * @param cantidad La cantidad de dinero a retirar.
     * @throws Exception Si se intenta retirar una cantidad negativa o si no hay suficiente saldo.
     */
    public void operativaCuenta(double cantidad) {
        try {
            System.out.println("Saldo actual: " + estado());
            retirar(cantidad);
            System.out.println("Retirada realizada. Nuevo saldo: " + estado());
            ingresar(cantidad);
            System.out.println("Ingreso realizado. Nuevo saldo: " + estado());
        } catch (Exception e) {
            System.out.println("Fallo en la operación: " + e.getMessage());
        }
    }
}
