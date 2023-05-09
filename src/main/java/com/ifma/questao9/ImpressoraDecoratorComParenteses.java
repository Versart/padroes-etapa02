package com.ifma.questao9;

public class ImpressoraDecoratorComParenteses extends ImpressoraNumeroDecorator {

    public ImpressoraDecoratorComParenteses(ImpressoraNumero impressoraNumeroInteiro){
        super(impressoraNumeroInteiro);
    }
    @Override
    public void imprimirNumero(String numero) {
        System.out.println("Imprimir com parênteses");
        this.getImpressoraNumero().imprimirNumero(numeroComParentese(numero));
    }

    private String numeroComParentese(String numero) {
        String numeroComParentes= "(";
        numeroComParentes+=numero + ")";
        return numeroComParentes;
    }
}
