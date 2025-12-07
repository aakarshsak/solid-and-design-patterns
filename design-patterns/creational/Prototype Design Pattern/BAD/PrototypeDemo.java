package com.upgrad.designpatterns.creational.prototype.bad;

public class PrototypeDemo {
    public static void main(String[] args) {
        Media movie = new Movie();
        movie.setTitle("Shawshank Redemption");
        movie.setRating(9.2);

        System.out.println("ID: "+ movie);
        System.out.println(movie.getTitle());

        Media anotherMovie = new Movie();
        System.out.println("ID: "+ anotherMovie);
        System.out.println(anotherMovie.getTitle());

    }
}
