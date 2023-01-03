package Comporators;

import Bank.Bank;

import java.util.Comparator;

public class CompareByAccountNumComparator implements Comparator<Bank> {
    @Override
    public int compare (Bank bank1, Bank bank2){
        return Integer.compare(bank1.getAccountNum(), bank2.getAccountNum());
    }
}
