package com.upgrad.designpatterns.principles.srp;


public class SRPDemo {
    public static void main(String[] args) {
        Account account = new Account(1000.0, "BANKAC123456789");
        Customer customer = new Customer("JANE DOE", account);

        System.out.println("Name: " + customer.getName());
        System.out.println("Account Number: " + customer.getAccount().getAccountNumber());
        System.out.println("Balance: " + account.getBalance());

        System.out.println("New Transaction: -222.2 ");
        account.transact(-222.2);
        System.out.println("New Balance: " + account.getBalance());
    }

}
