package com.purrweb;

public class Film {
    String director;
    String manufacturerCountry;
    int duration;

    public Film(int duration) {
        this.duration = duration;
    }

    public void showFilm(int N) {
        System.out.println("показан " + N + " раз");
    }

    public void printDuration() {
        System.out.println("Длительность фильма " + this.duration + " мин");
    }
}
