package br.senai.poo.avaliacao;

public abstract class ItemLoja { //Abstracionismo
    private String nome;

    public ItemLoja(String nome) { //Construtor
        this.nome = nome;
    }

    public String getNome() { //Getter
        return nome;
    }

    public void setNome(String nome) { //Setter
        this.nome = nome;
    }

    public abstract String exibirInformacoes(); //Utilizando método abstrato
}
