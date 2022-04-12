package com.company;

import java.security.SecureRandom;
import java.security.Security;
import java.util.Scanner;

public class
        Main {

    //Создадим в классе main обьект класса Game чтобы мы могли запустить игру
    static Game game = new Game();

    //В методе main мы вызовем метод который запускает игру, причём конструктор класса к этому моменту уже сработал
    public static void main(String[] args) {
        game.playGame();

    }

}

