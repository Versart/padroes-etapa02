package com.ifma.questao9;

public class ImpressoraDecoratorComChave extends ImpressoraNumeroDecorator{

    public ImpressoraDecoratorComChave(ImpressoraNumero impressoraNumero){
        super(impressoraNumero);
    }
    @Override
    public void imprimirNumero(String numero) {
        System.out.println("Imprimir com chaves");
        this.getImpressoraNumero().imprimirNumero(numeroComChave(numero));
    }

    private String numeroComChave(String numero) {
        String numeroComParentes= "{";
        numeroComParentes+=numero + "}";
        return numeroComParentes;
    }
}
