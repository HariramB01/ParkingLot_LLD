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

    public SpotStatus getSpotStatus() {
        return spotStatus;
    }

    public String getVehicleType() {
        return vehicleType.getVehicleType();
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public int getSpotNumber() {
        return spotNumber;
    }

    public void setSpotNumber(int spotNumber) {
        this.spotNumber = spotNumber;
    }

    public void setSpotStatus(SpotStatus spotStatus) {
        this.spotStatus = spotStatus;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }
}
