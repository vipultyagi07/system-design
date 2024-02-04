package com.vip.controller;

import com.vip.common.dto.EntranceTicketDto;
import com.vip.entity.ParkingTicket;
import com.vip.entity.Vehicle;
import com.vip.service.EntranceGateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

@RestController
@RequestMapping("/api/entrance")
public class EntranceController {

    @Autowired
    private EntranceGateService entranceGateService;


    @PostMapping("/generate/ticket")
    public ResponseEntity<Object> generateParkingTicket(@RequestBody Vehicle vehicle){
        EntranceTicketDto entranceTicketDto = entranceGateService.generateParkingTicket(vehicle);


        return Objects.isNull(entranceTicketDto)?new ResponseEntity<>(HttpStatus.NOT_FOUND):new ResponseEntity<>(entranceTicketDto,HttpStatus.ACCEPTED);
    }

}
