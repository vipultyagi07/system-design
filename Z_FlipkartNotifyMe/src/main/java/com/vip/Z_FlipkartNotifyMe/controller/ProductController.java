package com.vip.Z_FlipkartNotifyMe.controller;

import com.vip.Z_FlipkartNotifyMe.model.Product;
import com.vip.Z_FlipkartNotifyMe.model.SubscribersEntity;
import com.vip.Z_FlipkartNotifyMe.repo.ProductRepository;
import com.vip.Z_FlipkartNotifyMe.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {


    @Autowired
     private ProductRepository productRepository;

    @Autowired
     private UserRepository  userRepository;

    @PostMapping("/{productName}/notify")
    public String registerForNotification(@PathVariable String productName, @RequestBody SubscribersEntity user) {
        Product product = productRepository.findByName(productName).orElse(new Product());
        product.registerObserver(user);
        productRepository.save(product);
        return "you request is submitted successfully, we will notify you soon";
    }

    @PostMapping("/{productName}/setStockStatus")
    public void setStockStatus(@PathVariable String productName, @RequestParam boolean inStock) {
        Product product = productRepository.findByName(productName).orElse(new Product());
        List<SubscribersEntity> userEntities=userRepository.findByProductId(product.getId());

        // this is the trigger for every time when the stock is filled with the related item
        product.setInStock(inStock, userEntities);

        productRepository.save(product);
    }
}
