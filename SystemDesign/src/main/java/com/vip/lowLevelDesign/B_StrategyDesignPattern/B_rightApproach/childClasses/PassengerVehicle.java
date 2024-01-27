package com.vip.lowLevelDesign.B_StrategyDesignPattern.B_rightApproach.childClasses;

import com.vip.lowLevelDesign.B_StrategyDesignPattern.B_rightApproach.Vehicle;
import com.vip.lowLevelDesign.B_StrategyDesignPattern.B_rightApproach.childClasses.driveStrategy.impl.NormalDrive;

public class PassengerVehicle extends Vehicle {

    public PassengerVehicle() {

    super(new NormalDrive());
    }



}
