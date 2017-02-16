package com.company;

public class BankAccount {

    public BankAccount(String nm, double amt) {
            name = nm;
            balance = amt;
    }

    public int alphabetCompareTo (Object otherObject) {
        BankAccount otherAccount = (BankAccount) otherObject;
        int retValue;
        if (balance < otherAccount.balance) {
            retValue = -1;
        } else if (balance > otherAccount.balance) {
            retValue = 1;
        } else {
            retValue = 0;
        }
        return retValue;
    }

    public int balanceCompareTo (Object otherObject) {
        BankAccount otherAccount = (BankAccount) otherObject;
        return otherAccount.name.compareTo(otherAccount.name);
    }

    public void deposit(double dp) {
        balance += dp;
    }

    public void withdraw(double wd) {
        balance -= wd;
    }

    public String name;
    public double balance;

}
