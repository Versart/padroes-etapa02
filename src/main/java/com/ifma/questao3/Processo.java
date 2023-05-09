package com.ifma.questao3;

public class Processo  {

    private State state;

    {
        state = new CriadoState();
    }

    public void designar() {
        state.designar(this);
    }
    public void cancelar() {
        state.cancelar(this);
    }

    public void deferir() {
        state.deferir(this);
    }
    public void indeferir() {
        state.indeferir(this);
    }

    public void setState(State state) {
        this.state = state;
    }



}
