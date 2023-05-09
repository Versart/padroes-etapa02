package com.ifma.questao10;

public class CreamCheeseEdgeDecorator extends CondimentDecorator{

    public CreamCheeseEdgeDecorator(Pizza pizza){
        super(pizza);
        pizza.setDescription(pizza.getDescription() + ",CreamCheeseEdge");
    }



    @Override
    public double cost() {
        return 1.2d + pizza.cost();
    }

    @Override
    public String toString() {
        return this.pizza.getDescription()+"------" + cost();
    }
}
