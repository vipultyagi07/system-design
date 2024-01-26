package com.vip.lowLevelDesign.A_SOLID_Principles.D_InterfaceSegmentedPrinciple.A_wrongApproach;

    interface RestaurantEmployee {
        void washDishes();

        void serveCustomer();

        void cookFood();

    }

    class Waiter implements RestaurantEmployee{

        @Override
        public void washDishes() {
        // not the working of waiter
        }
        @Override
        public void serveCustomer() {
            // this is the main working of the waiter, but due to the interface property we have to implement all the methods
        }
        @Override
        public void cookFood() {
            // not the working of waiter
        }
    }
