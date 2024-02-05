package com.vip.exception;

public class ErrorCode {
    // Common error codes
    public static final String INTERNAL_SERVER_ERROR = "INTERNAL_SERVER_ERROR";
    public static final String BAD_REQUEST = "BAD_REQUEST";
    public static final String NOT_FOUND = "NOT_FOUND";

    // Custom error codes specific to your application
    public static final String PARKING_NOT_AVAILABLE = "PARKING_NOT_AVAILABLE";
    public static final String INVALID_VEHICLE_TYPE = "INVALID_VEHICLE_TYPE";
    public static final String VEHICLE_ALREADY_PARKED ="VEHICLE_ALREADY_PARKED";
    public static final String VEHICLE_ALREADY_LEFT_THE_PARKING_LOT ="VEHICLE_ALREADY_LEFT_THE_PARKING_LOT";
    // Add more error codes as needed for your specific use cases
}
