package formas;

public class Circulo implements ICalculosFormas{
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }
    @Override
    public double calcularArea() {
        double areaCirculo = PI * radio * radio;
        return areaCirculo;

    }

    @Override
    public double calcularPerimetro() {
       double perimetro = 2 * PI * radio;
       return perimetro;
    }
}
