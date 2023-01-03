package Deposite;

import Bank.Bank;
import PercentageCalculatingPackage.PercentageCalculating;
import Person.Person;

public class AccumulativeDeposit extends Bank implements PercentageCalculating {
    public final String depositType = "Accumulative";
    public final Double interestRate = 0.005;


    public AccumulativeDeposit(String city, Integer bankID, Integer accountNum, Double depositValue,
                               Integer openYear, Integer openMonth,
                               Person client) {
        super(city, bankID, accountNum, depositValue, openYear, openMonth, client);
    }

    public String getDepositType() { return depositType; }

    public Double getInterestRate() { return interestRate; }

    @Override
    public Double ExpectedProfitCalculating (Integer currentYear, Integer currentMonth){
        Integer yearsNum = currentYear - getOpenYear();
        Integer monthsNum = yearsNum*12 + currentMonth;
        Double depositProfitValue = 0.0;
        for (int i = 1; i <= monthsNum; i++) {
            depositProfitValue = depositProfitValue + getDepositValue()*interestRate;
        }
        //setDepositValue(getDepositValue() + depositProfitValue);
        return depositProfitValue;
    }
    public static Double CurrentAccumulativeDepositValueCalculating (Double depositValue, Double depositProfitValue){
        return depositValue + depositProfitValue;
    }
}
