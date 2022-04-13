package com.company;

import java.util.Scanner;

public  class Hero {

    private int health  ;
    private int energy  ;
    private int power   ;
    private int money   ;


    public Hero(int health, int energy, int power, int money) {

        this.health = health;
        this.energy = energy;
        this.power = power;
        this.money = money;

    }

    public Hero() {

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
//public abstract class Hero implements MogetUdar, MogetPrigat {                    // Герой
//    private int money = 50;
//    private int hp = 100;
//    private int force = 15;
//    private int energy = 85;
//    public Hero(int money, int hp, int force, int energy){
//        this.money=money;
//        this.hp=hp;
//        this.force=force;
//        this.energy=energy;
//    }
//
//
//    public Hero() {
//
//    }
//
//    public abstract void prositMilost();
//
//    public int getMoney() {
//        return money;
//    }
//    public void setMoney(int money) {
//        this.money = money;
//    }
//    public int getHp() {
//        return hp;
//    }
//    public void setHp(int hp) {
//        this.hp = hp;
//    }
//    public int getForce() {
//        return force;
//    }
//    public void setForce(int force) {
//        this.force = force;
//    }
//    public int getEnergy() {
//        return energy;
//    }
//    public void setEnergy(int energy) {
//        this.energy = energy;
//    }
//
//
//    public abstract void win();
//    @Override
//    public  String toString() {
//        return "Money: " + money +
//                "\nHP: " + hp +
//                "\nForce: " + force +
//                "\nEnergy: " + energy;