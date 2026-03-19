package LLDParkingLot;

public class TwoWheelerParkingSlot extends ParkingSlot{

    public TwoWheelerParkingSlot(Vehicle vehicle, int price, boolean isSlotFree) {
        super(vehicle, price, isSlotFree);
    }

    @Override
    public int getPrice() {
        return 10;
    }

    @Override
    public void setPrice(int price) {
        super.setPrice(price);
    }
}
