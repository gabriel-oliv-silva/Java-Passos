package Escolinha;

import java.util.ArrayList;

public class CadastroEstudante {

    private final ArrayList<Estudante> listaEstudantes = new ArrayList<>();

    public void adicionarEstudante(Estudante estudante) {
        listaEstudantes.add(estudante);
    }

    public Estudante consultarNome(String nome) {
        for (Estudante estudante : listaEstudantes) {

            if (estudante.getNome().equalsIgnoreCase(nome)) {
                return estudante;
            }
        }
        return null;
    }

    public void listarEstudantes() {

        for (Estudante lista : listaEstudantes) {
     lista.exibirInformacoes();
        }
    }
}
