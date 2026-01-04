package utils;

import java.util.ArrayList;
import java.util.List;

public class ParkingFloor {

    private final int floorNumber;
    private final List<ParkingSpot> parkingSpots = new ArrayList<>();

    public ParkingFloor(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    public void addParkingSpot(ParkingSpot spot) {
        parkingSpots.add(spot);
    }

    public ParkingSpot findParkingSpot(VehicleType vehicleType) {
        for (ParkingSpot spot : parkingSpots) {
            if (spot.getSpotStatus() == SpotStatus.AVAILABLE &&
                    spot.getVehicleType().equals(vehicleType.getVehicleType())) {
                return spot;
            }
        }
        return null;
    }

    public void displayAvailableSpots() {
        System.out.print("Floor " + floorNumber + " -> ");
        for (ParkingSpot spot : parkingSpots) {
            if (spot.getSpotStatus() == SpotStatus.AVAILABLE) {
                System.out.print(
                        "[" + spot.getSpotNumber() + "-" + spot.getVehicleType() + "] "
                );
            }
        }
        System.out.println();
    }

    public int getFloorNumber() {
        return floorNumber;
    }
}
