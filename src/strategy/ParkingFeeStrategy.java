package strategy;

import utils.VehicleType;

public interface ParkingFeeStrategy {
    double calculateFee(VehicleType vehicleType, int totalHours);
}
