package strategy.fee;

import strategy.ParkingFeeStrategy;
import utils.DurationType;
import utils.VehicleType;

public class PremiumFeePaymentStrategy implements ParkingFeeStrategy {
    @Override
    public double calculateFee(VehicleType vehicleType, int duration, DurationType durationType) {
        return 0;
    }
}
