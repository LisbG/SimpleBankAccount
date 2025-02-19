package com.lisboa.simplebankaccount.model.exceptions;

public class WithdrawNotEnoughMoneyExceptions extends Exception {
    public WithdrawNotEnoughMoneyExceptions(String message) {
        super(message);
    }
}
