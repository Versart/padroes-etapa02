package com.ifma.questao4;

import com.ifma.questao4.ingredientes.Pao;
import com.ifma.questao4.ingredientes.Presunto;
import com.ifma.questao4.ingredientes.Queijo;
import com.ifma.questao4.ingredientes.Salada;

public class SanduicheRT extends Sanduiche{

    @Override
    public void montarPao() {
        this.pao = Pao.BOLA;
    }

    @Override
    public void colocarQueijo() {
        this.queijo = Queijo.CHEDDAR;
    }

    @Override
    public void colocarPresunto() {
        this.presunto = Presunto.PERU;
    }

    @Override
    public void colocarSalada() {
        this.salada = Salada.SEMVERDURA;
    }
}
