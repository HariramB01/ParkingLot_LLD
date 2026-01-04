package helper;

import utils.ParkingSpot;
import utils.SpotStatus;
import utils.Vehicle;

public class ParkingSpotManager {

    public boolean parkVehicle(ParkingSpot spot, Vehicle vehicle) {

        if (spot.getSpotStatus() != SpotStatus.AVAILABLE) {
            return false;
        }

        if (!spot.canParkVehicle(vehicle)) {
            System.out.println("Vehicle cannot be parked at this spot");
            return false;
        }

        spot.setVehicle(vehicle);
        spot.setSpotStatus(SpotStatus.OCCUPIED);

        System.out.println("Vehicle parked successfully at spot: " + spot.getSpotNumber());
        return true;
    }

    public boolean vacateSpot(ParkingSpot spot) {

        if (spot.getSpotStatus() != SpotStatus.OCCUPIED) {
            System.out.println("Spot already available");
            return false;
        }

        spot.setVehicle(null);
        spot.setSpotStatus(SpotStatus.AVAILABLE);

        System.out.println("Vacated spot: " + spot.getSpotNumber());
        return true;
    }
}
