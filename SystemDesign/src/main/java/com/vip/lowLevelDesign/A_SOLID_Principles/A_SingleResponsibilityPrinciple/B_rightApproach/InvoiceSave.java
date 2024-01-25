package com.vip.lowLevelDesign.A_SOLID_Principles.A_SingleResponsibilityPrinciple.B_rightApproach;

public class InvoiceSave {
    Invoice invoice;

    public InvoiceSave(Invoice invoice) {
        this.invoice = invoice;
    }
    public void saveTheDataToDB(){
        // logic to save the data into DB
    }
}
