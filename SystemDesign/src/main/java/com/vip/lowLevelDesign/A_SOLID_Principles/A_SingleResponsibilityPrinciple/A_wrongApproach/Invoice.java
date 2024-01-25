package com.vip.lowLevelDesign.A_SOLID_Principles.A_SingleResponsibilityPrinciple.A_wrongApproach;

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

    public void printInvoice(){
        // logic to print the Invoice
    }

    public void saveTheDataToDB(){
        // logic to save the data into DB
    }

}
