package com.vip.lowLevelDesign.C_ObserverDesignPattern.flipkartNotifyMe.observable;

import com.vip.lowLevelDesign.C_ObserverDesignPattern.flipkartNotifyMe.observers.Observer;

public interface Subject {
    void registerUser(Observer observer);
    void removeUser(Observer observer);
    void notifyUser();
}
