package StrategyPattern_Right;

public class PassengerVechical extends Vehicle{
    public PassengerVechical() {
        super(new Simple_Driving());
    }
}
