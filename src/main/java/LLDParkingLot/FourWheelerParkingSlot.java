package LLDParkingLot;

public class FourWheelerParkingSlot extends ParkingSlot{
    public FourWheelerParkingSlot(Vehicle vehicle, int price, boolean isSlotFree) {
        super(vehicle, price, isSlotFree);
    }

    @Override
    public int getPrice() {
        return 15;
    }

    @Override
    public void setPrice(int price) {
        super.setPrice(price);
    }
}
