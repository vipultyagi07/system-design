package com.vip.Z_FlipkartNotifyMe.observable;

import com.vip.Z_FlipkartNotifyMe.model.SubscribersEntity;
import com.vip.Z_FlipkartNotifyMe.observer.Observer;

import java.util.List;

public interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers(List<SubscribersEntity> userEntities);
}