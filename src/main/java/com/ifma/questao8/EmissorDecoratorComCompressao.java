package com.ifma.questao8;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;

public class EmissorDecoratorComCompressao extends EmissorDecorator{


    public EmissorDecoratorComCompressao(Emissor emissor) {
        super(emissor);
    }

    @Override
    public void envia(String msg) {
        System.out.println("Enviando mensagem comprimida...");
        String msgComprimida="";
        try {
            msgComprimida = comprimir(msg);
        }catch (IOException e){
            e.printStackTrace();
        }
        this.getEmissor().envia(msgComprimida);
    }

    private String comprimir(String msg) throws IOException {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        DeflaterOutputStream dout = new DeflaterOutputStream(out, new Deflater());
        dout.write(msg.getBytes());
        dout.close();
        return new String(out.toByteArray());
    }
}
