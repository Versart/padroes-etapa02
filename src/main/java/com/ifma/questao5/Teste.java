package com.ifma.questao5;

public class Teste {

    public static void main(String[] args) {
        LocalidadeFactory localidadeFactory = new BrasilFactory();
        System.out.println(localidadeFactory.getData().data());
        System.out.println(localidadeFactory.getMoeda().valor(100d));

        localidadeFactory = new EUAFactory();
        System.out.println(localidadeFactory.getData().data());
        System.out.println(localidadeFactory.getMoeda().valor(100d));
    }
}
