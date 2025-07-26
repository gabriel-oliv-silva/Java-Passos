package br.senai.poo.lista08;

import java.util.ArrayList;
import java.util.List;

public class Instrutor extends Pessoa{

    private String registro;
    private String especializacao;
    private List<Aluno> alunos;

    public Instrutor(String nome, String cpf, String dataNascimento, String especializacao) {
        super(nome, cpf, dataNascimento);
        this.registro = "IN" + cpf.substring(7);
        this.especializacao = especializacao;
        this.alunos = new ArrayList<>();
    }

    public String getRegistro() {
        return registro;
    }

    public String getEspecializacao() {
        return especializacao;
    }

    public void adicionarAluno(Aluno aluno) {
        if (!alunos.contains(aluno)) {
            alunos.add(aluno);
        }
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("-- Instrutor --");
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Data Nascimento: " + dataNascimento);
        System.out.println("Registro: " + registro);
        System.out.println("Especialização: " + especializacao);
        System.out.println("Alunos atribuídos: " + alunos.size());
    }}
