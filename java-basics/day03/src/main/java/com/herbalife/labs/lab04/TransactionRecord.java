package com.herbalife.labs.lab04;

import java.time.LocalDateTime;

public record TransactionRecord(int accountNumber, double amount, String transactionType, LocalDateTime localDateTime) {
}
