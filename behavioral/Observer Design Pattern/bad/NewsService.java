package com.upgrad.designpatterns.behavioral.observer.bad;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NewsService {
    public String getNewsFlash(){
        String response = "";
        System.out.println("Enter the News Flash");
        try {

            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(System.in));
            response = reader.readLine();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return response;
    }
}
