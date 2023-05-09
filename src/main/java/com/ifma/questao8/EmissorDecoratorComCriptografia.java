package com.ifma.questao8;

public class EmissorDecoratorComCriptografia extends EmissorDecorator{

    public EmissorDecoratorComCriptografia(Emissor emissor){
        super(emissor);
    }

    @Override
    public void envia(String msg) {
        System.out.println("Enviando mensagem criptografada");
        this.getEmissor().envia(criptografa(msg));
    }

    private String criptografa(String msg){
        String msgCriptografada = new StringBuilder(msg).reverse().toString();
        return msgCriptografada;
    }
}
