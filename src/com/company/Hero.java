package com.company;

public class Hero {

    private int health;
    private int energy;
    private int power;
    private int money;


    public Hero(int health, int energy, int power, int money) {

        this.health = health;
        this.energy = energy;
        this.power = power;
        this.money = money;

    }
    public Hero (){

    }
    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public double getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return  "\nЗдоровье:" + health
                + "\nЭнергия:" + energy
                + "\nСила:" + power
                + " \nДеньги:" + money;

    }

}
