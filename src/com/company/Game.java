package com.company;

import java.security.SecureRandom;
import java.util.Scanner;



public class Game {
    Scanner consol = new Scanner(System.in);
    SecureRandom random = new SecureRandom();

    // поле рыцарь
    private Hero camelot = new Hero(100, 100, 2, 50);


    // поле монстр

    private Monstr light = new Monstr("--Легкий монстр", random.nextInt(11) / 10 + 1, 5);
    private Monstr middle = new Monstr("--Средний монстр", random.nextInt(21) / 10 + 2, 10);
    private Monstr hard = new Monstr("--Тяжелый монстр", random.nextInt(31) / 10 + 1, 20);
    private Monstr boss = new Monstr("--Босс монстр", random.nextInt(41) / 10 + 1, 35);

    // поле лечение
     Hospital leg = new Hospital(10, 15, -10, 30);
      Hospital hand = new Hospital(20, 20, -20, 30);
      Hospital neck = new Hospital(40, 40, -30, 20);
    Hospital head = new Hospital(60, 30, -40, 40);


    public Game() {
        System.out.println("Игра KnightCamelot запущена ");
        namehero();
        while (camelot.getHealth() > 0 && camelot.getEnergy()  > 0) {
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
            camelot.setHealth(camelot.getHealth() + leg.getHospital());
            camelot.setEnergy(camelot.getEnergy() + leg.getEnergy());
            camelot.setPower(camelot.getPower() + leg.getForce());
            camelot.setMoney(camelot.getMoney() - leg.getPrice());

            System.out.println(leg);
            System.out.println("Вы подлечились");
            System.out.println(camelot);
        }
        if (viborHospit == 2) {
            System.out.println(hand);
            camelot.setHealth(camelot.getHealth() + hand.getHospital());
            camelot.setEnergy(camelot.getEnergy() + hand.getEnergy());
            camelot.setPower(camelot.getPower() - hand.getForce());
            camelot.setMoney(camelot.getMoney() - hand.getPrice());

            System.out.println(hand);
            System.out.println("Вы подлечились");
            System.out.println(camelot);


        }
        if (viborHospit == 3) {
            System.out.println(neck);
            camelot.setHealth(camelot.getHealth() + neck.getHospital());
            camelot.setEnergy(camelot.getEnergy() + neck.getEnergy());
            camelot.setPower(camelot.getPower() - neck.getForce());
            camelot.setMoney(camelot.getMoney() - neck.getPrice());

            System.out.println(neck);
            System.out.println("Вы подлечились");
            System.out.println(camelot);

        }
        if (viborHospit == 4) {
            System.out.println(head);
            camelot.setHealth(camelot.getHealth() + head.getHospital());
            camelot.setEnergy(camelot.getEnergy() + head.getEnergy());
            camelot.setPower(camelot.getPower() - head.getForce());
            camelot.setMoney(camelot.getMoney() - head.getPrice());
            System.out.println(head);
            System.out.println("Вы подлечились");
            System.out.println(camelot);
        }

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
    }


    public void fightEasyMonster() {
        camelot.setEnergy(camelot.getEnergy()- light.getMenergy());
        if (camelot.getEnergy() > light.getMenergy()) {
            System.out.println("Вы победили!");
            camelot.setMoney(camelot.getMoney() + light.getPriz());
            System.out.println(camelot);
            System.out.println("Вы заработали " + light.getPriz());

        } else {
            System.out.println("Вы проиграли!");
            System.out.println("Cила монстра против которого вы сражались была : " + light.getMenergy());
            camelot.setHealth(camelot.getHealth() - light.getMenergy());
            System.out.println(camelot);
            System.out.println("Ваше здоровье уменьшилось до " + camelot.getHealth());
        }

    }

    public void fightmiddleMonster() {
        camelot.setEnergy(camelot.getEnergy() - middle.getMenergy());
        if (camelot.getEnergy() > middle.getMenergy()) {
            System.out.println("Вы победили!");
            camelot.setMoney(camelot.getMoney() + middle.getPriz());
            System.out.println(camelot);
            System.out.println("Вы заработали " + middle.getPriz());

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
            camelot.setMoney(camelot.getMoney() + hard.getPriz());
            System.out.println(camelot);
            System.out.println("Вы заработали " + hard.getPriz());

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
            camelot.setMoney(camelot.getMoney() + boss.getPriz());
            System.out.println(camelot);
            System.out.println("Вы заработали " + boss.getPriz());

        } else {
            System.out.println("Вы проиграли!");
            System.out.println("Cила монстра против которого вы сражались была : " + boss.getMenergy());
            camelot.setHealth(camelot.getHealth() - boss.getMenergy());
            System.out.println(camelot);
            System.out.println("Ваше здоровье уменьшилось до " + camelot.getHealth());


        }


    }
}











