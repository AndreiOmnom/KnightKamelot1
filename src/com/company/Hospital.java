package com.company;

public class Hospital {
    public int energy;
    public int force;
    public int price;
    public int hospital;

    public Hospital(int hospital, int energy, int force, int price) {

        this.hospital = hospital;
        this.price = price;
        this.force = force;
        this.energy = energy;
    }

    @Override
    public String toString() {
        return "Подлечит :" + hospital + "Заберет энергию --" + energy + "Даст силу--" + force + "Стоимость лечения--" + price;
    }

}
