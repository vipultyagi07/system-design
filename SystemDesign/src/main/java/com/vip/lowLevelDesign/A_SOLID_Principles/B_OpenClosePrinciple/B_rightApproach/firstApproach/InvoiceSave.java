package com.vip.lowLevelDesign.A_SOLID_Principles.B_OpenClosePrinciple.B_rightApproach.firstApproach;

     interface InvoiceSave {

        public void save();
    }

     class DataBaseInvoiceSave implements InvoiceSave {
        Invoice invoice;

        public DataBaseInvoiceSave(Invoice invoice) {
            this.invoice = invoice;
        }
        public void save(){
            // logic to save the data into DB
        }
    }

    class FileInvoiceSave implements InvoiceSave {
        Invoice invoice;

        public FileInvoiceSave(Invoice invoice) {
            this.invoice = invoice;
        }
        public void save(){
            // logic to save the data into file
        }
    }




