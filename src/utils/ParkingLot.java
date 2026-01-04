package utils;

import java.util.List;

public class ParkingLot {
    private String parkingLotName;
    private List<ParkingFloor> floors;

    public ParkingLot(String parkingLotName, List<ParkingFloor> floors) {
        this.parkingLotName = parkingLotName;
        this.floors = floors;
    }

    public String getParkingLotName() {
        return parkingLotName;
    }

    public List<ParkingFloor> getFloors() {
        return floors;
    }

}
