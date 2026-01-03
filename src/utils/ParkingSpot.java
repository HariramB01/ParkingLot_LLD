package utils;

public abstract class ParkingSpot {
    private int spotNumber;
    private SpotStatus spotStatus;
    private Vehicle vehicle;
    private VehicleType vehicleType;

    public ParkingSpot(int spotNumber, VehicleType vehicleType) {
        this.spotNumber = spotNumber;
        this.spotStatus = SpotStatus.AVAILABLE;
        this.vehicleType = vehicleType;
    }

    public abstract boolean canParkVehicle(Vehicle vehicle);


}
