package com.purrweb;

public class Cat {
    String name;
    String color;
    int paws = 4;
    int age;

    public Cat(String name) {
        this.name = name;
    }

    //метод вырасти на 1 год
    public void grow() {
        age = age + 1;
    }

    //метод изменить цвет
    public void run() {
        System.out.println(this.name + " побежал!");
    }

    //метод говорить
    public void say(String sound) {
        System.out.println(sound + "!");
    }
}
