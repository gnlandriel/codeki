package formas;

public class Rectangulo implements ICalculosFormas{
    private double base;
    private double altura;

    public Rectangulo (double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }

    @Override
    public double calcularPerimetro() {
        double perimetro = (base + altura) * 2;
        return perimetro;
    }
}
