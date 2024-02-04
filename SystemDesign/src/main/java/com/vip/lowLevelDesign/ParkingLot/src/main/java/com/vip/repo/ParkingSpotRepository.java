package com.vip.repo;

import com.vip.entity.ParkingSpot;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ParkingSpotRepository extends JpaRepository<ParkingSpot,Long> {
    List<ParkingSpot> findByType(String type);

    List<ParkingSpot> findByTypeAndIsEmptyTrue(String type);
}
