package com.upgrad.designpatterns.structural.facade.good;


import com.upgrad.designpatterns.creational.singleton.Database;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseServiceFacade {
    private Database dbInstance;

    public DatabaseServiceFacade() {
        this.dbInstance = Database.getInstance();
    }

    public Boolean isConnected() throws SQLException {
        return dbInstance.getConnection().isClosed();
    }

    public void createTable() throws SQLException {
        Statement statement = getStatement();
        statement.executeUpdate("CREATE TABLE Devices (ID INT, Name VARCHAR(20), Price VARCHAR(20))");
        System.out.println("Table Creation Completed.");
        statement.close();
    }


    public void deleteTable() throws SQLException {
        Statement statement = getStatement();
        statement.executeUpdate("DROP TABLE Devices");
        System.out.println("Table Deleted.");
        statement.close();
    }

    public void create(int id, String name, String price) throws SQLException {
        Statement statement = getStatement();
        statement.execute(String.format("INSERT INTO Devices VALUES (%d, '%s', '%s')", id, name, price));
        System.out.println("1 Row Inserted");
        statement.close();
    }

    public void getRecords() throws SQLException {
        Statement statement = getStatement();
        ResultSet resultSet = statement.executeQuery(String.format("SELECT * from Devices"));
        while(resultSet.next())
        {
            System.out.println("ID: " + resultSet.getInt(1));
            System.out.println("Name: " + resultSet.getString(2));
            System.out.println("Price: " + resultSet.getString(3));
            System.out.println("*********************\n");
        }
        statement.close();
        resultSet.close();
    }

    private Statement getStatement() throws SQLException {
        Connection conn = dbInstance.getConnection();
        return conn.createStatement();
    }
}
