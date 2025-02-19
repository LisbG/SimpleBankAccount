package com.lisboa.simplebankaccount.application;

import com.lisboa.simplebankaccount.model.entities.BankAccount;
import com.lisboa.simplebankaccount.model.exceptions.WithdrawExceedWithdrawLimit;
import com.lisboa.simplebankaccount.model.exceptions.WithdrawNotEnoughMoneyExceptions;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankAccount account;

        String holderName;
        double balance;
        double withDrawLimit;

        System.out.print("Enter account holder name: ");
        holderName = scanner.nextLine();

        System.out.println("Enter account balance: ");
        balance = scanner.nextDouble();

        System.out.print("Enter account withdraw limit: ");
        withDrawLimit = scanner.nextDouble();

        account = new BankAccount(holderName, balance, withDrawLimit);

        double withdrawAmount;
        do{

            System.out.print("Withdraw value: ");
            withdrawAmount = scanner.nextInt();

            try {
                account.withdraw(withdrawAmount);
            }
            catch (WithdrawNotEnoughMoneyExceptions e) {
                System.out.println("Error: " + e.getMessage());
            }
            catch (WithdrawExceedWithdrawLimit e) {
                System.out.println("Error: " + e.getMessage());
            }
            finally {
                System.out.println(account.getBalance());
            }
        } while (withdrawAmount != 0);

    }

}
