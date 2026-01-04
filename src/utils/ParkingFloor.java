package utils;

import java.util.List;

public class ParkingFloor {
    private int id;
    private List<ParkingSpot> parkingSpots;

    public ParkingSpot findParkingSpot(String vehicleType) {
        for (ParkingSpot spot : parkingSpots) {
            if (spot.getSpotStatus().equals(SpotStatus.AVAILABLE) && spot.getVehicleType().equals(vehicleType)) {
                return spot;
            }
        }
        return null;
    }

    public ParkingSpot findParkingSpotBySpotNumberAndVehicleType(int spotNumber, Vehicle vehicle) {
        for (ParkingSpot spot : parkingSpots) {
            if (spot.getSpotStatus().equals(SpotStatus.OCCUPIED) && spot.getSpotNumber() == spotNumber && spot.getVehicle().equals(vehicle)) {
                return spot;
            }
        }
        return null;
    }
}
