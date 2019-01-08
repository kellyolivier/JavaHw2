package com.company;

public class Person {
    private String name;
    private int age;
    private String phoneNumber;
    private double totalMoney;

    public Person(int newAge, String newName, String newPhone, double newMoney)
    {
        name = newName;
        age = newAge;
        phoneNumber = newPhone;
        totalMoney = newMoney;
    }

    public void addPay(double pay)
    {
        totalMoney += pay;
    }

    //setters
    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public double getTotalMoney() { return totalMoney; }

    // getters
    public void setPhoneNumber(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }
    public void setAge(int age) {
        this.age = age;
    } //TODO FIGURE OUT CHECKS FOR AGE CHANGE
    public void setName(String name) {
        this.name = name;
    }
    public void setTotalMoney(double totalMoney) { this.totalMoney = totalMoney; }
}
