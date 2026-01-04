package factory.spot;

import utils.ParkingSpot;
import utils.Vehicle;
import utils.VehicleType;

public class TruckParkingSpot extends ParkingSpot {

    public TruckParkingSpot(int spotNumber) {
        super(spotNumber, VehicleType.TRUCK);
    }

    @Override
    public boolean canParkVehicle(Vehicle vehicle) {
        return "truck".equalsIgnoreCase(vehicle.getVehicleType().getVehicleType());
    }
}
