package PercentageCalculatingPackage;

import Bank.Bank;

public interface PercentageCalculating {
    Double ExpectedProfitCalculating (Integer currentYear, Integer currentMonth);
    static Double CurrentDepositValueCalculating (Double depositValue, Double depositProfitValue){
        return depositValue + depositProfitValue;
    }
}
