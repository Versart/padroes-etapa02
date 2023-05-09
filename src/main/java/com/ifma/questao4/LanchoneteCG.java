package com.ifma.questao4;

public class LanchoneteCG extends Lanchonete {

    @Override
    public Sanduiche fazerSanduiche() {
        Sanduiche sanduiche = new SanduicheCG();
        sanduiche.montarPao();
        sanduiche.colocarPresunto();
        sanduiche.colocarQueijo();
        sanduiche.colocarSalada();
        return sanduiche;
    }
}
