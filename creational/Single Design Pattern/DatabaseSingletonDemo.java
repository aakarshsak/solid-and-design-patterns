package com.upgrad.designpatterns.creational.singleton;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseSingletonDemo {
    public static void main(String[] args) {
        Database instance = Database.getInstance();

        long before = 0;
        long after = 0;
        Statement statement;

        System.out.println("DBInstance: " + instance);

        //		Create Connection the 1st Time
        before = System.currentTimeMillis();
        Connection conn = instance.getConnection();
        after = System.currentTimeMillis();

        System.out.println("Connection Creation Time: " + (after - before));


        try {
            statement = conn.createStatement();
            statement.executeUpdate("CREATE TABLE Superhero (ID INT, SuperPower VARCHAR(20), SideKick VARCHAR(20))");
            System.out.println("Table Creation Completed.");
            statement.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        //		Create Connection  again

        before = System.currentTimeMillis();
        conn = instance.getConnection();
        after = System.currentTimeMillis();


        System.out.println("Connection Creation Time: " + (after - before));


        System.out.println(conn);

        try {
            statement = conn.createStatement();
            ResultSet resultset = statement.executeQuery("Select * from Superhero");

            System.out.println("SuperHero ResultSet: " + resultset);
            resultset.close();
            statement.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
