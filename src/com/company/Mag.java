package com.company;

public class Mag extends Hero {



       String dragon;




    public Mag(int health, int energy, int power, int money, String dragon) {
        super(health, energy, power, money);
        this.dragon = dragon;
    }
     public void dragon(){
        setEnergy(getEnergy() + 15);
        setPower((int) getPower() + 25);
    }


    @Override

    public String toString() {
        return "Кличка Дракона:"+ dragon + super.toString();
    }
}
