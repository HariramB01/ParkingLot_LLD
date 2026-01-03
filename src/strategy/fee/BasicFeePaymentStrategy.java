package strategy.fee;

import strategy.ParkingFeeStrategy;
import utils.DurationType;
import utils.VehicleType;

public class BasicFeePaymentStrategy implements ParkingFeeStrategy {
    @Override
    public double calculateFee(VehicleType vehicleType, int duration, DurationType durationType) {
        switch (vehicleType.getVehicleType()){
            case "car":
                return 0;
        }
        return 0;
    }
}
