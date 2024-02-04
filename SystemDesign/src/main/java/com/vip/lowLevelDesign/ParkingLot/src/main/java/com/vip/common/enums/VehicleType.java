package com.vip.common.enums;

public enum VehicleType {
    TWO_WHEELER("2wheeler"),
    FOUR_WHEELER("4wheeler");

    private final String displayName;

    VehicleType(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
