package com.lisboa.simplebankaccount.model.exceptions;

public class WithdrawExceedWithdrawLimit extends RuntimeException {
    public WithdrawExceedWithdrawLimit(String message) {
        super(message);
    }
}
