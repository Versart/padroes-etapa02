package com.ifma.questao2;

public class Teste {

    public static void main(String[] args) {
        Livro livro = LivroStepBuilder
                .newBuilder()
                .nomeDoLivroNacional("Eragon")
                .publicadoEm(2000)
                .dosAutores("Christopher Paolini")
                .edicao(1)
                .daEditora("Rocco")
                .nomeOriginal("Eragon")
                .dosTradutores("Tradutor 1","Tradutor 2")
                .paginas(455)
                .isbn(12212l)
                .build();

        System.out.println(livro);
    }
}
