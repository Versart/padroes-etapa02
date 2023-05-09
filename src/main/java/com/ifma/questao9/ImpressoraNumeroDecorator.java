package com.ifma.questao9;

public abstract class ImpressoraNumeroDecorator implements ImpressoraNumero {

    private ImpressoraNumero impressoraNumero;

    public ImpressoraNumeroDecorator(ImpressoraNumero impressoraNumero){
        this.impressoraNumero = impressoraNumero;
    }

    public ImpressoraNumero getImpressoraNumero(){
        return this.impressoraNumero;
    }
}
