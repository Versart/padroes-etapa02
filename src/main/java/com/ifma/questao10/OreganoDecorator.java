package com.ifma.questao10;

public class OreganoDecorator extends CondimentDecorator{

    public OreganoDecorator(Pizza pizza){
        super(pizza);
        pizza.setDescription(pizza.getDescription() + ",Oregano");
    }



    @Override
    public double cost() {
        return 0.5d + pizza.cost();
    }

    @Override
    public String toString() {
        return this.pizza.getDescription()+"------" + cost();
    }
}
