package com.ifma.questao5;

public class MoedaEUA implements Moeda{

    @Override
    public String valor(Double valor) {
        return valor+" $";
    }
}
