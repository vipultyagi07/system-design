package com.vip.lowLevelDesign.A_SOLID_Principles.B_OpenClosePrinciple.A_wrongApproach;

public class InvoicePrint {
    Invoice invoice;

    public InvoicePrint(Invoice invoice) {
        this.invoice = invoice;
    }

    public void printInvoice(){
        // logic to print the Invoice
    }
}
