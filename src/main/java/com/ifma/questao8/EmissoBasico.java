package com.ifma.questao8;

public class EmissoBasico implements Emissor{

    @Override
    public void envia(String msg) {
        System.out.println("Enviando mensagem...");
        System.out.println(msg);
    }
}
