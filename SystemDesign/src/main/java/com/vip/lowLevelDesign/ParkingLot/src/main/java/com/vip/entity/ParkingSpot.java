package com.vip.entity;
import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;

@Entity
@Data
public class ParkingSpot {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private boolean isEmpty;
    private String type; // "2wheeler" or "4wheeler"
    private BigDecimal price;

    @OneToOne(mappedBy = "parkingSpot")
    private Vehicle vehicle;

    // getters and setters
}
