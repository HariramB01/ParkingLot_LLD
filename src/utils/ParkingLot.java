package utils;

import java.util.List;

public class ParkingLot {
    private String parkingLotName;
    private List<ParkingFloor> floors;

    public ParkingLot(String parkingLotName, List<ParkingFloor> floors) {
        this.parkingLotName = parkingLotName;
        this.floors = floors;
    }

    public ParkingSpot findAvailableSpot(String vehicleType) {
        for (ParkingFloor floor : floors) {
            ParkingSpot parkingSpot = floor.findParkingSpot(vehicleType);
            if (parkingSpot != null) {
                return parkingSpot; // Found an available spot for the vehicle type
            }
        }
        return null; // No available spot found for the given vehicle type
    }

    public ParkingSpot parkVehicle(Vehicle vehicle) {
        ParkingSpot parkingSpot = findAvailableSpot(vehicle.getVehicleType());
        if (parkingSpot != null) {
            if (parkingSpot.parkVehicle(vehicle)) {
                System.out.println("vehicle successfully parked in the spot" + parkingSpot.getSpotNumber());
                return parkingSpot;
            }
        }
        System.out.println("no parking spots available for " + vehicle.getVehicleType() + "!");
        return null;
    }

    public boolean vacateSpot(int spotNumber, Vehicle vehicle) {
        ParkingSpot parkingSpot = findParkingSpotBySpotNumberAndVehicleType(spotNumber, vehicle);
        if (parkingSpot != null) {
            if (parkingSpot.vacateSpot()) {
                System.out.println("vacated the spot: " + parkingSpot.getSpotNumber());
                return true;
            }
        }
        System.out.println("Invalid spot number/ spot is already vacant/ vehicle doesn't match with the spot");
        return false;
    }

    private ParkingSpot findParkingSpotBySpotNumberAndVehicleType(int spotNumber, Vehicle vehicle) {
        for (ParkingFloor floor : floors) {
            ParkingSpot parkingSpot = floor.findParkingSpotBySpotNumberAndVehicleType(spotNumber, vehicle);
            if (parkingSpot != null) {
                return parkingSpot;  // Found an available spot for the vehicle type
            }
        }
        return null; // No available spot found for the given vehicle type
    }

}
