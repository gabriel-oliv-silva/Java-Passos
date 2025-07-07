package br.senai.poo.lista06;

import java.util.ArrayList;

public class Time {

    private String nomeTime;
    private String nomeTecnico;
    static int jogadoresReserva = 0;
    static int jogadoresEscalados = 0;
    private ArrayList<Jogador> listaDeJogadores = new ArrayList<>();
    private ArrayList<Jogador> listaDeJogadoresEscalados = new ArrayList<>();


    public Time(String nomeTime, String nomeTecnico) {
        this.nomeTime = nomeTime;
        this.nomeTecnico = nomeTecnico;
    }

    public Time() {

    }


    public void contratarJogador(Jogador jogador) {
        listaDeJogadores.add(jogador);
    }

    public boolean escalarJogador(Jogador jogador, SituacaoEscalacaoEnum situacaoEscalacaoEnum) {
        if (limiteAtingido(jogador.getSituacaoEscalacaoEnum()))
            throw new IllegalStateException("O limite de escalações foi atingido.");

        for (Jogador jogadores : listaDeJogadores) {
            if (jogador.getNome().equalsIgnoreCase(jogadores.getNome())) {
                if (isEscalado(jogadores))
                    return false;

                jogadores.setSituacaoEscalacaoEnum(situacaoEscalacaoEnum);
                listaDeJogadoresEscalados.add(jogadores);

                if (jogador.getSituacaoEscalacaoEnum() == SituacaoEscalacaoEnum.TITULAR)
                    jogadoresEscalados++;
                if (jogador.getSituacaoEscalacaoEnum() == SituacaoEscalacaoEnum.RESERVA)
                    jogadoresReserva++;

                listaDeJogadores.remove(jogadores);

                return true;
            }

            return false;
        }

        throw new IllegalStateException("O jogador não existe ou não foi escalado.");
    }

    private boolean isEscalado(Jogador jogador) {
        return jogador.getSituacaoEscalacaoEnum() != null;
    }

    private boolean limiteAtingido(SituacaoEscalacaoEnum situacaoEscalacaoEnum) {
        if (situacaoEscalacaoEnum == SituacaoEscalacaoEnum.TITULAR && jogadoresEscalados == 11)
            return true;
        return situacaoEscalacaoEnum == SituacaoEscalacaoEnum.RESERVA && jogadoresReserva == 12;
    }

    private Jogador buscarJogador(String nomeJogador) {

        for (Jogador jogadores : listaDeJogadores) {
            if (jogadores.getNome().equalsIgnoreCase(nomeJogador)) {
                return jogadores;
            }
        }
        return null;
    }

    public void removerJogadorEscalacao(Jogador jogador) {
        for (Jogador jogadores : listaDeJogadoresEscalados) {
            if (jogador.getNome().equalsIgnoreCase(jogadores.getNome())) {
                listaDeJogadoresEscalados.remove(jogadores);
                if (jogadores.getSituacaoEscalacaoEnum() == SituacaoEscalacaoEnum.RESERVA)
                    jogadoresReserva--;
                if (jogadores.getSituacaoEscalacaoEnum() == SituacaoEscalacaoEnum.RESERVA)
                    jogadoresEscalados--;

                jogadores.setSituacaoEscalacaoEnum(null);
                listaDeJogadores.add(jogadores);
                break;
            }
        }
    }

    public ArrayList<Jogador> obterEscalacao() {

        return listaDeJogadoresEscalados;
    }

    public ArrayList<Jogador> obterJogadoresContratados() {

        return listaDeJogadores;
    }


    public String getnomeTime() {
        return nomeTime;
    }

    public void setnomeTime(String nomeTime) {
        this.nomeTime = nomeTime;
    }

    public String getNomeTecnico() {
        return nomeTecnico;
    }

    public void setNomeTecnico(String nomeTecnico) {
        this.nomeTecnico = nomeTecnico;
    }

}
