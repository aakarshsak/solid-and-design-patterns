package com.upgrad.designpatterns.structural.facade.bad;

import com.upgrad.designpatterns.creational.singleton.Database;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class WithoutFacadeDemo {
    public static void main(String[] args) throws SQLException {
        Database dbInstance = Database.getInstance();
        Connection conn = dbInstance.getConnection();
        Statement statement = conn.createStatement();

        //   CREATE TABLE DEVICES
        statement.executeUpdate("CREATE TABLE Devices (ID INT, Name VARCHAR(20), Price VARCHAR(20))");
        System.out.println("Table Creation Completed.");

        //  INSERT RECORDS
        statement.execute(String.format("INSERT INTO Devices VALUES (%d, '%s', '%s')", 1, "Microwave", "INR 10,000"));
        statement.execute(String.format("INSERT INTO Devices VALUES (%d, '%s', '%s')", 2, "Washing Machine", "INR 15,000"));
        statement.execute(String.format("INSERT INTO Devices VALUES (%d, '%s', '%s')", 3, "Water Purifier", "INR 8,000"));
        System.out.println("Data Inserted");


        System.out.println("\n*********************\n");
        //  QUERY DEVICES FROM DB
        ResultSet resultSet = statement.executeQuery("SELECT * FROM Devices");

        while(resultSet.next())
        {
            System.out.println("ID: " + resultSet.getInt(1));
            System.out.println("Name: " + resultSet.getString(2));
            System.out.println("Price: " + resultSet.getString(3));
            System.out.println("*********************\n");
        }

//        statement.execute("DROP TABLE Devices");

        conn.close();
        resultSet.close();

    }
}
