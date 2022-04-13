package com.company;

public class Pehota extends Hero  {


    private String poni;

    public Pehota(int health, int energy, int power, int money, String poni) {
        super(health, energy, power, money);
        this.poni = poni;
    }
    @Override
    public String toString() {
        return "Имя лошади:" + poni +super.toString();
    }
}
