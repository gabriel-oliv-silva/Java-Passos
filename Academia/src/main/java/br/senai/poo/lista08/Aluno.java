package br.senai.poo.lista08;

import java.util.ArrayList;
import java.util.List;

public class Aluno extends Pessoa {
    private String matricula;
    private TipoPlanoEnum tipoPlanoEnum;
    private List<String> aulasAgendadas;
    public static int totalAlunos = 0;

    public Aluno(String nome, String cpf, String dataNascimento, TipoPlanoEnum tipoPlanoEnum) {
        super(nome, cpf, dataNascimento);
        totalAlunos++;
        this.matricula = "AL" + String.format("%04d", totalAlunos);
        this.tipoPlanoEnum = tipoPlanoEnum;
        this.aulasAgendadas = new ArrayList<>();
    }

    public String getMatricula() {
        return matricula;
    }

    public TipoPlanoEnum getTipoPlanoEnum() {
        return tipoPlanoEnum;
    }

    public void agendarAula(String nomeAula) {
        aulasAgendadas.add(nomeAula);
    }

    public void agendarAula(List<String> aulas) {
        for (String aula : aulas) {
            aulasAgendadas.add(aula);
        }
    }

    public void cancelarAula(String nomeAula) {
        aulasAgendadas.remove(nomeAula);
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("-- Aluno --");
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Data Nascimento: " + dataNascimento);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Plano: " + tipoPlanoEnum);
        System.out.println("Aulas: " + aulasAgendadas);
    }
}
