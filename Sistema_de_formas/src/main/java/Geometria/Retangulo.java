package Geometria;

public class Retangulo extends Forma{

    private Double largura;
    private Double altura;


    public Retangulo() {
        largura = 1.00;
        altura = 1.00;
    }

    public Retangulo(Double largura, Double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    @Override
    public Double calcularArea() {
        return largura*altura;
    }

    @Override
    public Double calcularPerimetro() {
        return largura+altura;
    }

    @Override
    public String toString() {
        return "Retangulo" +
                "\nLargura: " + largura +
                "\nAltura: " + altura;
    }
}
