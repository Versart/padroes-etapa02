package com.ifma.questao10;

public class Pizzaiolo {
    public static void main(String[] args) {
        Pizza pizza = new Mozzarella();
        System.out.println(pizza);
        pizza = new Pepperoni();
        System.out.println(pizza);
        pizza = new TomatoDecorator(new Mozzarella());
        System.out.println(pizza);
        pizza = new CreamCheeseEdgeDecorator(new Mozzarella());
        System.out.println(pizza);
        pizza = new BaconDecorator(new Pepperoni());
        System.out.println(pizza);
        pizza = new OreganoDecorator(new Pepperoni());
        System.out.println(pizza);

    }
}
