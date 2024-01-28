package com.vip.lowLevelDesign.C_ObserverDesignPattern.weatherMonitoringSystem.observable;

import com.vip.lowLevelDesign.C_ObserverDesignPattern.weatherMonitoringSystem.observer.Observer;

public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();
}