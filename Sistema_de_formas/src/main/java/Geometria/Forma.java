package Geometria;

public abstract class Forma {

    private String cor;

    public abstract Double calcularArea();

    public abstract Double calcularPerimetro();

    public String getCor() {
        return cor;
    }
}
