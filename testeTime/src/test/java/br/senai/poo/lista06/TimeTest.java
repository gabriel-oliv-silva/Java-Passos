package br.senai.poo.lista06;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TimeTest {

    private Time time;

    @BeforeEach
    void setUp() {
        time = new Time();
    }

    @Test
    void devePermitirEscalar11Jogadores() {

        for (int i = 0; i < 11; i++) {

            Jogador jogador = new Jogador("Jogador " + i, i);

            time.contratarJogador(jogador);
            time.escalarJogador(jogador, SituacaoEscalacaoEnum.TITULAR);
        }

        assertEquals(11, (time.obterEscalacao().size()));
    }

    @Test
    void naoDevePermitirEscalarMaisDe11Jogadores() {

        for (int i = 1; i <= 12; i++) {
            Jogador jogador = new Jogador("Jogador " + i, i);
            time.contratarJogador(jogador);
            time.escalarJogador(jogador, SituacaoEscalacaoEnum.TITULAR);

            if (i == 12)
                assertThrows(IllegalStateException.class,
                        () -> time.escalarJogador(jogador, SituacaoEscalacaoEnum.TITULAR),
                        "Tentativa de escalar o 12º titular");

        }


    }

    @Test
    void naoDevePermitirEscalarJogadorNaoContratado() {

        Jogador jogadorNaoContratado = new Jogador("Desconhecido", 15);

        assertThrows(
                IllegalStateException.class,
                () -> time.escalarJogador(jogadorNaoContratado, SituacaoEscalacaoEnum.TITULAR),
                "Esperava IllegalStateException ao tentar escalar o 12º titular"
        );

    }

    @Test
    void exibirJogadoresTitulares() {
        Jogador jogador = null;

        for (int i = 0; i < 5; i++) {
            jogador = new Jogador("Jogador " + i, i);
            time.contratarJogador(jogador);
            time.escalarJogador(jogador, SituacaoEscalacaoEnum.RESERVA);
        }

        for (int i = 0; i < 6; i++) {

            jogador = new Jogador("Jogador " + i, i);
            time.contratarJogador(jogador);
            time.escalarJogador(jogador, SituacaoEscalacaoEnum.TITULAR);
        }

        try {
            if (jogador.getSituacaoEscalacaoEnum().equals(SituacaoEscalacaoEnum.TITULAR))
                time.obterEscalacao();


        } catch (Exception e) {
            throw new IllegalArgumentException("Não foi possivel acessar os titulares");
        }

    }

    @Test
    void exibirJogadoresReservas() {
        Jogador jogador = null;

        for (int i = 0; i < 5; i++) {
            jogador = new Jogador("Jogador " + i, i);
            time.contratarJogador(jogador);
            time.escalarJogador(jogador, SituacaoEscalacaoEnum.RESERVA);
        }

        for (int i = 0; i < 6; i++) {

            jogador = new Jogador("Jogador " + i, i);
            time.contratarJogador(jogador);
            time.escalarJogador(jogador, SituacaoEscalacaoEnum.TITULAR);
        }

        try {
            if (jogador.getSituacaoEscalacaoEnum().equals(SituacaoEscalacaoEnum.RESERVA))
                time.obterEscalacao();


        } catch (Exception e) {
            throw new IllegalArgumentException("Não foi possivel acessar os reservas");
        }

    }

    @Test
    void removerJogadorEscalacaoTest() {
        Jogador jogador = new Jogador("Gabriel", 23);
try {
    time.contratarJogador(jogador);
    time.escalarJogador(jogador, SituacaoEscalacaoEnum.TITULAR);
    time.removerJogadorEscalacao(jogador);
} catch (Exception e) {
    throw new IllegalStateException("Não foi possivel excluir o jogador selecionado!");
}


    }


}
