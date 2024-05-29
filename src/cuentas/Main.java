package cuentas;

public class Main {

    public static void main(String[] args) {
        CCuenta cuenta1; // Cambio de nombre de variable
        double saldoActual;

        cuenta1 = new CCuenta("Antonio López", "1000-2365-85-1230456789", 2500, 0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es: " + saldoActual);

        // Operar con la cuenta utilizando el método operativaCuenta
        cuenta1.operativaCuenta(2300);
        cuenta1.operativaCuenta(695);
    }
}
