package factory.spot;

import utils.ParkingSpot;
import utils.Vehicle;
import utils.VehicleType;

public class VanParkingSpot extends ParkingSpot {

    public VanParkingSpot(int spotNumber, VehicleType vehicleType) {
        super(spotNumber, vehicleType);
    }

    @Override
    public boolean canParkVehicle(Vehicle vehicle) {
        return "van".equalsIgnoreCase(vehicle.getVehicleType());
    }
}
