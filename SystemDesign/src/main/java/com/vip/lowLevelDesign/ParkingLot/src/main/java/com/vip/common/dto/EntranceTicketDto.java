package com.vip.common.dto;

import com.vip.common.enums.VehicleType;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class EntranceTicketDto {

    private Long parkingTicketId;
    private String vehicleNumber;
    private LocalDateTime entryTime;
    private Long parkingSpaceId;
    private String vehicleType;
}
