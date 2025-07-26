package Geometria;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList <Forma> formas = new ArrayList<>();

        Circulo circulo = new Circulo(3.5);
        Retangulo retangulo = new Retangulo(2.0,5.0);

        formas.add(circulo);
        formas.add(retangulo);

        for (Forma lista: formas){

            lista.calcularArea();
            lista.calcularPerimetro();

        }

    }
}