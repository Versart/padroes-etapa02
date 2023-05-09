package com.ifma.questao9;

public class Teste {
    public static void main(String[] args) {
        ImpressoraNumero impressoraNumero = new ImpressoraDecoratorComParenteses(new ImpressoraNumeroBasico());
        impressoraNumero.imprimirNumero("1");

        impressoraNumero = new ImpressoraDecoratorComColchete(new ImpressoraNumeroBasico());
        impressoraNumero.imprimirNumero("1");

        impressoraNumero = new ImpressoraDecoratorComChave(new ImpressoraNumeroBasico());
        impressoraNumero.imprimirNumero("1");
    }
}
