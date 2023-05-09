package com.ifma.questao10;

public abstract class CondimentDecorator extends Pizza {

   protected Pizza pizza;
   public CondimentDecorator(Pizza pizza){
      this.pizza = pizza;
   }


   public abstract double cost();
}
