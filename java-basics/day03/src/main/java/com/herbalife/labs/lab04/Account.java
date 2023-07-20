package com.herbalife.labs.lab04;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import static com.herbalife.labs.lab04.AccountConstants.*;

public class Account {
    private int accountNumber;
    private double balance;
    private int withdrawCount;
    private List<Transaction> transactions;
    private List<TransactionRecord> transactionRecords;

    public Account(int accountNumber, double balance) {
        if(balance < MIN_BALANCE) {
            throw new RuntimeException("Minimum balance should be %s".formatted(MIN_BALANCE));
        }
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.transactions = new ArrayList<>();
        this.transactionRecords = new ArrayList<>();
    }

    public int getWithdrawLimit() {
        return ACCOUNT_WITHDRAW_LIMIT;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
        this.transactions.add(new Transaction(accountNumber, amount, TransactionType.CREDIT.toString()));
        this.transactionRecords.add(new TransactionRecord(accountNumber, amount, TransactionType.CREDIT.toString(), LocalDateTime.now()));
    }

    public void withdraw(double amount) {
        withdrawCount++;
        balance -= amount;
        this.transactions.add(new Transaction(accountNumber, amount, TransactionType.DEBIT.toString()));
        this.transactionRecords.add(new TransactionRecord(accountNumber, amount, TransactionType.DEBIT.toString(), LocalDateTime.now()));
        if (withdrawCount > getWithdrawLimit()) {
            double fee = amount * WITHDRAW_FEE;
            balance -= fee;
            this.transactions.add(new Transaction(accountNumber, amount, TransactionType.FEE.toString()));
            this.transactionRecords.add(new TransactionRecord(accountNumber, amount, TransactionType.FEE.toString(), LocalDateTime.now()));
        }
    }

    public void printStatement() {
        this.transactions.forEach(System.out::println);
        this.transactionRecords.forEach(System.out::println);

        //OLD STYLE
//        for (int i = 0; i < this.transactions.size(); i++) {
//            System.out.println(this.transactions.get(i));
//        }
    }
}
