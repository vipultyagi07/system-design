package com.vip.exception;

import com.vip.common.errorResponse.ErrorClass;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<ErrorClass> handleRuntimeException(RuntimeException ex) {
        if (ex instanceof ParkingLotException) {
            // Handle ParkingLotException
            ParkingLotException ple = (ParkingLotException) ex;
            log.error("Parking Lot Exception: " + ple.getErrorCode() + " - " + ple.getMessage(), ple);
            ErrorClass errorClass = new ErrorClass(ple.getErrorCode(), ple.getMessage());
            return new ResponseEntity<>(errorClass, HttpStatus.BAD_REQUEST);
        } else {
            // Handle other RuntimeExceptions
            log.error("Unexpected runtime exception: " + ex.getMessage(), ex);
            ErrorClass errorClass = new ErrorClass(ErrorCode.INTERNAL_SERVER_ERROR, ex.getMessage());
            return new ResponseEntity<>(errorClass, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @ExceptionHandler(ParkingLotException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ResponseEntity<ErrorClass> handleParkingLotException(ParkingLotException ex) {
        // Handle ParkingLotException
        log.error("Parking Lot Exception: " + ex.getErrorCode() + " - " + ex.getMessage(), ex);
        ErrorClass errorClass = new ErrorClass(ex.getErrorCode(), ex.getMessage());
        return new ResponseEntity<>(errorClass, HttpStatus.BAD_REQUEST);
    }
}
