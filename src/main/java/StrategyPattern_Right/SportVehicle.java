package StrategyPattern_Right;

public class SportVehicle extends Vehicle{
   // passing the drive strategy obj what type we need to vehicle
    public SportVehicle() {
        super(new Special_Driving());

    }
}
