package com.vip.lowLevelDesign.A_SOLID_Principles.A_SingleResponsibilityPrinciple.A_wrongApproach;

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
