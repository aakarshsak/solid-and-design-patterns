package com.upgrad.designpatterns.behavioral.observer.good;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class NewsService implements Subject {
    private List<Observer> observers = new ArrayList<>();

    public String getNewsFlash(){
        String response = "";
        System.out.println("Enter the News Flash");
        try {

            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(System.in));
            response = reader.readLine();
            update(response);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return response;
    }

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void update(String msg) {
        for(Observer o: observers){
            o.update(msg);
        }
    }
}
