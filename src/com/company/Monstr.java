package com.company;

import java.util.Scanner;


public  class Monstr {
    private String mname;
    private  int menergy;
    private int priz;


    public  Monstr(String mname, int menergy, int priz) {
        this.mname = mname;
        this.menergy = menergy;
        this.priz = priz;

    }

    public String getMname() {

        return mname;
    }

    public void setMname(String mname) {

        this.mname = mname;
    }

    public double  getMenergy() {

        return menergy;
    }

    public void setMenergy(int menergy) {

        this.menergy = menergy;
    }

    public int getPriz() {

        return priz;
    }

    public void setPriz(int priz) {

        this.priz = priz;
    }


    @Override
    public String toString() {
        return "Имя монстра" + mname +
                "\nСила " + menergy +
                " \nНаграда за победу " +priz;


    }
}
