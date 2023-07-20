package com.herbalife.labs.lab04;

import java.util.stream.IntStream;

public class AccountUser {
    public static void main(String[] args) {
        Account account = new Account(132434, 100000);
        account.deposit(10000);
        account.withdraw(100);
        account.withdraw(100);
        account.withdraw(100);
        account.withdraw(100);
        account.withdraw(100);
        System.out.println("Balance of %s is %s".formatted(account.getAccountNumber(), account.getBalance()));
        account.printStatement();
        System.out.println();

        Account currAccount = new CurrentAccount(1132434, 10000000);
        currAccount.deposit(10000);
        currAccount.withdraw(100);
        currAccount.withdraw(100);
        currAccount.withdraw(100);
        currAccount.withdraw(100);
        currAccount.withdraw(100);
        currAccount.withdraw(100);
        currAccount.withdraw(100);
        currAccount.withdraw(100);
        currAccount.withdraw(100);
        currAccount.withdraw(100);
        currAccount.withdraw(100);
        currAccount.withdraw(100);
        currAccount.withdraw(100);
        System.out.println("Balance of %s is %s".formatted(currAccount.getAccountNumber(), currAccount.getBalance()));
        currAccount.printStatement();
        System.out.println();
        Account premiumCurrAccount = new PremiumCurrentAccount(11132434, 100000000);
        premiumCurrAccount.deposit(100000);
        IntStream
                .range(1, 111)
                .forEach(num -> premiumCurrAccount.withdraw(num * 100));
        System.out.println("Balance of %s is %s".formatted(premiumCurrAccount.getAccountNumber(), premiumCurrAccount.getBalance()));
        premiumCurrAccount.printStatement();
    }
}
