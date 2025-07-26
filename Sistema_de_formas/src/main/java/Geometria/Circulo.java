package Geometria;

public class Circulo extends Forma implements iRedimensionavel{

    private Double raio;

    public Circulo(Double raio) {
        this.raio = raio;
    }

    @Override
    public Double calcularArea() {
        return Math.round(((Math.PI * raio)*(Math.PI*raio)) * 100.0) / 100.0;
    }

    @Override
    public Double calcularPerimetro() {
        return Math.round((2*Math.PI*raio) * 100.0) / 100.0;
    }

    @Override
    public void redimensionar(Double fator) {
        raio = fator;
    }

    @Override
    public String toString() {
        return "Circulo " +
                "\nRaio: " + raio;
    }
}
