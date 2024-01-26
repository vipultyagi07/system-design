package com.vip.lowLevelDesign.A_SOLID_Principles.B_OpenClosePrinciple.B_rightApproach.firstApproach;

public class Invoice {
    private Book book;
    private int quantity;

    public Invoice(Book book, int quantity) {
        this.book = book;
        this.quantity = quantity;
    }
    public int calculateTotal(){
        int price =((book.price)*this.quantity);
        return price;
    }




}
