package com.vip.lowLevelDesign.A_SOLID_Principles.A_SingleResponsibilityPrinciple.B_rightApproach;

public class Book {
    String name;
    String color;
    int year;
    int price;

    public Book(String name, String color, int year, int price) {
        this.name = name;
        this.color = color;
        this.year = year;
        this.price = price;
    }
}
