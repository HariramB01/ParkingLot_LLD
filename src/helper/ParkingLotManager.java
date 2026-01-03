package helper;

import utils.ParkingLot;

import java.util.List;

public class ParkingLotManager {

    private static volatile ParkingLotManager parkingLotManagerInstance;
    private List<ParkingLot> parkingLots;

    private ParkingLotManager(){
    }

    public static ParkingLotManager getInstance(){
        if(parkingLotManagerInstance==null){
            synchronized (ParkingLotManager.class){
                if(parkingLotManagerInstance==null){
                    parkingLotManagerInstance = new ParkingLotManager();
                }
            }
        }
        return parkingLotManagerInstance;
    }

    public void createParkingLot() {
        System.out.print("");
    }
}
