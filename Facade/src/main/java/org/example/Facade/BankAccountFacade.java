package org.example.Facade;

import org.example.Check.AccountNumberCheck;
import org.example.Check.FundsCheck;
import org.example.Check.SecurityCodeCheck;

public class BankAccountFacade {

    private int accountNumber;

    private int securityCode;

    private AccountNumberCheck accountNumberCheck;

    private SecurityCodeCheck securityCodeCheck;

    private FundsCheck fundsCheck;

    public BankAccountFacade(int newAccountNumber, int newSecurityCode) {
        accountNumber = newAccountNumber;
        securityCode = newSecurityCode;
        accountNumberCheck = new AccountNumberCheck();
        securityCodeCheck = new SecurityCodeCheck();
        fundsCheck = new FundsCheck();
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public int getSecurityCode() {
        return securityCode;
    }

    public void withdrawCash(double cashToGet) {
        if (accountNumberCheck.accountActive(getAccountNumber()) && securityCodeCheck.isCodeCorrect(getSecurityCode()) && fundsCheck.haveEnoughMoney(cashToGet)) {
            System.out.println("Transaction Complete\n");
        } else {
            System.out.println("Transaction Failed\n");
        }
    }

    public void depositCash(double cashToDeposit) {
        if (accountNumberCheck.accountActive(getAccountNumber()) && securityCodeCheck.isCodeCorrect(getSecurityCode())) {
            fundsCheck.makeDeposit(cashToDeposit);
            System.out.println("Transaction Complete\n");
        } else {
            System.out.println("Transaction Failed\n");
        }
    }


}
