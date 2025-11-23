package com.upgrad.designpatterns.structural.facade.good;

import java.sql.SQLException;

public class FacadeDemo {
    public static void main(String[] args) throws SQLException {
        DatabaseServiceFacade facade = new DatabaseServiceFacade();

        System.out.println(facade.isConnected());
        facade.createTable();
        facade.create(1,"iPhone", "INR50,000");
        facade.create(2,"Macbook", "INR90,000");

        System.out.println("\n\n*********************");
        System.out.println("   RECORDS FROM DB");
        System.out.println("*********************\n");
        facade.getRecords();
        facade.deleteTable();
    }

}
