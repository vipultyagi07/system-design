package com.vip.service;

import com.vip.common.dto.EntranceTicketDto;
import com.vip.entity.ParkingSpot;
import com.vip.entity.ParkingTicket;
import com.vip.entity.Vehicle;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Objects;

@Service
@Slf4j
public class EntranceGateService {
    @Autowired
    private ParkingSpotService parkingSpotService;

    @Autowired
    private ParkingTicketService parkingTicketService;

    @Autowired
    private VehicleService vehicleService;

    public EntranceTicketDto generateParkingTicket(Vehicle vehicle) {
        /**
         * Here we are finding the existing vehicle, if it is not present then we are treating
         * the parameter vehicle as current vehicle
         */
        Vehicle currentVehicle=vehicleService.findExistingVehicle(vehicle);
        /**
         *  This method searches for an empty parking spot of the given vehicle type in the repository.
         *  If an available parking space is found, it is returned; otherwise, null is returned.
         */
        ParkingSpot parkingSpot = findParkingSpot(currentVehicle);
        if (parkingSpot == null) {
            log.info("Parking lot is already full for {} type of vehicle",currentVehicle.getVehicleType().getDisplayName());
            return null;
        }

        /**
         *  This method associates the provided vehicle with the specified parking spot,
         *  generates a new parking ticket with the current entry time, and saves the ticket.
         *  The saved parking ticket is then returned.
         */
        ParkingTicket generatedTicket = saveAndGenerateTicket(currentVehicle, parkingSpot);
        if(Objects.isNull(generatedTicket)){
            log.info("Vehicle {} is already parked in the lot",vehicle.getVehicleNo());
            return null;
        }

        /**
         * Here we are updating the parkingSpot with vehicle and updating its "isEmpty" column
         */
        parkingSpotService.updateParkingSpace(parkingSpot, false);

        return getEntranceTicketDto(currentVehicle, parkingSpot, generatedTicket);
    }

    private ParkingSpot findParkingSpot(Vehicle oldVehicle) {
        ParkingSpot parkingSpot= parkingSpotService.findParkingSpace(oldVehicle.getVehicleType());
        if(Objects.isNull(parkingSpot)){
            return null;
        }
        return parkingSpot;
    }

    private ParkingTicket saveAndGenerateTicket(Vehicle oldVehicle, ParkingSpot parkingSpot) {
        parkingSpot.setVehicle(oldVehicle);
        ParkingTicket ticket = new ParkingTicket();
        ticket.setEntryTime(LocalDateTime.now());
        ticket.setParkingSpot(parkingSpot);
        ticket.setVehicle(oldVehicle);
        ParkingTicket generatedTicket = parkingTicketService.save(ticket);
        return generatedTicket;
    }

    private static EntranceTicketDto getEntranceTicketDto(Vehicle oldVehicle, ParkingSpot parkingSpot, ParkingTicket generatedTicket) {
        EntranceTicketDto entranceTicketDto= new EntranceTicketDto();
        entranceTicketDto.setParkingTicketId(generatedTicket.getId());
        entranceTicketDto.setEntryTime(generatedTicket.getEntryTime());
        entranceTicketDto.setParkingSpaceId(parkingSpot.getId());
        entranceTicketDto.setVehicleNumber(oldVehicle.getVehicleNo());
        entranceTicketDto.setVehicleType(oldVehicle.getVehicleType().getDisplayName());

        return entranceTicketDto;
    }




}
