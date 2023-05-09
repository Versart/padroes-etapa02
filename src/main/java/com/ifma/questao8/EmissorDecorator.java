package com.ifma.questao8;

public abstract class EmissorDecorator implements Emissor{

    private Emissor emissor;

    public EmissorDecorator(Emissor emissor){
        this.emissor = emissor;
    }

    @Override
    public abstract void envia(String msg);

    public Emissor getEmissor() {
        return this.emissor;
    }

}
