package com.company;

import java.util.*;

public class BankAccount_Comparator implements Comparator {

    public int compare(Object obj1, Object obj2) {
        BankAccount acc1 = (BankAccount) obj1;
        BankAccount acc2 = (BankAccount) obj2;
        if (acc1.balance > acc2.balance) {
            return 1;
        } else if (acc1.balance == acc2.balance) {
            return 0;
        } else {
            return -1;
        }
    }

}
