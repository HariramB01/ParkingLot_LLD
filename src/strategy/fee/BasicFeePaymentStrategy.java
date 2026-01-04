package strategy.fee;

import strategy.ParkingFeeStrategy;
import utils.VehicleType;

public class BasicFeePaymentStrategy implements ParkingFeeStrategy {
    @Override
    public double calculateFee(VehicleType vehicleType, int totalHours) {

        int days = totalHours / 24;
        int remainingHours = totalHours % 24;

        double hourlyRate;
        double dailyRate;

        switch (vehicleType) {
            case CAR, TRUCK:
                hourlyRate = 15.0;
                dailyRate = hourlyRate * 24;
                break;

            case BIKE:
                hourlyRate = 8.0;
                dailyRate = hourlyRate * 24;
                break;

            case VAN:
                hourlyRate = 12.0;
                dailyRate = hourlyRate * 24;
                break;

            default:
                hourlyRate = 20.0;
                dailyRate = hourlyRate * 24;
        }
        return (days * dailyRate) + (remainingHours * hourlyRate);
    }
}
