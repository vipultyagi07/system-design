package com.vip.lowLevelDesign.A_SOLID_Principles.D_InterfaceSegmentedPrinciple.B_rightApproach;

interface WaiterInterface {
        void takeOrder();

        void serveCustomer();


    }
    
    class Waiter implements WaiterInterface {

        @Override
        public void takeOrder() {
        //this is the  working of waiter
        }
        @Override
        public void serveCustomer() {
            // this is the  working of the waiter
        }
    }
