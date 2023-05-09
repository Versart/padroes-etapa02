package com.ifma.questao9;

public class ImpressoraDecoratorComColchete extends ImpressoraNumeroDecorator{


    public ImpressoraDecoratorComColchete(ImpressoraNumero impressoraNumero) {
        super(impressoraNumero);
    }

    @Override
    public void imprimirNumero(String numero) {
        System.out.println("Imprimir com colchetes");
        this.getImpressoraNumero().imprimirNumero(numeroComColhete(numero));
    }

    private String numeroComColhete(String numero){
        String numeroComColchete="[";
        numeroComColchete+=numero +"]";
        return numeroComColchete;
    }
}
