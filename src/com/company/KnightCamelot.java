package com.company;

public class KnightCamelot {

    public int health;
    public int energy;
    public double power;
    public int money;


    public KnightCamelot(int health, int energy, int power, int money) {

        this.health = health;
        this.energy = energy;
        this.power = power;
        this.money = money;
    }

    @Override
    public String toString() {
        return "\nЗдоровье:" + health
                + "\nЭнергия:" + energy
                + "\nСила:" + power
                + " \nДеньги:" + money;

    }
}
