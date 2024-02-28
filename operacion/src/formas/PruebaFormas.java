package formas;

public class PruebaFormas {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(15);
        System.out.println("El area del circulo es: " + circulo.calcularArea());
        System.out.println("El perimetro del circulo es: " + circulo.calcularPerimetro());

        Rectangulo rectangulo = new Rectangulo(10, 20);
        System.out.println("El area del rectangulo es: " + rectangulo.calcularArea());
        System.out.println("El perimetro del rectangulo es: " + rectangulo.calcularPerimetro());

    }
}
