package com.ifma.questao10;

public abstract class Pizza {

    protected String description;

    public  void setDescription(String description){
        this.description = description;
    }

    public String getDescription(){
        return description;
    }

    public  double cost() {
        return 0d;
    }
}
