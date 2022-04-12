package com.company;

import java.security.SecureRandom;
import java.util.Scanner;




public class Game {
    Scanner consol = new Scanner(System.in);
    SecureRandom random = new SecureRandom();

    // поле рыцарь
    public Hero camelot = new Hero(100, 100, 50, 50);


    // поле монстр

    public Monstr light = new Monstr("--Легкий монстр", (int) random.nextInt(10) / 10 + 1, 5);
    public Monstr middle = new Monstr("--Средний монстр", (int) random.nextInt(20) / 10 + 2, 10);
    public Monstr hard = new Monstr("--Тяжелый монстр", (int)random.nextInt(30) / 10 + 1, 20);
    public Monstr boss = new Monstr("--Босс монстр", (int)random.nextInt(40) / 10 + 1, 35);

    // поле лечение
    public static Hospital leg = new Hospital(10, 15, 5 , 30);
     public static Hospital hand = new Hospital(20, 20, 10, 30);
     public static Hospital neck = new Hospital(40, 40, 15, 20);
    public static Hospital head = new Hospital(60, 30, 20, 40);


    public Game() {
        System.out.println("Игра KnightCamelot запущена ");
        namehero();
        while ( camelot.getEnergy() > 0 && camelot.getMoney() > 0 && camelot.getHealth() > 0 && camelot.getPower() >0 ) {
            menuGame();
            fightMonster();

        }

    }

    public void playGame() {
    }

    public void namehero() {
        System.out.println("Введите имя героя");
        String name = consol.nextLine();
        System.out.println(name + "-привет");
    }

    public void menuGame() {
        System.out.println("\nМеню:  " +
                "\n 1 - Битвa " +
                "\n 2 - Шоппинг" +
                "\n 3 - Лечение");
        viborMenu();

    }

    public void fightMonster() {

        System.out.println("Выберите сложность монстра:" +
                " \n 1 - Легкий(1-10) " +
                "\n 2  - Средний(11-20) " +
                "\n 3  - Тяжелый(21-40) " +
                "\n 4  - БОСС(41-50)");
        viborMonstr();
    }


    public void viborMenu() {
        int viborMenu = consol.nextInt();
        if (viborMenu == 1) {
            fightMonster();

        }
        if (viborMenu == 2) {
            shopping();
        }
        if (viborMenu == 3) {
            hospital();
        }
    }

    public void shopping() {

    }

    public void hospital() {
        System.out.println("Что будем лечить" +
                " \n 1 - Ногу " + leg +
                "\n 2  - Руку " + hand +
                "\n 3  - Спину " + neck +
                "\n 4  - Голову" + head);
        viborHospital();

    }

    public void viborHospital() {
        int viborHospit = consol.nextInt();
        if (viborHospit == 1) {
            camelot.setHealth(camelot.getHealth() + leg.getHp());
            camelot.setEnergy(camelot.getEnergy() + leg.getEnergy());
             camelot.setPower((int)camelot.getPower() - leg.getForce());
            camelot.setMoney(camelot.getMoney() - leg.getPrice());

            System.out.println(leg);
            System.out.println("Вы подлечились");
            System.out.println(camelot);
        }
        if (viborHospit == 2) {
            System.out.println(hand);
            camelot.setHealth(camelot.getHealth() + hand.getHp());
            camelot.setEnergy(camelot.getEnergy() + hand.getEnergy());
            camelot.setPower((int)camelot.getPower() - hand.getForce());
            camelot.setMoney(camelot.getMoney() - hand.getPrice());

            System.out.println(hand);
            System.out.println("Вы подлечились");
            System.out.println(camelot);


        }
        if (viborHospit == 3) {
            System.out.println(neck);
            camelot.setHealth(camelot.getHealth() + neck.getHp());
            camelot.setEnergy(camelot.getEnergy() + neck.getEnergy());
            camelot.setPower((int)camelot.getPower() - neck.getForce());
            camelot.setMoney(camelot.getMoney() - neck.getPrice());

            System.out.println(neck);
            System.out.println("Вы подлечились");
            System.out.println(camelot);

        }
        if (viborHospit == 4) {
            System.out.println(head);
            camelot.setHealth(camelot.getHealth() + head.getHp());
            camelot.setEnergy(camelot.getEnergy() + head.getEnergy());
            camelot.setPower((int) (camelot.getPower() - head.getForce()));
            camelot.setMoney(camelot.getMoney() - head.getPrice());
            System.out.println(head);
            System.out.println("Вы подлечились");
            System.out.println(camelot);
        }
        menuGame();

    }

    public void viborMonstr() {
        int viborMonstr = consol.nextInt();
        if (viborMonstr == 1) {
            System.out.println(light);
            fightEasyMonster();
        }
        if (viborMonstr == 2) {
            System.out.println(middle);
            fightmiddleMonster();
        }
        if (viborMonstr == 3) {
            System.out.println(hard);
            fighthardMonster();
        }
        if (viborMonstr == 4) {
            System.out.println(boss);
            fightBossMonster();
        }
        menuGame();
    }


    public void fightEasyMonster() {
        camelot.setEnergy(camelot.getEnergy()- light.getMenergy());
        if (camelot.getEnergy() > light.getMenergy()) {
            System.out.println("Вы победили!");
            camelot.setMoney(camelot.getMoney() + light.getMpriz());
            System.out.println(camelot);
            System.out.println("Вы заработали " + light.getMpriz());

        } else {
            System.out.println("Вы проиграли!");
            System.out.println("Cила монстра против которого вы сражались была : " + light.getMenergy());
            camelot.setHealth(camelot.getHealth()   - light.getMenergy());
            System.out.println(camelot);
            System.out.println("Ваше здоровье уменьшилось до " + camelot.getHealth());
        }

    }

    public void fightmiddleMonster() {
        camelot.setEnergy(camelot.getEnergy() - middle.getMenergy());
        if (camelot.getEnergy() > middle.getMenergy()) {
            System.out.println("Вы победили!");
            camelot.setMoney(camelot.getMoney() + middle.getMpriz());
            System.out.println(camelot);
            System.out.println("Вы заработали " + middle.getMpriz());

        } else {
            System.out.println("Вы проиграли!");
            System.out.println("Cила монстра против которого вы сражались была : " + middle.getMenergy());
          camelot.setHealth(camelot.getHealth() - middle.getMenergy());
            System.out.println(camelot);
            System.out.println("Ваше здоровье уменьшилось до " + camelot.getHealth());


        }

    }

    public void fighthardMonster() {
        camelot.setEnergy(camelot.getEnergy() - hard.getMenergy());
        if (camelot.getEnergy() > hard.getMenergy()) {
            System.out.println("Вы победили!");
            camelot.setMoney(camelot.getMoney() + hard.getMpriz());
            System.out.println(camelot);
            System.out.println("Вы заработали " + hard.getMpriz());

        } else {
            System.out.println("Вы проиграли!");
            System.out.println("Cила монстра против которого вы сражались была : " + hard.getMenergy());
          camelot.setHealth(camelot.getHealth() - hard.getMenergy());
            System.out.println(camelot);
            System.out.println("Ваше здоровье уменьшилось до " + camelot.getHealth());


        }

    }

    public void fightBossMonster() {
        camelot.setEnergy(camelot.getEnergy() - boss.getMenergy());
        if (camelot.getEnergy() > boss.getMenergy()) {
            System.out.println("Вы победили!");
            camelot.setMoney(camelot.getMoney() + boss.getMpriz());
            System.out.println(camelot);
            System.out.println("Вы заработали " + boss.getMpriz());

        } else {
            System.out.println("Вы проиграли!");
            System.out.println("Cила монстра против которого вы сражались была : " + boss.getMenergy());
            camelot.setHealth(camelot.getHealth() - boss.getMenergy());
            System.out.println(camelot);
            System.out.println("Ваше здоровье уменьшилось до " + camelot.getHealth());


        }



    }

}











