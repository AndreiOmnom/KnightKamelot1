package com.company;


public class Hospital {
    private int hp;
    private int energy;
     private int force;
      private int price;


    public Hospital(int hp, int energy, int force, int price) {

        this.hp = hp;
        this.energy = energy;
        this.force = force;
        this.price = price;


    }
        public Hospital(){

        }

        public int getEnergy () {
            return energy;
        }

        public void setEnergy ( int energy){
            this.energy = energy;
        }

        public int getForce () {
            return force;
        }

        public void setForce ( int force){
            this.force = force;
        }

        public int getPrice () {
            return price;
        }

        public void setPrice ( int price){
            this.price = price;
        }
        public int getHp () {
            return hp;
        }

        public void setHp ( int hp){
            this.hp = hp;
        }


    @Override
    public String toString() {
        return "Подлечит : Здоровья добавит +" + hp +
                "\nЗаберет энергию -" + energy +
                "\nДаст силу +" + force +
                "\nСтоимость лечения: талеры -" + price;

    }

}
