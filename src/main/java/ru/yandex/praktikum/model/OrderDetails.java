package ru.yandex.praktikum.model;

public class OrderDetails {
    public String startDate;
    public String duration;
    public boolean isScooterBlack;
    public boolean isScooterGrey;
    public String comment;

    public OrderDetails(String startDate, String duration, boolean isScooterBlack, boolean isScooterGrey, String comment) {
        this.startDate = startDate;
        this.duration = duration;
        this.isScooterBlack = isScooterBlack;
        this.isScooterGrey = isScooterGrey;
        this.comment = comment;
    }
}
