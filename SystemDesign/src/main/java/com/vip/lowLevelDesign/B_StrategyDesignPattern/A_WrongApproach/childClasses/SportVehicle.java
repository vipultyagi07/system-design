package com.vip.lowLevelDesign.B_StrategyDesignPattern.A_WrongApproach.childClasses;

import com.vip.lowLevelDesign.B_StrategyDesignPattern.A_WrongApproach.Vehicle;

public class SportVehicle extends Vehicle {

    @Override
    public void drive(){
        System.out.println("Vehicle is in special drive mode");
    }

}
