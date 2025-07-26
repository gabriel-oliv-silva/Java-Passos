package br.senai.poo.lista08;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Principal {

    public static void main(String[] args) {
        Academia academia = new Academia("Fit & Health");

        // 3 instrutores
        Instrutor i1 = new Instrutor("Carlos Silva", "12345678901", "01/01/1980", "Musculação");
        Instrutor i2 = new Instrutor("Ana Souza", "23456789012", "12/05/1985", "Yoga");
        Instrutor i3 = new Instrutor("Marcos Lima", "34567890123", "23/09/1990", "Pilates");
        Instrutor i4 = new Instrutor("Hugo Martins", "45746984135", "14/07/1650", "Hibernação");
        academia.contratarInstrutor(i1);
        academia.contratarInstrutor(i2);
        academia.contratarInstrutor(i3);

        // 5 alunos
        Aluno a1 = new Aluno("Beatriz Costa", "98765432109", "05/06/2000", TipoPlanoEnum.BASICO);
        Aluno a2 = new Aluno("João Pedro", "87654321098", "15/08/1998", TipoPlanoEnum.INTERMEDIARIO);
        Aluno a3 = new Aluno("Mariana Reis", "76543210987", "30/03/2002", TipoPlanoEnum.PREMIUM);
        Aluno a4 = new Aluno("Lucas Rocha", "65432109876", "22/11/1995", TipoPlanoEnum.BASICO);
        Aluno a5 = new Aluno("Sofia Martins", "54321098765", "18/02/1999", TipoPlanoEnum.PREMIUM);
        academia.cadastrarAluno(a1);
        academia.cadastrarAluno(a2);
        academia.cadastrarAluno(a3);
        academia.cadastrarAluno(a4);
        academia.cadastrarAluno(a5);

        // Agendar algumas aulas
        a1.agendarAula("Musculação");
        List<String> duplas = new ArrayList<>();
        duplas.add("Yoga");
        duplas.add("Pilates");
        a2.agendarAula(duplas);
        a3.agendarAula("Natação");
        a4.agendarAula("Hibernação");
        a5.agendarAula(duplas);
        i1.adicionarAluno(a1);
        i2.adicionarAluno(a5);
        i2.adicionarAluno(a2);
        i3.adicionarAluno(a2);
        i3.adicionarAluno(a5);
        i4.adicionarAluno(a4);


        // Exibir instrutores e alunos
        System.out.println("=== Instrutores ===");
        for (Instrutor inst : academia.getInstrutores()) {
            inst.exibirInformacoes();
        }
        System.out.println("=== Alunos ===");
        for (Aluno al : academia.getAlunos()) {
            al.exibirInformacoes();
        }

        // Relatório por plano
        System.out.println("=== Relatório Alunos por Plano ===");
        Map<TipoPlanoEnum, Integer> rel = academia.relatorioAlunosPorPlano();
        System.out.println("BASICO: " + rel.get(TipoPlanoEnum.BASICO));
        System.out.println("INTERMEDIARIO: " + rel.get(TipoPlanoEnum.INTERMEDIARIO));
        System.out.println("PREMIUM: " + rel.get(TipoPlanoEnum.PREMIUM));

        // Total de alunos
        System.out.println("Total de Alunos: " + Aluno.totalAlunos);
    }
}
