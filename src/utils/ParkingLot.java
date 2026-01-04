package utils;

import java.util.List;

public class ParkingLot {
    private String parkingLotName;
    private List<ParkingFloor> floors;

    public ParkingLot(String parkingLotName, List<ParkingFloor> floors) {
        this.parkingLotName = parkingLotName;
        this.floors = floors;
    }

    public void addParkingFloor(ParkingFloor parkingFloor){
        floors.add(parkingFloor);
    }

    public String getParkingLotName() {
        return parkingLotName;
    }

    public void displayAvailability() {
        System.out.println("\nAvailable Parking Spots:");
        for (ParkingFloor floor : floors) {
            floor.displayAvailableSpots();
        }
    }

    public List<ParkingFloor> getFloors() {
        return floors;
    }

}
