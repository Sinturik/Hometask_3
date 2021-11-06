package com.purrweb;

public class Film {
    String director;
    String manufacturerCountry;
    int duration;

    public Film(int duration) {
        this.duration = duration;
    }

    //метод "показать фильм"
    public void showFilm(int N) {
        System.out.println("показан " + N + " раз");
    }

    //метод "отобразить длительность фильма"
    public void printDuration() {
        System.out.println("Длительность фильма " + this.duration + " мин");
    }
}
