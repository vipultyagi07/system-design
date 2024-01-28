package com.vip.Z_FlipkartNotifyMe.model;

import com.vip.Z_FlipkartNotifyMe.observer.Observer;
import jakarta.persistence.*;


@Entity
public class SubscribersEntity implements Observer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;

    private String email;

    private String mobileNumber;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    @Override
    public void update(String productName) {
        System.out.println("Notification sent to user " + username + ": " + productName + " is back in stock!");

        // Implement actual notification mechanisms (email, push notification, etc.) here
    }
}
