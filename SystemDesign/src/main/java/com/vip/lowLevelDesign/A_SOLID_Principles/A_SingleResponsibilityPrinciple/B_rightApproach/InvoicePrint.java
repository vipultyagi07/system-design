package com.vip.lowLevelDesign.A_SOLID_Principles.A_SingleResponsibilityPrinciple.B_rightApproach;

public class InvoicePrint {
    Invoice invoice;

    public InvoicePrint(Invoice invoice) {
        this.invoice = invoice;
    }

    public void printInvoice(){
        // logic to print the Invoice
    }
}
