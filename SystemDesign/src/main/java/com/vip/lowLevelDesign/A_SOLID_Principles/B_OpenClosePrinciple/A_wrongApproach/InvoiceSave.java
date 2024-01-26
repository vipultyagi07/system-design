package com.vip.lowLevelDesign.A_SOLID_Principles.B_OpenClosePrinciple.A_wrongApproach;

public class InvoiceSave {
    Invoice invoice;

    public InvoiceSave(Invoice invoice) {
        this.invoice = invoice;
    }

    public void saveTheDataToDB(){
        // logic to save the data into DB
    }

    public void saveTheDataToFile(){
        // logic to save the data into File
    }
}
