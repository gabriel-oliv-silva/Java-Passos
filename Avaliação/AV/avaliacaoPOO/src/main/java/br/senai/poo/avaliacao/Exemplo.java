package br.senai.poo.avaliacao;

public class Exemplo { // Classe main pública para teste

    public static void main(String[] args) { // criando o teste executável no console

        Loja RicardoElectro = new Loja(); //Criando a loja

        RicardoElectro.adicionarProduto(new Produto("Geladeira", CategoriaProdutoEnum.ELETRONICO, 1200)); //Adicionando produto de id 0
        RicardoElectro.adicionarProduto(new Produto("Vans SK8-Hi", CategoriaProdutoEnum.ROUPA, 200)); //Adicionando produto de id 1
        RicardoElectro.adicionarProduto(new Produto("Coxona", CategoriaProdutoEnum.ALIMENTO, 20)); //Adicionando produto de id 2
        RicardoElectro.adicionarProduto(new Produto("Fogão", CategoriaProdutoEnum.ELETRONICO, 250)); //Adicionando produto de id 3

        RicardoElectro.listarProdutos(); //Listando produtos
RicardoElectro.listarProdutos(true); // Listando produtos com o método de sobrecarga

        RicardoElectro.buscarPorCategoria(CategoriaProdutoEnum.ELETRONICO); // Utiliznado o método de buscar por categoria

        RicardoElectro.buscarPorNome("Geladeira"); // Buscando o produto por nome

    }
}
