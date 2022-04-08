package com.company;

import javax.xml.namespace.QName;
import java.security.SecureRandom;
import java.util.Scanner;

public class Game {
    Scanner consol = new Scanner(System.in);
    SecureRandom random = new SecureRandom();

    // поле рыцарь
    KnightCamelot camelot = new KnightCamelot(100, 100, 2.0, 50);

    {

        camelot.health = 100;
        camelot.energy = 100;
        camelot.power = 2;
        camelot.money = 50;

    }
    // поле монстр

    Monstr light = new Monstr("--Легкий монстр", random.nextInt(11) / 10 + 1, 5);
    Monstr middle = new Monstr("--Средний монстр", random.nextInt(21) / 10 + 2, 10);
    Monstr hard = new Monstr("--Тяжелый монстр", random.nextInt(31) / 10 + 1, 20);
    Monstr boss = new Monstr("--Босс монстр", random.nextInt(41) / 10 + 1, 35);


    public Game() {
        System.out.println("Игра KnightCamelot запущена ");
        namehero();
        while (camelot.health > 0 && camelot.energy > 0) {
            fightMonster();
        }
    }

    public void playGame() {
    }


    public void fightMonster() {

        System.out.println("Выберите сложность монстра:" +
                " \n 1 - Легкий(1-10) " +
                "\n 2  - Средний(11-20) " +
                "\n 3  - Тяжелый(21-40) " +
                "\n 4  - БОСС(41-50)");

        viborMonstr();
    }

    public void namehero() {
        System.out.println("Введите имя героя");
        String name = consol.nextLine();
        System.out.println(name + "-привет");

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
        camelot.energy -= light.menergy;
        if (camelot.power > light.menergy) {
            System.out.println("Вы победили!");
            camelot.money += light.priz;
            System.out.println(camelot);
            System.out.println("Вы заработали " + light.priz);

        } else {
            System.out.println("Вы проиграли!");
            System.out.println("Cила монстра против которого вы сражались была : " + light.menergy);
            camelot.health -= light.menergy;
            System.out.println(camelot);
            System.out.println("Ваше здоровье уменьшилось до " + camelot.health);
        }

    }

    public void fightmiddleMonster() {
        camelot.energy -= middle.menergy;
        if (camelot.power > middle.menergy) {
            System.out.println("Вы победили!");
            camelot.money += middle.priz;
            System.out.println(camelot);
            System.out.println("Вы заработали " + middle.priz);


        } else {
            System.out.println("Вы проиграли!");
            System.out.println("Cила монстра против которого вы сражались была : " + middle.menergy);
            camelot.health -= middle.menergy;
            System.out.println(camelot);
            System.out.println("Ваше здоровье уменьшилось до " + camelot.health);
        }

    }

    public void fighthardMonster() {
        camelot.energy -= hard.menergy;
        if (camelot.power > hard.menergy) {
            System.out.println("Вы победили!");
            camelot.money += hard.priz;
            System.out.println(camelot);
            System.out.println("Вы заработали " + hard.priz);


        } else {
            System.out.println("Вы проиграли!");
            System.out.println("Cила монстра против которого вы сражались была : " + hard.menergy);
            camelot.health -= hard.menergy;
            System.out.println(camelot);
            System.out.println("Ваше здоровье уменьшилось до " + camelot.health);

        }
    }
        public void fightBossMonster () {
            camelot.energy -= boss.menergy;
            if (camelot.power > boss.menergy) {
                System.out.println("Вы победили!");
                camelot.money += boss.priz;
                System.out.println(camelot);
                System.out.println("Вы заработали " + boss.priz);


            } else
                System.out.println("Вы проиграли!");
            System.out.println("Cила монстра против которого вы сражались была : " + boss.menergy);
            camelot.health -= boss.menergy;
            System.out.println(camelot);
            System.out.println("Ваше здоровье уменьшилось до " + camelot.health);

        }

}











