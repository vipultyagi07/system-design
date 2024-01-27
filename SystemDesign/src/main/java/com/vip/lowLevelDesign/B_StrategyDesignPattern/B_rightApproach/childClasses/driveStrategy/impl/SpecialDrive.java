package com.vip.lowLevelDesign.B_StrategyDesignPattern.B_rightApproach.childClasses.driveStrategy.impl;

import com.vip.lowLevelDesign.B_StrategyDesignPattern.B_rightApproach.childClasses.driveStrategy.DriveStrategy;

public class SpecialDrive implements DriveStrategy {
    @Override
    public void drive() {
        System.out.println("Vehicle is in special drive mode");
    }
}
