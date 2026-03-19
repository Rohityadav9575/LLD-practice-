package LLDParkingLot;

public class Ticket {
    long startTime;
    Vehicle vehicle;
    ParkingSlot parkingSlot;

    public Ticket(Vehicle vehicle, ParkingSlot parkingSlot) {
        this.startTime = System.currentTimeMillis();
        this.vehicle = vehicle;
        this.parkingSlot = parkingSlot;
    }



}
