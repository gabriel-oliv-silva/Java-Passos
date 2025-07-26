package Escolinha;

public class Estudante {

    private String nome;
    private Integer idade;
    private String matricula;

    public Estudante() {
    }

    public Estudante(String nome, Integer idade, String matricula) {
        this.nome = nome;
        this.idade = idade;
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String exibirInformacoes() {
        return "Estudante: " +
                "\nNome: " + nome +
                "\nIdade: " + idade +
                "\nMatricula: " + matricula;
    }


}
