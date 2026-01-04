package factory.spot;

import utils.ParkingSpot;
import utils.Vehicle;
import utils.VehicleType;

public class BikeParkingSpot extends ParkingSpot {

    public BikeParkingSpot(int spotNumber, VehicleType vehicleType) {
        super(spotNumber, vehicleType);
    }

    @Override
    public boolean canParkVehicle(Vehicle vehicle) {
        return "bike".equalsIgnoreCase(vehicle.getVehicleType());
    }
}
