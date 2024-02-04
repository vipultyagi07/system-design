package com.vip.entity;

import com.vip.common.enums.VehicleType;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String vehicleNo;

    @Enumerated(EnumType.STRING)
    private VehicleType vehicleType;

}
