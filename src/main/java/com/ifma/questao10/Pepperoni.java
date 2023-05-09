package com.ifma.questao10;

public class Pepperoni extends Pizza{

    public Pepperoni(){
        this.description = "Pepperoni";
    }
    @Override
    public double cost() {
        return 14.90d;
    }

    @Override
    public String toString() {
        return "Pepperoni ----" + cost();
    }
}
