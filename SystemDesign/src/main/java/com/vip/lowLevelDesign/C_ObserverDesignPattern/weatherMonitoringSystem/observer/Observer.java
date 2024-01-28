package com.vip.lowLevelDesign.C_ObserverDesignPattern.weatherMonitoringSystem.observer;

public interface Observer {

    public void update(float temp, float humidity, float pressure);
}