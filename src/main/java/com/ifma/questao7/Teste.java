package com.ifma.questao7;

public class Teste {
    public static void main(String[] args) {
        Bingo bingo = new Bingo();
        for(int i = 0; i < 10;i++) {
            bingo.addCartela(new Cartela());
        }
        for (int i = 0; i < 70;i++){
            bingo.sortear();
        }

    }
}
