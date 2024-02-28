package cuenta;

import java.util.Scanner;

public class Cuenta {
    private int numeroCuenta;
    private long dni;
    private double saldoActual;

    public Cuenta(int numeroCuenta, long dni, double saldoActual) {
        this.numeroCuenta = numeroCuenta;
        this.dni = dni;
        this.saldoActual = saldoActual;
    }

    public Cuenta() {
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }


    public void crearCuenta() {
        Scanner ingreso = new Scanner(System.in);
        System.out.println("Ingrese número de cuenta: ");
        numeroCuenta = ingreso.nextInt();
        System.out.println("Ingrese DNI: ");
        dni = ingreso.nextLong();
        System.out.println("Ingrese saldo actual: ");
        saldoActual = ingreso.nextDouble();
    }

    public void ingresar(double ingreso) {
        saldoActual += ingreso;
        System.out.println("Deposito realizado con exito!! Su saldo actual es: $" + saldoActual);
    }

    public void retirar(double retiro) {
        if (saldoActual >= retiro) {
            saldoActual -= retiro;
            System.out.println("Retiro realizado con exito!! Su saldo actual es: $" + saldoActual);
        } else {
            saldoActual = 0;
            System.out.println("No se pudo realizar la extracción. Su saldo es " + saldoActual);
        }
    }

    public void extraccionRapida(double extraer) {
        double extraccionMaxima = saldoActual * 0.20;
        if(extraccionMaxima < extraer) {
            System.out.println("No se pudo realizar la extracción rápida. Excede el limite máximo de retiro de: $ " + extraccionMaxima);
        } else {
            saldoActual -= extraer;
            System.out.println("Retiro rápido realizado con exito!! Su saldo actual es: $ " + saldoActual);
        }
    }

    public void consultarSaldo() {
        System.out.println("Su saldo actual es: $ " + getSaldoActual());
    }

    public void consultarDatos() {
        System.out.println("Número de cuenta bancaria: " + getNumeroCuenta());
        System.out.println("DNI: " + getDni());
        System.out.println("Saldo disponible: $ " + getSaldoActual());
    }
}
