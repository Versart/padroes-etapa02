package com.ifma.questao7;

import java.util.*;

public class Cartela implements CartelaObserver{

    private Set<Integer> numeros = new HashSet<>();

    private int acertos = 0;

    public Cartela() {
        Random random = new Random();
        for(int i = 0; i < 16;i++){
            numeros.add(random.nextInt(99));
        }
    }

    public Set<Integer> getNumeros() {
        return numeros;
    }

    public void setNumeros(Set<Integer> numeros) {
        this.numeros = numeros;
    }

    public void marcarNumero(int numeroSorteado){
        for (int numeroCartela :numeros) {
            if(numeroCartela == numeroSorteado)
                acertos++;
        }
    }

    public int getAcertos() {
        return acertos;
    }

    @Override
    public void notificarGanhador() {
        System.out.println("Você ganhou o bingo!");
    }
}
