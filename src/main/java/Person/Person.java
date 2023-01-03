package Person;

import Bank.Bank;

public class Person {
    private String clientSurname;
    private String clientName;
    private Integer age;

    public Person(String clientSurname, String clientName, Integer age) {
        this.clientSurname = clientSurname;
        this.clientName = clientName;
        this.age = age;
    }

    public String getClientSurname() { return clientSurname; }

    public void setClientSurname(String clientSurname) { this.clientSurname = clientSurname; }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public Integer getAge() { return age; }

    public void setAge(Integer age) { this.age = age; }

    @Override
    public String toString() {
        return "Person{" +
                "clientSurname='" + clientSurname + '\'' +
                ", clientName='" + clientName + '\'' +
                ", age=" + age +
                '}';
    }
}
