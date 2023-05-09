package com.ifma.questao8;

public class Teste {
    public static void main(String[] args) {
        Emissor emissor = new EmissorDecoratorComCriptografia(new EmissoBasico());
        emissor.envia("Boa noite");
        emissor = new EmissorDecoratorComCompressao(new EmissoBasico());
        emissor.envia("Boa noite");
    }
}
