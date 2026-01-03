package factory.vehicle;

import strategy.ParkingFeeStrategy;
import utils.Vehicle;
import utils.VehicleType;

public class Van extends Vehicle {
    public Van(String licensePlate, VehicleType vehicleType, String vehicleOwnerName, ParkingFeeStrategy parkingFeeStrategy) {
        super(licensePlate, vehicleType, vehicleOwnerName, parkingFeeStrategy);
    }
}
