package com.vip.controller;

import com.vip.common.dto.ExitTicketDto;
import com.vip.entity.ParkingTicket;
import com.vip.entity.Vehicle;
import com.vip.exception.ParkingLotException;
import com.vip.service.EntranceGateService;
import com.vip.service.ExitGateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Objects;

@RestController
@RequestMapping("/api/exit")
public class ExitController {

    @Autowired
    private ExitGateService exitGateService;

    @PostMapping("/payment")
    public ResponseEntity<Object> generatePayment(@RequestParam String vehicleNumber ){

            ExitTicketDto exitTicketDto = exitGateService.generatePayment(vehicleNumber);
            return Objects.isNull(exitTicketDto) ? new ResponseEntity<>(HttpStatus.NOT_FOUND) : new ResponseEntity<>(exitTicketDto, HttpStatus.OK);

    }

}