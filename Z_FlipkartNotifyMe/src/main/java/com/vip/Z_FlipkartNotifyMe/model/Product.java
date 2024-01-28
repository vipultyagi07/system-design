package com.vip.Z_FlipkartNotifyMe.model;
import com.vip.Z_FlipkartNotifyMe.observable.Subject;
import com.vip.Z_FlipkartNotifyMe.observer.Observer;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Product implements Subject {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private boolean inStock;

    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<SubscribersEntity> userEntities = new ArrayList<>();

    // Constructors, getters, setters

    @Override
    public void registerObserver(Observer observer) {
        if (observer instanceof SubscribersEntity) {
            SubscribersEntity user = (SubscribersEntity) observer;
            SubscribersEntity subscribersEntity = new SubscribersEntity();
            subscribersEntity.setId(user.getId());
            subscribersEntity.setEmail(user.getEmail());
            subscribersEntity.setMobileNumber(user.getMobileNumber());
            subscribersEntity.setUsername(user.getUsername());
            subscribersEntity.setProduct(this);
            userEntities.add(subscribersEntity);
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        if (observer instanceof SubscribersEntity) {
            SubscribersEntity user = (SubscribersEntity) observer;
            SubscribersEntity subscribersEntity = userEntities.stream()
                    .filter(u -> u.getUsername().equals(user.getUsername()))
                    .findFirst()
                    .orElse(null);

            if (subscribersEntity != null) {
                userEntities.remove(subscribersEntity);
            }
        }
    }

    @Override
    public void notifyObservers(List<SubscribersEntity> userEntities) {
        if (inStock) {
            for (SubscribersEntity subscribersEntity : userEntities) {
                // Fetch the corresponding SubscribersEntity object from the database and send the notification
                SubscribersEntity user = new SubscribersEntity();
                user.setUsername(subscribersEntity.getUsername());
                user.update(name);
                removeObserver(subscribersEntity);

            }

        }
    }

    public void setInStock(boolean inStock,List<SubscribersEntity> userEntities) {
        this.inStock = inStock;
        if (inStock) {
            notifyObservers(userEntities);
        }
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isInStock() {
        return inStock;
    }
}