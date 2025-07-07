package br.senai.poo.lista06;

public class Principal {

    public static void main(String[] args) {
        Time flasco = new Time("Riverplay", "flasco");
        Jogador leandro = new Jogador("Leandro", 15);
        flasco.contratarJogador(leandro);
        flasco.escalarJogador(leandro, SituacaoEscalacaoEnum.TITULAR);
        System.out.println(flasco.obterEscalacao());

        flasco.removerJogadorEscalacao(leandro);
        System.out.println(flasco.obterJogadoresContratados());

    }
}
