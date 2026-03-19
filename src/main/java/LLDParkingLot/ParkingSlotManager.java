package LLDParkingLot;

import java.util.ArrayList;
import java.util.List;

public class ParkingSlotManager {
    List<ParkingSlot> parkingSlotList=new ArrayList<>();

    public void addSlot(){
        parkingSlotList.add(new ParkingSlot(new Vehicle(),10,true));
    }

    public void removeSlot(){
        if(!parkingSlotList.isEmpty()) {
            parkingSlotList.remove(0);
        }
    }

    public ParkingSlot findParkingSlot(){
        for(int i=0;i<parkingSlotList.size();i++){
            if(parkingSlotList.get(i).isSlotFree){
                // how to return empty slot
                parkingSlotList.get(i).isSlotFree=false;
                return parkingSlotList.get(i);
            }
        }
        return null ;
    }
}
