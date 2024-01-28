package com.vip.lowLevelDesign.C_ObserverDesignPattern.flipkartNotifyMe.observers;

import com.vip.lowLevelDesign.C_ObserverDesignPattern.flipkartNotifyMe.observable.Subject;

public class SmsAlerUser implements Observer {
    private Subject subject;
    public SmsAlerUser(Subject product) {

        this.subject=product;
        product.registerUser(this);
    }

    @Override
    public void update() {

        display();
    }

    public void display() {
        System.out.println("Dear sms user product is back in stock");
    }
}
