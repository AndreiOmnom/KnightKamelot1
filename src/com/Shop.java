package com;

public class Shop {
    private int price;
    private int force;
    private int energy;

    public Shop(int price, int force, int energy) {
        this.price = price;
        this.force = force;
        this.energy = energy;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getForce() {
        return force;
    }

    public void setForce(int force) {
        this.force = force;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    @Override
    public String toString(){
     return "При покупке:"  +
            "\nЗаберет энергию -" + energy +
            "\nДаст силу +" + force +
            "\nСтоимость покупки: талеры -" + price;
    }
}


