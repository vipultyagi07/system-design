package com.vip.entity;
import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Entity
@Data
public class ParkingSpot {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private boolean isEmpty;
    private String type; // "2wheeler" or "4wheeler"
    private BigDecimal price;

    @OneToOne
    @JoinColumn(name = "vehicle_id")
    private Vehicle vehicle;

    /**
     * This means that a single parking spot can be associated with multiple parking tickets.
     */
    @OneToMany(mappedBy = "parkingSpot")
    private List<ParkingTicket> parkingTickets;

    // getters and setters
}
