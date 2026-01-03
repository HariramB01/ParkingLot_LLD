package utils;

public enum VehicleType {
    CAR("car"),
    BIKE("bike"),
    TRUCK("truck"),
    VAN("van");
    private final String vehicleType;

    VehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getVehicleType() {
        return vehicleType;
    }

}
