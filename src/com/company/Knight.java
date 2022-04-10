package com.company;

public class Knight extends Hero{

    private String horse;

    public Knight(int health, int energy, int power, int money, String horse) {
        super(health, energy, power, money);
        this.horse = horse;
    }
   @Override

   public String toString() {

       return "Имя Лошади:"+ horse + super.toString();
   }


}


