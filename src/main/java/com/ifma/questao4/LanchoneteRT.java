package com.ifma.questao4;

public class LanchoneteRT extends Lanchonete{

    @Override
    public Sanduiche fazerSanduiche() {
        Sanduiche sanduiche = new SanduicheRT();
        sanduiche.montarPao();
        sanduiche.colocarQueijo();
        sanduiche.colocarPresunto();
        sanduiche.colocarSalada();
        return sanduiche;
    }
}
