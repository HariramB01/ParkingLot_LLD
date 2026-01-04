package factory.spot;

import utils.ParkingSpot;
import utils.Vehicle;
import utils.VehicleType;

public class CarParkingSpot extends ParkingSpot {

    public CarParkingSpot(int spotNumber) {
        super(spotNumber, VehicleType.CAR);
    }

    @Override
    public boolean canParkVehicle(Vehicle vehicle) {
        return "car".equalsIgnoreCase(vehicle.getVehicleType().getVehicleType());
    }
}
