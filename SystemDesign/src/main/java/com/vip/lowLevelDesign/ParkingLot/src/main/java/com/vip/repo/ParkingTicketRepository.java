package com.vip.repo;

import com.vip.entity.ParkingTicket;
import com.vip.entity.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.Optional;

@Repository
public interface ParkingTicketRepository extends JpaRepository<ParkingTicket,Long> {
    ParkingTicket findByVehicleAndExitTimeNull(Vehicle vehicle);


}
