package com.company;

import java.util.Scanner;

public class Hospital {
    private int energy;
     private int force;
      private int price;
    private int hospital;

    public void Hospital(int hospital, int energy, int force, int price) {

        this.hospital = hospital;
        this.price = price;
        this.force = force;
        this.energy = energy;
    }


    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public int getForce() {
        return force;
    }

    public void setForce(int force) {
        this.force = force;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    public int getHospital() {
        return hospital;
    }

    public void setHospital(int hospital) {
        this.hospital = hospital;
    }

    @Override
    public String toString() {
        return "Подлечит :" + hospital + "Заберет энергию --" + energy + "Даст силу--" + force + "Стоимость лечения--" + price;
    }

}
