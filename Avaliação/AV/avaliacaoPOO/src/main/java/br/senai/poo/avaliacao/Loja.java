package br.senai.poo.avaliacao;

import java.util.ArrayList; // Importação da biblioteca de Arraylist


public class Loja {

    private final ArrayList <Produto> listaDeProdutos = new ArrayList<>(); //Arraylist privado e final

    public Loja() { //Construtor vazio
    }

    public void adicionarProduto(Produto produto){ ///Método publico e vazio pra adicionar produto

        listaDeProdutos.add(produto); //Adicionando item num arraylist

    }

    public void listarProdutos(){ //Método publico e vazio pra listar os produtos

        for (Produto listagem: listaDeProdutos) { // for each pra manipular cada elemento do arraylist
            System.out.println(listagem.exibirInformacoes());

        }

    }
    public void listarProdutos(boolean detalhado){ //Método publico e vazio pra listar os produtos com o método de sobecarga
        if (detalhado) {
            for (Produto listagem: listaDeProdutos){
                System.out.println(listagem.exibirInformacoes(true));

            }
        }
        else {
            for (Produto listagem: listaDeProdutos){
                System.out.println(listagem.getNome());

            }
        }
    }

    public void buscarPorCategoria(CategoriaProdutoEnum categoria){ //Método publico e vazio pra buscar o produto por categoria
        for (Produto listagemCat: listaDeProdutos) {
            if (listagemCat.getCategoriaProduto().equals(categoria))
                System.out.println(listagemCat.exibirInformacoes());
        }
    }

    public void buscarPorNome(String nome){ //Método publico e vazio pra buscar o produto por nome
        for (Produto produto: listaDeProdutos)
         if (produto.getNome().equalsIgnoreCase(nome)){
             System.out.println(produto.exibirInformacoes(true));
        }

    }

}
