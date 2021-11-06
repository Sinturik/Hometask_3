package com.purrweb;

import java.sql.SQLOutput;

public class HelloWorld {

    public static void main(String[] args) {
        //создание объектов класса Cats
        Cats Murzik = new Cats();
        Cats Barsik = new Cats();

        //вызов метода grow
        Barsik.grow();
        System.out.println(Murzik.age+ Barsik.age);

        //создание объектов класса Films
        Films GreenMile = new Films(120);
        Films Titanic = new Films(150);



        //вызов метода say, передача значения переменной sound
        Murzik.say("MEW");
        Barsik.say("Rrr");

        //вызов метода showFilm, передача значения переменной N
        GreenMile.showFilm(20);

        //System.out.println(Titanic.duration); почему в результате выводится 0?
        System.out.println(Titanic.duration);

        //вызов метода printDuration для Titanic
        Titanic.printDuration();










    }
}
