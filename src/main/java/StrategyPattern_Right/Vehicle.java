package StrategyPattern_Right;

public class Vehicle {
    Drive_Strategy drivingObject;

    //this is constructor injection
    public Vehicle(Drive_Strategy drivingObj) {
        this.drivingObject = drivingObj;
    }

    public void drive(){
        drivingObject.drive();
    }
}
