package Bank;

import PercentageCalculatingPackage.PercentageCalculating;
import Person.Person;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public abstract class Bank implements Comparable<Bank>, PercentageCalculating{
    private final String city;
    private final Integer bankID;
    private final Integer accountNum;
    Double depositValue;
    private final Integer openYear; // 2000..2022
    private final Integer openMonth; // 1..12
    private Person client;

    public Bank(String city, Integer bankID, Integer accountNum, Double depositValue,
                Integer openYear, Integer openMonth, Person client) {
        this.city = city;
        this.bankID = bankID;
        this.accountNum = accountNum;
        this.depositValue = depositValue;
        this.openYear = openYear;
        this.openMonth = openMonth;
        this.client = client;
    }

    public String getCity() {
        return city;
    }

    public Integer getBankID() {
        return bankID;
    }

    public Integer getAccountNum() { return accountNum; }

//    public void setAccountNum(Integer accountNum) { this.accountNum = accountNum; }

    public Double getDepositValue() { return depositValue; }

    public void setDepositValue(Double depositValue) { this.depositValue = depositValue; }

    public Integer getOpenYear() { return openYear; }

//    public void setOpenYear(Integer openYear) { this.openYear = openYear; }

    public Integer getOpenMonth() { return openMonth; }

//    public void setOpenMonth(Integer openMonth) { this.openMonth = openMonth; }

    public Person getClient() {
        return client;
    }

    public void setClient(Person client) {
        this.client = client;
    }

    public Integer getClientAge() {
        return client.getAge();
    }

    public String getClientName() {
        return client.getClientName();
    }

    @Override
    public String toString() {
        return "Bank{" +
                "city='" + city + '\'' +
                ", bankID=" + bankID +
                ", accountNum=" + accountNum +
                ", depositValue=" + depositValue +
                ", openYear=" + openYear +
                ", openMonth=" + openMonth +
                '}';
    }
    @Override
    public int compareTo(Bank otherAccount) {
        return Integer.compare(getBankID(), otherAccount.getBankID());
    }

    public static final void printByParameter(List<Bank> accList, Function<Bank, ?>... parameters) {
        for (Function<Bank, ?> parameter : parameters) {
            String result = accList.stream()
                    .map(parameter)
                    .map(String::valueOf)
                    .collect(Collectors.joining(", ", "[", "]"));
            System.out.println(result);
        }
    }

    public Bank modifyDepositValue(Double value){
        setDepositValue(value);
        return this;
    }
}
