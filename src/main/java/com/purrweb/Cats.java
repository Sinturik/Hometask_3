package com.purrweb;

public class Cats {
    String color= "black";
    int paws =4;
    int age =1;

    //метод вырасти на 1 год
    public void grow () {
        age = age +1;
    }

    //метод изменить цвет
    public void changeColor () {
        color = "gray";
    }
    //метод говорить
    public void say(String sound){
        System.out.println(sound+ "!");
    }


}
