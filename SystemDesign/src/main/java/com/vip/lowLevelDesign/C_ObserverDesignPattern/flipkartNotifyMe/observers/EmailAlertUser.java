package com.vip.lowLevelDesign.C_ObserverDesignPattern.flipkartNotifyMe.observers;
import com.vip.lowLevelDesign.C_ObserverDesignPattern.flipkartNotifyMe.observable.Subject;

public class EmailAlertUser implements Observer{

    private Subject subject;
    public EmailAlertUser(Subject product) {

        this.subject=product;
        product.registerUser(this);
    }

    @Override
    public void update() {

        display();
    }

    public void display() {
        System.out.println("Dear email user product is back in stock");
    }
}
