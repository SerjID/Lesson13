package org.example;

import Bank.Bank;
import Deposite.AccumulativeDeposit;
import Deposite.ClassicDeposit;
import Deposite.InvestmentDeposit;
import Person.Person;
import Comporators.CompareByCityComparator;
import Comporators.CompareByAccountNumComparator;
import PercentageCalculatingPackage.PercentageCalculating;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Person client1 = new Person("Kuk","Alex", 25);
        Person client2 = new Person("Second","Nord", 20);
        Person client3 = new Person("Third", "Bob", 30);
        Bank acc1 = new AccumulativeDeposit("Kyiv",20, 101,1000.1,
                2012,  1, client1);
        Bank acc2 = new ClassicDeposit("Kyiv",12, 102,1002.1,
                2015,  1, client2);
        Bank acc3 = new InvestmentDeposit("Kharkiv",17, 103,1003.1,
                2013,  1, client3);

        List<Bank> accountsList = Arrays.asList(acc1,acc2,acc3);
        System.out.println("AccList before sort: " + accountsList);
        Collections.sort(accountsList); // sort by bank ID
        System.out.println("AccList After sort: " + accountsList);
        Bank.printByParameter(accountsList, Bank::getCity);
        CompareByAccountNumComparator compareByAccountNum = new CompareByAccountNumComparator();
        Collections.sort(accountsList, compareByAccountNum);
        Bank.printByParameter(accountsList, Bank::getAccountNum);
        CompareByCityComparator compareByCity = new CompareByCityComparator();
        Collections.sort(accountsList, compareByCity);
        Bank.printByParameter(accountsList, Bank::getCity);

        Comparator<Bank> compareByAge = Comparator.comparing(Bank::getClientAge);
        Collections.sort(accountsList, compareByAge);
        Bank.printByParameter(accountsList, Bank::getClientName);

        Comparator compareByOpenYear =
                Comparator.comparingInt((Bank account) -> account.getOpenYear());
        Collections.sort(accountsList, compareByOpenYear);
        Bank.printByParameter(accountsList, Bank::getAccountNum);

        Comparator compareByDepositValue =
                Comparator.comparingDouble((Bank account) -> account.getDepositValue());
        accountsList.stream()
                .map(acc -> acc.modifyDepositValue(acc.getDepositValue()+acc.ExpectedProfitCalculating(2023,1)))
                .forEach(System.out::println);
        Collections.sort(accountsList, compareByDepositValue);
        System.out.println("AccList After depositSort: " + accountsList);
    }
}