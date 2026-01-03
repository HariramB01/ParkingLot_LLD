package strategy;

import utils.DurationType;
import utils.VehicleType;

public interface ParkingFeeStrategy {
    double calculateFee(VehicleType vehicleType, int duration, DurationType durationType);
}
