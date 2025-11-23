package com.upgrad.designpatterns.structural.proxy.bad;

import java.sql.SQLException;

public class PayrollDemo {
    public static void main(String[] args) throws SQLException {
        PayrollService payrollService = new PayrollService();

        payrollService.createTable();
        payrollService.createRecord(1,"Ben", "Admin", "USD 100,000");
        payrollService.createRecord(2,"Andy", "Analyst","USD 70,000");
        payrollService.createRecord(3,"Rachel", "Manager","USD 120,000");

        payrollService.getEmployeeRecordByName("Andy");
        payrollService.updateRecord("Andy","Senior Analyst", "USD 110,000");
        payrollService.getEmployeeRecordByName("Andy");

    }
}
