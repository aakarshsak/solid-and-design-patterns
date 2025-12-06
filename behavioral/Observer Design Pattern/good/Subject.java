package com.upgrad.designpatterns.behavioral.observer.good;

public interface Subject {
    void attach(Observer observer);
    void detach(Observer observer);
    void update(String msg);
}
