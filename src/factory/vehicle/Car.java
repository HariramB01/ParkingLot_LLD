package factory.vehicle;

import strategy.ParkingFeeStrategy;
import utils.Vehicle;
import utils.VehicleType;

public class Car extends Vehicle {
    public Car(String licensePlate, VehicleType vehicleType, String vehicleOwnerName, ParkingFeeStrategy parkingFeeStrategy) {
        super(licensePlate, vehicleType, vehicleOwnerName, parkingFeeStrategy);
    }
}
