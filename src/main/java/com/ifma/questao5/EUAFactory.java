package com.ifma.questao5;

import java.time.LocalDate;

public class EUAFactory implements LocalidadeFactory{

    @Override
    public Data getData() {
        return new DataEUA();
    }

    @Override
    public Moeda getMoeda() {
        return new MoedaEUA();
    }
}
