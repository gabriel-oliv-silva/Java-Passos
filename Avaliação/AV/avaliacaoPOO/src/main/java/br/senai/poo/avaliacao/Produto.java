package br.senai.poo.avaliacao;

public class Produto extends ItemLoja implements iCalculavel { //Extends e implements

private CategoriaProdutoEnum categoriaProduto; //Utilizando o enum como privado
private double precoBase; //Atributo privado
private int codigo; //Atributo privado
private static int ultimoId = 0; //Atributo privado e estático

    public Produto(String nome, CategoriaProdutoEnum categoriaProduto, double precoBase) { //Construtor com utilização de atributos da superclasse
        super(nome); // Construindo o método da superclasse
        this.categoriaProduto = categoriaProduto;
        this.precoBase = precoBase;
        codigo = ultimoId++; // Criando criador de ids com contador automático
    }

    public CategoriaProdutoEnum getCategoriaProduto() { //Getter
        return categoriaProduto;
    }

    public void setCategoriaProduto(CategoriaProdutoEnum categoriaProduto) { //Setter
        this.categoriaProduto = categoriaProduto;
    }

    public double getPrecoBase() {//Getter
        return precoBase;
    }

    public void setPrecoBase(double precoBase) { //Setter
        if(precoBase >= 0)
        this.precoBase = precoBase;
        else
            throw new IllegalArgumentException("O preço base não pode ser negativo!");
    }

    public int getCodigo() { //Getter
        return codigo;
    }

    public void setCodigo(int codigo) { //Setter
        this.codigo = codigo;
    }

    @Override // Sobrescrita de método
    public String exibirInformacoes() {
        return "Nome: "+ getNome() + "\nCodigo: "+getCodigo()+ "\nCategoria: " + getCategoriaProduto()+"\nPreço final: R$" + calcularPrecoFinal();
    }

    public String exibirInformacoes(boolean detalhado) { //Sobrecarga de método
        if(detalhado)
         return "Nome: "+ getNome() + "\nCodigo: "+getCodigo()+ "\nCategoria: " + getCategoriaProduto()+"\nPreço final: R$" + calcularPrecoFinal();
    return "Nome: " + getNome();
    }

    @Override // Sobrescrita de método
    public double calcularPrecoFinal() {
        double imposto = 0.00;
        if (categoriaProduto.equals(CategoriaProdutoEnum.ELETRONICO))
            imposto = (precoBase * 0.2);
        if (categoriaProduto.equals(CategoriaProdutoEnum.ROUPA))
            imposto = (precoBase * 0.1);
        if (categoriaProduto.equals(CategoriaProdutoEnum.ALIMENTO))
            imposto = (precoBase * 0.05);

        return precoBase + imposto;
    }

}
