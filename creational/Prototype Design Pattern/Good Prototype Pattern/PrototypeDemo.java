package com.upgrad.designpatterns.creational.prototype.good;


public class PrototypeDemo {
    public static void main(String[] args) {
        Registry registry = new Registry();
        Movie movie = (Movie) registry.createEntry("Movie");
        movie.setTitle("Shawshank Redemption");
        movie.setRating(9.2);

        System.out.println("ID: "+ movie);
        System.out.println(movie.getDuration());
        System.out.println(movie.getTitle());

        Movie anotherMovie = (Movie) registry.createEntry("Movie");
        anotherMovie.setTitle("The Lord of the Rings: The return of the King");

        System.out.println("ID: "+ anotherMovie);
        System.out.println(anotherMovie.getDuration());
        System.out.println(anotherMovie.getTitle());
    }

}
