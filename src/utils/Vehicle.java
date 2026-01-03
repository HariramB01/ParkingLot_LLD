package utils;

import strategy.ParkingFeeStrategy;

public abstract class Vehicle {

    private final String licensePlate;
    private final VehicleType vehicleType;
    private final String vehicleOwnerName;
    private final ParkingFeeStrategy parkingFeeStrategy;


    public Vehicle(String licensePlate, VehicleType vehicleType, String vehicleOwnerName, ParkingFeeStrategy parkingFeeStrategy) {
        this.licensePlate = licensePlate;
        this.vehicleType = vehicleType;
        this.vehicleOwnerName = vehicleOwnerName;
        this.parkingFeeStrategy = parkingFeeStrategy;
    }


}
