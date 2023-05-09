package com.ifma.questao10;

public class BaconDecorator extends CondimentDecorator{

    public BaconDecorator(Pizza pizza){
        super(pizza);
        pizza.setDescription(pizza.getDescription() + ",Bacon");
    }



    @Override
    public double cost() {
        return 0.8d + pizza.cost();
    }

    @Override
    public String toString() {
        return this.pizza.getDescription()+"------" + cost();
    }
}
