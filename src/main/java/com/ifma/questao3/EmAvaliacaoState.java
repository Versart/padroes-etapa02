package com.ifma.questao3;

public class EmAvaliacaoState implements State{

    @Override
    public void designar(Processo processo) {

    }

    @Override
    public void cancelar(Processo processo) {

    }

    @Override
    public void deferir(Processo processo) {
        System.out.println("Deferindo documento");
        processo.setState( new DeferidoState());
    }

    @Override
    public void indeferir(Processo processo) {
        System.out.println("Indeferindo documento");
        processo.setState( new IndeferidoState());
    }
}
