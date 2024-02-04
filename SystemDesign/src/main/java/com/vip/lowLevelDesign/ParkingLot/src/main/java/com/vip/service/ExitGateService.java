package com.vip.service;

import com.vip.common.dto.ExitTicketDto;
import com.vip.entity.ParkingTicket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Objects;

@Service
public class ExitGateService {


    @Autowired
    private  ParkingTicketService parkingTicketService;

    public ExitTicketDto generatePayment(String vehicleNumber) {

        ParkingTicket parkingTicket=parkingTicketService.findParkingTicketOfVehicle(vehicleNumber);
        if(Objects.isNull(parkingTicket)){
            return null;
        }

        LocalDateTime entryTime = parkingTicket.getEntryTime();
        LocalDateTime exitTime = parkingTicket.getExitTime();
        Duration duration = Duration.between(entryTime, exitTime);
        long totalTime = duration.toHours();


        Long price = parkingTicket.getParkingSpot().getPrice().longValue();

        ExitTicketDto exitTicketDto = getExitTicketDto(parkingTicket, entryTime, exitTime, totalTime, price);


        return exitTicketDto;

    }

    private static ExitTicketDto getExitTicketDto(ParkingTicket parkingTicket, LocalDateTime entryTime, LocalDateTime exitTime, long totalTime, Long price) {
        ExitTicketDto exitTicketDto= new ExitTicketDto();
        exitTicketDto.setRate(price +"/hour");
        exitTicketDto.setDuration(totalTime);
        exitTicketDto.setEntryTime(entryTime);
        exitTicketDto.setVehicleNumber(parkingTicket.getVehicle().getVehicleNo());
        exitTicketDto.setExitTime(exitTime);
        exitTicketDto.setAmountToBePaid(price * totalTime);
        return exitTicketDto;
    }
}
