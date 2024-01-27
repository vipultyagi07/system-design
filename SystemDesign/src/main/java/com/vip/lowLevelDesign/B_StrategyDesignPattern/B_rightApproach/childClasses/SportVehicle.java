package com.vip.lowLevelDesign.B_StrategyDesignPattern.B_rightApproach.childClasses;

import com.vip.lowLevelDesign.B_StrategyDesignPattern.B_rightApproach.Vehicle;
import com.vip.lowLevelDesign.B_StrategyDesignPattern.B_rightApproach.childClasses.driveStrategy.impl.NormalDrive;
import com.vip.lowLevelDesign.B_StrategyDesignPattern.B_rightApproach.childClasses.driveStrategy.impl.SpecialDrive;

public class SportVehicle extends Vehicle {



    public SportVehicle() {

        super(new SpecialDrive());
    }


}
