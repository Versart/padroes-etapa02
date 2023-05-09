package com.ifma.questao10;

public class TomatoDecorator extends CondimentDecorator{

    public TomatoDecorator(Pizza pizza){
        super(pizza);
        pizza.setDescription(pizza.getDescription() + ",Tomato");
    }



    @Override
    public double cost() {
        return 0.1d + pizza.cost();
    }

    @Override
    public String toString() {
        return this.pizza.getDescription()+"------" + cost();
    }
}
