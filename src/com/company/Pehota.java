package com.company;

public class Pehota extends Hero  {


      String pony;

    public Pehota(int health, int energy, int power, int money, String pony) {
        super(health, energy, power, money);
        this.pony = pony;
    }
    public void poni() {
        setEnergy(getEnergy() - 5);
        setPower((int) getPower() - 10);
    }
    @Override
    public String toString() {
        return "Кличка пони:" + pony +super.toString();
    }
}
