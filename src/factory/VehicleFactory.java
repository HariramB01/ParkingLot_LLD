package factory;

import factory.vehicle.*;
import strategy.ParkingFeeStrategy;
import utils.Vehicle;
import utils.VehicleType;

public class VehicleFactory {

    public static Vehicle createVehicle(
            String licensePlate,
            VehicleType vehicleType,
            String ownerName,
            ParkingFeeStrategy feeStrategy
    ) {

        switch (vehicleType) {

            case BIKE:
                return new Bike(licensePlate, vehicleType, ownerName, feeStrategy);

            case CAR:
                return new Car(licensePlate, vehicleType, ownerName, feeStrategy);

            case TRUCK:
                return new Truck(licensePlate, vehicleType, ownerName, feeStrategy);

            case VAN:
                return new Van(licensePlate, vehicleType, ownerName, feeStrategy);

            default:
                throw new IllegalArgumentException("Unsupported vehicle type: " + vehicleType);
        }
    }
}
