package com.upgrad.designpatterns.structural.proxy.good;

import java.sql.SQLException;

public class ProxyDemo {
    public static void main(String[] args) throws SQLException {
        String admin = "Alfred";

        System.out.println("LOGGED IN AS: " + admin);
        ProxyPayrollService proxyPayrollService = new ProxyPayrollService(admin,new PayrollService());
        proxyPayrollService.getEmployeeRecords();

        proxyPayrollService.createRecord(2,"Ben", "Admin", "USD 100,000");
        proxyPayrollService.createRecord(3,"Andy", "Analyst","USD 70,000");
        proxyPayrollService.createRecord(4,"Rachel", "Manager","USD 120,000");

        proxyPayrollService.getEmployeeRecords();


        admin = "Andy";
        proxyPayrollService = new ProxyPayrollService(admin,new PayrollService());

        System.out.println("LOGGED IN AS: " + admin);
        proxyPayrollService.updateRecord("Andy", "Senior Analyst", "USD 110,000");


        admin = "Ben";
        proxyPayrollService = new ProxyPayrollService(admin,new PayrollService());
        System.out.println("LOGGED IN AS: " + admin);
        proxyPayrollService.getEmployeeRecordByName("Andy");
        proxyPayrollService.updateRecord("Andy", "Senior Analyst", "USD 110,000");

    }
}
