package com.upgrad.designpatterns.structural.proxy.good;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ProxyPayrollService {
    private final String currentUser;
    private final PayrollService payrollService;
    private final Boolean isAdmin;

    public ProxyPayrollService(String currentUser, PayrollService payrollService) {
        this.currentUser = currentUser;
        this.payrollService = payrollService;
        Boolean isAdmin = false;
        try {
            this.payrollService.createTable();
        } catch (SQLException err) {
        }
        try {
            isAdmin = payrollService.isAdminUser(this.currentUser);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        this.isAdmin = isAdmin;

    }

    public void createRecord(int id, String name, String title, String salary) throws SQLException {
        if(isAdmin) {
            payrollService.createRecord(id, name, title, salary);
        } else {
            System.out.println("Only Admin can call createRecord().");
        }
    }

    public void updateRecord(String name, String title, String salary) throws SQLException {
        if(isAdmin) {
            payrollService.updateRecord(name, title, salary);
        } else {
            System.out.println("Only Admin can call updateRecord().");
        }
    }

    public void getEmployeeRecords() throws SQLException {
        if(isAdmin) {
            payrollService.getEmployeeRecords();
        } else {
            System.out.println("Only Admin can call getEmployeeRecords().");
        }
    }



    public void getEmployeeRecordByName(String name) throws SQLException {
        if(isAdmin || this.currentUser.compareToIgnoreCase(name) == 0) {
            payrollService.getEmployeeRecordByName(name);
        } else {
            System.out.println("Only Admin or Owner can call getEmployeeRecordByName().");
        }
    }
}
