package org.example;

public class Main {
    public static void main(String[] args) {

        BankAccount account = new BankAccount("Omar", "Karame", 100);

        account.deposit(1000);
        System.out.println(account.toString());
        account.withdraw(900);
        System.out.println(account.toString());
        account.withdraw(1000);

    }
}