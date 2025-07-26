package br.senai.poo.lista08;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Academia {
    private String nome;
    private List<Instrutor> instrutores;
    private List<Aluno> alunos;
    public static final int capacidadeMaxima = 200;

    public Academia(String nome) {
        this.nome = nome;
        this.instrutores = new ArrayList<>();
        this.alunos = new ArrayList<>();
    }

    public void cadastrarAluno(Aluno aluno) {
        if (alunos.size() >= capacidadeMaxima) {
            System.out.println("Não foi possível cadastrar: capacidade máxima atingida.");
            return;
        }
        alunos.add(aluno);
    }

    public void contratarInstrutor(Instrutor instrutor) {
        instrutores.add(instrutor);
    }

    public Pessoa buscarPessoa(String cpf) {
        for (Aluno a : alunos) {
            if (a.getCpf().equals(cpf)) {
                return a;
            }
        }
        for (Instrutor i : instrutores) {
            if (i.getCpf().equals(cpf)) {
                return i;
            }
        }
        return null;
    }

    public Map<TipoPlanoEnum, Integer> relatorioAlunosPorPlano() {
        Map<TipoPlanoEnum, Integer> rel = new HashMap<>();
        rel.put(TipoPlanoEnum.BASICO, 0);
        rel.put(TipoPlanoEnum.INTERMEDIARIO, 0);
        rel.put(TipoPlanoEnum.PREMIUM, 0);
        for (Aluno a : alunos) {
            TipoPlanoEnum p = a.getTipoPlanoEnum();
            rel.put(p, rel.get(p) + 1);
        }
        return rel;
    }

    public List<Instrutor> getInstrutores() {
        return instrutores;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }}
