package LLDParkingLot;


public class ParkingSlot {
    Vehicle vehicle;
    int price;
    boolean isSlotFree;

    public ParkingSlot(Vehicle vehicle, int price, boolean isSlotFree) {
        this.vehicle = vehicle;
        this.price = price;
        this.isSlotFree = true;
    }


    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isSlotFree() {
        return isSlotFree;
    }

    public void setSlotFree(boolean slotFree) {
        isSlotFree = slotFree;
    }

    public void parkVehicle(){
        if(isSlotFree){
            isSlotFree=false;
        }
    }


}
