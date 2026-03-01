package StrategyPattern.Wrong;

public class OffRaodDriving extends Vehicle{
    @Override
    public void drive() {
        System.out.println("Special driving");
    }

    // so here the code of child for drive can we similar or duplicate so we need the
    // strategy pattern to remove that duplicate code
}
