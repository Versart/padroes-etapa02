package com.ifma.questao10;

public class Mozzarella extends Pizza{

    public Mozzarella(){
        this.description = "Mozzarella";
    }
    @Override
    public double cost() {
        return 11.90d;
    }

    @Override
    public String toString() {
        return "Mozzarella ----" + cost();
    }
}
