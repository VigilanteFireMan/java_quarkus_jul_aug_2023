package com.herbalife.labs.lab04;

import static com.herbalife.labs.lab04.AccountConstants.CURRENT_ACCOUNT_WITHDRAW_LIMIT;

public class CurrentAccount extends Account {
    public CurrentAccount(int accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public int getWithdrawLimit() {
        return CURRENT_ACCOUNT_WITHDRAW_LIMIT;
    }
}
