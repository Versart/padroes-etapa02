package com.ifma.questao4;

public class Teste {

    public static void main(String[] args) {
        Lanchonete lanchonete = new LanchoneteCG();
        System.out.println(lanchonete.fazerSanduiche());
        lanchonete = new LanchoneteJP();
        System.out.println(lanchonete.fazerSanduiche());
        lanchonete = new LanchoneteRT();
        System.out.println(lanchonete.fazerSanduiche());
    }
}
