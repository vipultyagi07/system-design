package com.vip.exception;

public class ParkingLotException extends RuntimeException {
    private final String errorCode;

    public ParkingLotException(String message, String errorCode) {
        super(message);
        this.errorCode = errorCode;
    }

    public String getErrorCode() {
        return errorCode;
    }
}