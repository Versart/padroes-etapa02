package com.ifma.questao4;

public class LanchoneteJP extends Lanchonete {

    @Override
    public Sanduiche fazerSanduiche() {
        Sanduiche sanduiche = new SanduicheJP();
        sanduiche.montarPao();
        sanduiche.colocarQueijo();
        sanduiche.colocarPresunto();
        sanduiche.colocarSalada();
        return sanduiche;
    }
}
