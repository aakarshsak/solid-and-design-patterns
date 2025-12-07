package com.upgrad.designpatterns.creational.prototype.good;


public abstract class Media implements Cloneable {
    private String title;
    private String url;
    private double rating;

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String value) {
        this.title = value;
    }

    public double getRating() {
        return this.rating;
    }

    public void setRating(double value) {
        this.rating = value;
    }

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String value) {
        this.url = value;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
