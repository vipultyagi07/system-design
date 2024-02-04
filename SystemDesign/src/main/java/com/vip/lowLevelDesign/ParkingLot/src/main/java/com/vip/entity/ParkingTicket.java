package com.vip.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
public class ParkingTicket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDateTime entryTime;
    private LocalDateTime exitTime;

    /**
     * This means that multiple tickets can be linked to the same vehicle.
     */
    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "vehicle_id") // This is the foreign key column in the Ticket table
    private Vehicle vehicle;

    /**
     * multiple parking tickets are associated with a single parking spot.
     */
    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "parking_spot_id") // specify the foreign key column
    private ParkingSpot parkingSpot;

    // getters and setters
}
