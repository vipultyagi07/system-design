package com.vip.lowLevelDesign.C_ObserverDesignPattern.flipkartNotifyMe.observable;

import com.vip.lowLevelDesign.C_ObserverDesignPattern.flipkartNotifyMe.observers.Observer;

import java.util.ArrayList;

public class Product implements Subject{

    private ArrayList observers;
    private String name;
    private String email;
    private boolean inStock;

    public Product() {
        observers = new ArrayList();

    }
    @Override
    public void registerUser(Observer observer) {
        observers.add(observer);

    }
    @Override
    public void removeUser(Observer observer) {
        int i = observers.indexOf(observer);
        if (i >= 0) {
            observers.remove(i);
        }
    }
    @Override
    public void notifyUser() {
        for (int i = 0; i < observers.size(); i++) {
            Observer observer = (Observer) observers.get(i);
            observer.update();
        }
    }
    public void setInStock(boolean inStock) {
        this.inStock = inStock;
        if (inStock) {
            notifyUser();
        }
    }

}
