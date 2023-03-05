package ru.yandex.praktikum.model;

public class Customer {
    public String firstName;
    public String lastName;
    public String orderAddress;
    public String metroStation;
    public String phoneNumber;

    public Customer(String firstName, String lastName, String orderAddress, String metroStation, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.orderAddress = orderAddress;
        this.metroStation = metroStation;
        this.phoneNumber = phoneNumber;
    }
}
