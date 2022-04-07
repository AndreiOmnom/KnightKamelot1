package com.company;

import java.security.SecureRandom;
import java.util.Scanner;

public class Game {

    Scanner consol = new Scanner(System.in);
    SecureRandom random = new SecureRandom();

    // поле рыцарь
    KnightCamelot camelot = new KnightCamelot(100, 100, 1, 50);

    {

        camelot.health = 100;
        camelot.energy = 100;
        camelot.power = 1;
        camelot.money = 50;
    }
    // поле монстр

    Monstr light = new Monstr("Легкий монстр", random.nextInt(21) / 10 + 1);
    Monstr middle = new Monstr("Средний монстр", random.nextInt(21) / 10 + 2);
    Monstr hard = new Monstr("Тяжелый монстр", random.nextInt(31) / 10 + 1);
    Monstr boss = new Monstr("Босс монстр", random.nextInt(41) / 10 + 2);

    public Game() {
        System.out.println("Игра KnightCamelot запущена ");
    }

    public void playGame() {
        System.out.println("Приветствуем в нашей игре KnightCamelot");
        System.out.println("Уровень Вашего здоровья: " + camelot.health +
                "\n" + "Ваша энергия:  " + camelot.energy +
                "\n" + "Ваша сила: " + camelot.power +
                "\n" + "Ваши деньги: " + camelot.money);

        fightMonster();
    }


    public void fightMonster() {
        System.out.println("Выберите сложность монстра:" +
                " \n 1 - Легкий(1-10 strength) " +
                "\n 2  - Средний(11 - 20 strength) " +
                "\n 3  - Тяжелый(21-40 strength) " +
                "\n 4  - БОСС(41-50 strength)");

        viborMonstr();
    }
//    public     static void vibor () {
//
//    }
//    public static void findNumberInLoop(int number){
//        for (int i = 0; i < 10; i++) {
//            if (i == number) {
//                break;
//            }
//            System.out.println(i);
//        }
//        System.out.println("cycle was finished");

    public void viborMonstr() {
        int viborMonstr = consol.nextInt();

        if (viborMonstr == 1){

        System.out.println(light);}


        else {

        System.out.println(middle);}




    }
}



        //  public void fightEasyMonster() {
        //    energy -= 10;
        //    double monsterForce = random.nextInt(21) / 10;
        //   if (force > monsterForce) {
        //      System.out.println("Вы победили!");
        //     money += 5;

        //  } else
        //      System.out.println("Вы проиграли!");
        //  System.out.println("Cила монстра против которого вы сражались была : "+monsterForce );
        //  hp -= monsterForce;









