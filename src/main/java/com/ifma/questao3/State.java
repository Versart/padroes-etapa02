package com.ifma.questao3;

public interface State {


    void designar(Processo processo);
    void cancelar(Processo processo);
    void deferir(Processo processo);
    void indeferir(Processo processo);
}
