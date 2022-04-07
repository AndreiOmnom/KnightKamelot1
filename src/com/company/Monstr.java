package com.company;

public class Monstr {
    public String mname;
    public Double  menergy;


    public Monstr(String mname, double menergy ) {
        this.mname = mname;
        this.menergy = menergy;

    }

    @Override
    public String toString() {
        return "Имя монстра" + mname +
                "\nЭнергия " + menergy;


    }
}
