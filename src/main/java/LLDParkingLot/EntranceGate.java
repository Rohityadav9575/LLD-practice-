package LLDParkingLot;

public class EntranceGate {
    Vehicle vehicle;
    ParkingSlotManager parkingSlotManager;

    public EntranceGate(Vehicle vehicle, ParkingSlotManager parkingSlotManager) {
        this.vehicle = vehicle;
        this.parkingSlotManager = parkingSlotManager;
    }

    public ParkingSlot findSlot(){
        return parkingSlotManager.findParkingSlot();
    }
    public Ticket generateTicket(){
        return new Ticket(vehicle,findSlot());
    }
}
