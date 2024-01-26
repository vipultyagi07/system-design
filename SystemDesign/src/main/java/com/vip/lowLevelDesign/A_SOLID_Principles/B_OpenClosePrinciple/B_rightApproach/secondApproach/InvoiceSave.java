package com.vip.lowLevelDesign.A_SOLID_Principles.B_OpenClosePrinciple.B_rightApproach.secondApproach;

import com.vip.lowLevelDesign.A_SOLID_Principles.A_SingleResponsibilityPrinciple.B_rightApproach.Invoice;

public class InvoiceSave extends InvoiceSaveFile {
    com.vip.lowLevelDesign.A_SOLID_Principles.A_SingleResponsibilityPrinciple.B_rightApproach.Invoice invoice;

    public InvoiceSave(Invoice invoice) {
        this.invoice = invoice;
    }

    public void saveTheDataToDB(){
        // logic to save the data into DB
    }
}
