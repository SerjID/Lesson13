package Comporators;

import Bank.Bank;


import java.util.Comparator;

public class CompareByCityComparator implements Comparator<Bank> {
    @Override
    public int compare(Bank bank1, Bank bank2) {
        return bank1.getCity().compareToIgnoreCase(bank2.getCity());
    }
}
