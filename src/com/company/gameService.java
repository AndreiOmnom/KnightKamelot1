//package com.company;
//
//public class gameService {
//    public int armour;
//    public int price;
//
//
//        public double force;
//        public int energy;
//        public int price;
//
//        public Thing (double force, int energy, int price) {
//
//            this.price = price;
//            this.force = force;
//            this.energy = energy;
//        }
//        @Override
//        public String toString () {
//            return " Добавит силы:  " + force + ", Добавит энергии: " + energy + ", Его стоимость: " + price;
//
//
//    int helmet;
//    int armor;
//    int trousers;
//    int boots;
//
//    int pricehelmet;
//    int pricearmor;
//    int pricettrousers;
//    int pricetboots;
//
//    public void buyItems(String items, int prize) {
//        this.items = items;
//        this.prize = prize;
//    }
//
//    @Override
//    public String toString() {
//        return "Имя монстра" + mname +
//                "\nЭнергия " + menergy;
//
//    }
//}
//public class MagicMath {
//
//    public static int max(int a, int b) {
//        if (a > b) {
//            return a;
//        } else {
//            return b;
//        }
//    }
//
//    public static int pow(int value, int valv) {
//        int c = value;
//        for (int i = 1; i <= valv; i++) {
//
//            value = value * c;
//        }
//
//        return value;
//    }
//
//    public static int abs(int minus) {
//        if (minus < 0) {
//            minus = minus * -1;
//        }
//        return minus;
//    }
//
//    public static int round(double roun) {
//        int i = 0;
//        while (roun > 1) {
//            roun = roun - 1;
//            i = i + 1;
//        }
//        if (roun >= 0.5) {
//            i = i + 1;
//        }
//
//
//        return i;
//
//    }
//}