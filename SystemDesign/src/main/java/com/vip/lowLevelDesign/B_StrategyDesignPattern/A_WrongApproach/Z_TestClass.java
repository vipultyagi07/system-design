package com.vip.lowLevelDesign.B_StrategyDesignPattern.A_WrongApproach;

import com.vip.lowLevelDesign.B_StrategyDesignPattern.A_WrongApproach.childClasses.OffRoadVehicle;
import com.vip.lowLevelDesign.B_StrategyDesignPattern.A_WrongApproach.childClasses.PassengerVehicle;
import com.vip.lowLevelDesign.B_StrategyDesignPattern.A_WrongApproach.childClasses.SportVehicle;

public class Z_TestClass {

    public static void main(String[] args) {

        Vehicle passengerVehicle= new PassengerVehicle();
        passengerVehicle.drive();

        Vehicle offRoadVehicle= new OffRoadVehicle();
        offRoadVehicle.drive();

        Vehicle sportVehicle= new SportVehicle();
        sportVehicle.drive();



    }
}
