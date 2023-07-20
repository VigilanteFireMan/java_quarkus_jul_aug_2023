package com.herbalife.labs.lab04;

import static com.herbalife.labs.lab04.AccountConstants.PREMIUM_CURRENT_ACCOUNT_WITHDRAW_LIMIT;

public class PremiumCurrentAccount extends Account {
    public PremiumCurrentAccount(int accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public int getWithdrawLimit() {
        return PREMIUM_CURRENT_ACCOUNT_WITHDRAW_LIMIT;
    }

}
