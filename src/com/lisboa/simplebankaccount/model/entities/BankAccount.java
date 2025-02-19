package com.lisboa.simplebankaccount.model.entities;

import com.lisboa.simplebankaccount.model.exceptions.WithdrawExceedWithdrawLimit;
import com.lisboa.simplebankaccount.model.exceptions.WithdrawNotEnoughMoneyExceptions;

public class BankAccount {

    private final String accountNumber;
    private final String holderName;
    private Double balance;
    private final Double withDrawLimit;

    public BankAccount(String holderName, Double balance, Double withDrawLimit) {
        this.accountNumber = RandomId.createRandomId();
        this.holderName = holderName;
        this.balance = balance;
        this.withDrawLimit = withDrawLimit;
    }

    public Double getBalance() {
        return balance;
    }

    public void withdraw(Double amount) throws WithdrawNotEnoughMoneyExceptions {

        if (amount > this.balance) {
            throw new WithdrawNotEnoughMoneyExceptions("The amount exceed the total cash in balance!");
        } else if (amount > this.withDrawLimit) {
            throw new WithdrawExceedWithdrawLimit("The amount exceed the withdraw limit!");
        }

        this.balance -= amount;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber='" + accountNumber + '\'' +
                ", holderName='" + holderName + '\'' +
                ", balance=" + balance +
                ", withDrawLimit=" + withDrawLimit +
                '}';
    }
}
