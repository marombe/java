package com.emjay;

public class TestAccounts {
    public static void main(String[] args) {
        Account acc1 = new Account("Emjay","001",6000);
        Account acc2 = new Account("Sly","002",4500);
        Account acc3 = new Account("Jemeli","003",7000);
        Account acc4 = new Account("Marvel","004",3000);
        Account acc5 = new Account(" nasra","005",6000);

        System.out.println(acc1.getBalance());
        acc1.setBalance(400000);
        System.out.println(acc1.getBalance());
        acc2.deposit(1000);
        acc2.printdetails();
        acc2.withdraw(300);
        acc2.printdetails();

        String name = "John";
        name.toLowerCase();
//        primitive
        int x = 10;
        double z = 80.2;
        boolean finished= true;


        Account[] accounts = {acc1,acc2,acc3,acc4,acc5};
        for(Account k: accounts )
        {
           k.deposit(100);
            k.printdetails();

        }


    }
}
