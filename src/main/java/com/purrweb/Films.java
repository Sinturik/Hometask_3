    package com.purrweb;

    public class Films {
    String director;
    String manufacturerCountry;
     int duration;

        public Films (int duration) {
            this.duration = duration;
        }

    public void showFilm (int N){
        System.out.println("показан "+ N + " раз");
    }

    public void printDuration(){
        System.out.println("Длительность фильма "+ this.duration + " мин");
    }




}
