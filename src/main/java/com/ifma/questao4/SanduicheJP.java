package com.ifma.questao4;

import com.ifma.questao4.ingredientes.Pao;
import com.ifma.questao4.ingredientes.Presunto;
import com.ifma.questao4.ingredientes.Queijo;
import com.ifma.questao4.ingredientes.Salada;

public class SanduicheJP extends Sanduiche {

    @Override
    public void montarPao() {
        this.pao = Pao.FRANCES;
    }

    @Override
    public void colocarQueijo() {
        this.queijo = Queijo.MUSSARELA;
    }

    @Override
    public void colocarPresunto() {
        this.presunto = Presunto.FRANGO;
    }

    @Override
    public void colocarSalada() {
        this.salada = Salada.COMVERDURA;
    }
}
