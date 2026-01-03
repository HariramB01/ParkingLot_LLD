package factory.vehicle;

import strategy.ParkingFeeStrategy;
import utils.Vehicle;
import utils.VehicleType;

public class Bike extends Vehicle {
    public Bike(String licensePlate, VehicleType vehicleType, String vehicleOwnerName, ParkingFeeStrategy parkingFeeStrategy) {
        super(licensePlate, vehicleType, vehicleOwnerName, parkingFeeStrategy);
    }
}
