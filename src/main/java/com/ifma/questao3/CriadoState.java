package com.ifma.questao3;

public class CriadoState implements State{

    @Override
    public void designar(Processo processo) {
        System.out.println("Designando documento");
        processo.setState(new EmAvaliacaoState());
    }

    @Override
    public void cancelar(Processo processo) {
        System.out.println("Cancelando documento");
        processo.setState(new FechadoState());
    }

    @Override
    public void deferir(Processo processo) {

    }

    @Override
    public void indeferir(Processo processo) {

    }
}
