package com.upgrad.designpatterns.structural.proxy.good;

import com.upgrad.designpatterns.creational.singleton.Database;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PayrollService {
    Database dbInstance;

    public PayrollService() {
        this.dbInstance = Database.getInstance();
    }

    public void createTable() throws SQLException {
        Statement statement = getStatement();
        statement.executeUpdate("CREATE TABLE Employees (ID INT, Name VARCHAR(20), Title VARCHAR(40), Salary VARCHAR(20))");
        statement.execute("INSERT INTO Employees VALUES (1, 'Alfred', 'Admin', '0')");
        System.out.println("Table Creation Completed.");
        statement.close();
    }

    public void createRecord(int id, String name, String title, String salary) throws SQLException {
        Statement statement = getStatement();
        statement.execute(String.format("INSERT INTO Employees VALUES (%d, '%s', '%s', '%s')", id, name, title,salary));
        System.out.println("1 Row Inserted");
        statement.close();
    }

    public void updateRecord(String name, String title, String salary) throws SQLException {
        Statement statement = getStatement();
        statement.execute(String.format("UPDATE Employees SET Salary = '%s', Title = '%s' WHERE Name='%s'", salary, title, name));
        System.out.println("1 Row Updated");
        statement.close();
    }

    public void getEmployeeRecordByName(String name) throws SQLException {
        Statement statement = getStatement();
        ResultSet resultSet = statement.executeQuery(String.format("SELECT * FROM Employees WHERE Name='%s'", name));
        while(resultSet.next())
        {
            System.out.println("\n*********************");
            System.out.println("ID: " + resultSet.getInt(1));
            System.out.println("Name: " + resultSet.getString(2));
            System.out.println("Title: " + resultSet.getString(3));
            System.out.println("Salary: " + resultSet.getString(4));
            System.out.println("*********************\n");
        }
        statement.close();
        resultSet.close();
    }

    public void getEmployeeRecords() throws SQLException {
        Statement statement = getStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM Employees");
        while(resultSet.next())
        {
            System.out.println("\n*********************");
            System.out.println("ID: " + resultSet.getInt(1));
            System.out.println("Name: " + resultSet.getString(2));
            System.out.println("Title: " + resultSet.getString(3));
            System.out.println("Salary: " + resultSet.getString(4));
            System.out.println("*********************\n");
        }
        statement.close();
        resultSet.close();
    }

    public Boolean isAdminUser(String name) throws SQLException {
        Statement statement = getStatement();
        ResultSet resultSet = statement.executeQuery(String.format("SELECT * FROM Employees WHERE Name='%s'", name));
        Boolean isAdmin = false;
        while(resultSet.next())
        {
            isAdmin = "admin".compareToIgnoreCase(resultSet.getString(3)) == 0;
        }
        statement.close();
        resultSet.close();
        return isAdmin;
    }

    private Statement getStatement() throws SQLException {
        Connection conn = dbInstance.getConnection();
        return conn.createStatement();
    }
}
