package com.ifma.questao5;

import java.time.LocalDate;

public class BrasilFactory implements LocalidadeFactory{

    @Override
    public Data getData() {
        return new DataBrasil();
    }

    @Override
    public Moeda getMoeda() {
        return new MoedaBrasil();
    }
}
