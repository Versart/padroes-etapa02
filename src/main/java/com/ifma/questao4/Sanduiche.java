package com.ifma.questao4;

import com.ifma.questao4.ingredientes.Pao;
import com.ifma.questao4.ingredientes.Presunto;
import com.ifma.questao4.ingredientes.Queijo;
import com.ifma.questao4.ingredientes.Salada;

public abstract class Sanduiche  {

     protected Pao pao;

     protected Queijo queijo;

     protected Presunto presunto;

     protected Salada salada;
     public abstract void montarPao();

     public abstract void colocarQueijo();

     public abstract void colocarPresunto();

     public abstract void colocarSalada();

     @Override
     public String toString() {
          return "Sanduiche{" +
                  "pao=" + pao +
                  ", queijo=" + queijo +
                  ", presunto=" + presunto +
                  ", salada=" + salada +
                  '}';
     }
}
