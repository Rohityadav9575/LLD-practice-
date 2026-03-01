package StrategyPattern_Right;

public class Special_Driving implements Drive_Strategy{

    @Override
    public void drive() {
        System.out.println("Special driving");
    }
}
