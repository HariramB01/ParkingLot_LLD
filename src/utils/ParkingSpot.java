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

    public SpotStatus isOccupied() {
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

    public boolean parkVehicle(Vehicle vehicle) {
        if (!spotStatus.getSpotStatus().equalsIgnoreCase("available")) {
            return false;
        } else {
            if (!canParkVehicle(vehicle)) {
                System.out.println("Vehicle cannot be parked at this spot");
                return false;
            }
            this.spotStatus = SpotStatus.OCCUPIED;
            this.vehicle = vehicle;
            System.out.println("Vehicle parked successfully at spot: " + spotNumber);
            return true;
        }
    }

    public boolean vacateSpot() {
        if (isOccupied().equals("occupied")) {
            System.out.println("Vehicle parked successfully at spot: " + spotNumber);
            this.vehicle = null;
            this.spotStatus = SpotStatus.AVAILABLE;
            return true;
        }
        System.out.println("Vehicle cannot be parked at this spot");
        return false;
    }
}
