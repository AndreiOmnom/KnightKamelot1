package com.company;


public  class Monstr {
    private String mname;
    private int menergy;
    private int mpriz;


    public Monstr(String mname, int menergy, int mpriz) {
        this.mname = mname;
        this.menergy = menergy;
        this.mpriz = mpriz ;

    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    public int getMenergy() {
        return menergy;
    }

    public void setMenergy(int menergy) {
        this.menergy = menergy;
    }

    public int getMpriz() {
        return mpriz;
    }

    public void setMpriz(int mpriz) {
        this.mpriz = mpriz;
    }

    @Override
    public String toString() {
        return "Имя монстра"  + mname  +
                "\nСила " + menergy +
                " \nНаграда за победу " + mpriz;


    }
}
