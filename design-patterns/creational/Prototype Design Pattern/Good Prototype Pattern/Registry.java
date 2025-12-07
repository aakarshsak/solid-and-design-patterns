package com.upgrad.designpatterns.creational.prototype.good;


import java.util.HashMap;
import java.util.Map;

public class Registry {
    private Map<String, Media> entries = new HashMap<String, Media>();

    public Registry() {
        loadEntries();
    }

    public Media createEntry(String type) {
        Media media = null;

        try {
            media = (Media) (entries.get(type)).clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return media;
    }

    private void loadEntries() {
        Movie movie = new Movie();
        movie.setTitle("The Godfather");
        movie.setRating(9.2);
        movie.setDuration("2.55 hours");
        entries.put("Movie", movie);

        TVShow tvshow = new TVShow();
        tvshow.setSeasons(10);
        tvshow.setRating(8.9);
        tvshow.setTitle("FRIENDS");
        entries.put("TVShow", tvshow);
    }

}
