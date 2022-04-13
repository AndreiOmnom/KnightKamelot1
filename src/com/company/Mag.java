package com.company;

public class Mag extends Hero {



    private  String drakon;




    public Mag(int health, int energy, int power, int money, String drakon) {
        super(health, energy, power, money);
        this.drakon = drakon;
        setEnergy(getEnergy() + 15);
        setPower((int) getPower() + 25);
    }





    @Override

    public String toString() {
        return "Имя Лошади:"+ drakon + super.toString();
    }
}
