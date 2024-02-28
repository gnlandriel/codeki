package operaciones;

import java.util.Scanner;

public class Operacion {
    private double numero1;
    private double numero2;

    public Operacion(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public Operacion() {
    }

    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }

    public void crearOperacion() {
        Scanner ingreso  = new Scanner(System.in);
        System.out.println("Ingrese el primer número");
        numero1 = ingreso.nextDouble();
        System.out.println("Ingrese el segundo número");
        numero2 = ingreso.nextDouble();
    }

    public void sumar() {
        double resultadoSuma = numero1 + numero2;
        System.out.println("El resultado de la suma es: " + resultadoSuma);
    }

    public void restar() {
        double resultadoResta = numero1 - numero2;
        System.out.println("El resultado de la resta es: " + resultadoResta);
    }

    public void multiplicar() {
        double resultadoMultiplicar;
        if (numero2 !=0) {
            resultadoMultiplicar = numero1 * numero2;
        } else{
            resultadoMultiplicar = 0;
            System.out.println("Error!! No se puede multiplicar por cero.");
        }
        System.out.println("El resultado de la multiplicación es: " + resultadoMultiplicar);
    }

    public void dividir() {
        double resultadoDivision;
        if (numero2 !=0) {
            resultadoDivision = numero1 / numero2;
        } else {
            resultadoDivision = 0;
            System.out.println("Error!! No se puede dividir por cero.");
        }
        System.out.println("El resultado de la división es: " + resultadoDivision);
    }
}
