package com.lisboa.simplebankaccount.model.exceptions;

public class WithdrawExceedWithdrawLimit extends Exception {
    public WithdrawExceedWithdrawLimit(String message) {
        super(message);
    }
}
