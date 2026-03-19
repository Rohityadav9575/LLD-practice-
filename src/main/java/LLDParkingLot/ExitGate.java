package LLDParkingLot;

public class ExitGate {
    Ticket ticket;

    public Long calculatePrice(){
        ParkingSlot parkingSlot=ticket.parkingSlot;
        long currTime=System.currentTimeMillis();
        long hours=((currTime- ticket.startTime)/(60000*60));
        long price= parkingSlot.price*hours;
        return price;
    }
}
