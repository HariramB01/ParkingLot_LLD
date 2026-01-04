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

    public String getLicensePlate() {
        return licensePlate;
    }

    public String getVehicleType() {
        return vehicleType.getVehicleType();
    }

    public String getVehicleOwnerName() {
        return vehicleOwnerName;
    }

    public ParkingFeeStrategy getParkingFeeStrategy() {
        return parkingFeeStrategy;
    }

    public double calculateFee(int duration) {
        return parkingFeeStrategy.calculateFee(this.vehicleType, duration);
    }

}
