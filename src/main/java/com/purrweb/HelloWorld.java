package com.purrweb;

public class HelloWorld {

    public static void main(String[] args) {
        //создание объектов класса Cats
        Cat Murzik = new Cat("Murzik");
        Murzik.color = "black";
        Murzik.age = 1;
        Cat Barsik = new Cat("Barsik");
        Barsik.color = "gray";
        Barsik.age = 3;

        //вызов метода grow
        Barsik.grow();
        System.out.println(Murzik.age + Barsik.age);

        //создание объектов класса Films
        Film GreenMile = new Film(120);
        Film Titanic = new Film(150);

        //вызов метода say, передача значения переменной sound
        Murzik.say("MEW");
        Barsik.say("Rrr");

        //вызов метода showFilm, передача значения переменной N
        GreenMile.showFilm(20);

        //System.out.println(Titanic.duration); почему в результате выводится 0?
        System.out.println(Titanic.duration);

        //вызов метода printDuration для Titanic
        Titanic.printDuration();

        //вызов метода run для Murzik
        Murzik.run();

        //проверка вывода значения переменных
        System.out.println("Цвет " + Murzik.name + ": " + Murzik.color);
        System.out.println("Возраст " + Murzik.name + ": " + Murzik.age);
        System.out.println("Цвет " + Barsik.name + ": " + Barsik.color);
        System.out.println("Возраст " + Barsik.name + ": " + Barsik.age);
        System.out.println("У " + Murzik.name + " и " + Barsik.name + " " + Murzik.paws + " лапы");
    }
}
