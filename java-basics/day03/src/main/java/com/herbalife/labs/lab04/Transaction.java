package com.herbalife.labs.lab04;

import java.time.LocalDateTime;

public class Transaction {
    private int accountNumber;
    private double amount;
    private String type;
    private LocalDateTime localDateTime;

    public Transaction(int accountNumber, double amount, String type) {
        this.accountNumber = accountNumber;
        this.amount = amount;
        this.type = type;
        localDateTime = LocalDateTime.now();
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "accountNumber=" + accountNumber +
                ", amount=" + amount +
                ", type='" + type + '\'' +
                ", localDateTime=" + localDateTime +
                '}';
    }
}
