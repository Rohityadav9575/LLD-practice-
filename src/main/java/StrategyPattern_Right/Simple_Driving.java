package StrategyPattern_Right;

public class Simple_Driving implements Drive_Strategy{
    @Override
    public void drive() {
        System.out.println("simple or normal driving");
    }
}
