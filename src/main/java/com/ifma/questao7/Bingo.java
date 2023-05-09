package com.ifma.questao7;

import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;

public class Bingo {

    private Set<Cartela> cartelas = new HashSet<>();

    public void addCartela(Cartela cartela){
        cartelas.add(cartela);
    }

    public void sortear() {
        Random random = new Random();
        int numero = random.nextInt(99);
        cartelas.stream().forEach(cartela -> cartela.marcarNumero(numero));
        List<Cartela> cartelasFechadas = cartelas.stream().filter(cartela -> cartela.getAcertos() == 16).collect(Collectors.toList());
        for(Cartela cartela : cartelasFechadas){
            cartela.notificarGanhador();
        }
    }
}
