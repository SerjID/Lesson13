package Deposite;

import Bank.Bank;
import PercentageCalculatingPackage.PercentageCalculating;
import Person.Person;

public class ClassicDeposit extends Bank implements PercentageCalculating {
    public final String depositType = "Classic";
    public final Double interestRate = 0.07;

    public ClassicDeposit(String city, Integer bankID, Integer accountNum, Double depositValue,
                          Integer openYear, Integer openMonth,
                          Person client) {
        super(city, bankID, accountNum, depositValue, openYear, openMonth, client);
    }
    @Override
    public Double ExpectedProfitCalculating (Integer currentYear, Integer currentMonth){
        Integer yearsNum = currentYear - getOpenYear();
        Double depositProfitValue = 0.0;
        for (int i = 1; i <= yearsNum; i++) {
            depositProfitValue = depositProfitValue + getDepositValue()*interestRate;
        }
        //setDepositValue(getDepositValue() + depositProfitValue);
        return depositProfitValue;
    }
}
