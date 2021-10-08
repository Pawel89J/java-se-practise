package com.challenge;

public class BankMain {

    public static void main(String[] args) {

	     Account dimasAccount = new Account("12345", 0.00, "Dima Dmytrovych", "Dima@myemail.com", "(048) 123-4567");
        System.out.println(dimasAccount.getNumber());
        System.out.println(dimasAccount.getBalance());

         dimasAccount.withdrawal(100.0);

         dimasAccount.deposit(50.0);
         dimasAccount.withdrawal(100.0);

         dimasAccount.deposit(51.0);
         dimasAccount.withdrawal(100.0);

        Account pawelsAccount = new Account("Pawel", "pawel@myemail.com", "12345");
        System.out.println(pawelsAccount.getNumber() + " name " + pawelsAccount.getCustomerName());
        System.out.println("Current balance is " + pawelsAccount.getBalance());
        pawelsAccount.withdrawal(100.55);

        VipPerson person1 = new VipPerson();
        System.out.println(person1.getName());

        VipPerson person2 = new VipPerson("Dima", 25000.00);
        System.out.println(person2.getName());

        VipPerson person3 = new VipPerson("Pawel", 100.00, "pawel@myemail.com");
        System.out.println(person3.getName());
        System.out.println(person3.getEmailAddress());
    }
}
