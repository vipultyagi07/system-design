package com.vip.Z_FlipkartNotifyMe.repo;

import com.vip.Z_FlipkartNotifyMe.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findByInStock(boolean inStock);

    Optional<Product> findByName(String productName);
}
