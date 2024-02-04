package com.vip.service;

import com.vip.entity.ParkingTicket;
import com.vip.entity.Vehicle;
import com.vip.exception.ParkingLotException;
import com.vip.repo.ParkingTicketRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Objects;

@Service
@Slf4j
public class ParkingTicketService {
    @Autowired
    private ParkingTicketRepository parkingTicketRepository;
    @Autowired
    private VehicleService vehicleService;
    public ParkingTicket save(ParkingTicket ticket) {

        Vehicle vehicle = ticket.getVehicle();
        // Save the Vehicle if it's not already saved
        if (vehicle.getId() == null) {
            vehicleService.save(vehicle);
        }try {
            return parkingTicketRepository.save(ticket);
        }
        catch (Exception e){
            return null;
        }

    }
    public ParkingTicket findParkingTicketOfVehicle(String vehicleNumber) {
            Vehicle vehicle = vehicleService.findExistingVehicle(vehicleNumber);

            try {
                ParkingTicket updatedParkingTicket = getParkingTicketAndUpdateTheParkingLot(vehicle);
                return updatedParkingTicket;
            }catch (Exception e){
                log.error("No open ticket found for vehicle no. {}",vehicleNumber);
                return null;
            }

    }

    private ParkingTicket getParkingTicketAndUpdateTheParkingLot(Vehicle vehicle) {
        ParkingTicket existingParkingTicket = parkingTicketRepository.findByVehicleAndExitTimeNull(vehicle);

        if (Objects.isNull(existingParkingTicket)) {
            throw new ParkingLotException("No open ticket found for the vehicle", "TICKET_NOT_FOUND");
        }
        existingParkingTicket.setExitTime(LocalDateTime.now());
        existingParkingTicket.getParkingSpot().setVehicle(null);
        existingParkingTicket.getParkingSpot().setEmpty(true);
        ParkingTicket updatedParkingTicket = parkingTicketRepository.saveAndFlush(existingParkingTicket);
        return updatedParkingTicket;
    }
}
