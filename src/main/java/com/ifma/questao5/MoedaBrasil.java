package com.ifma.questao5;

public class MoedaBrasil implements Moeda{

    @Override
    public String valor(Double valor) {
        return valor + " R$";
    }
}
