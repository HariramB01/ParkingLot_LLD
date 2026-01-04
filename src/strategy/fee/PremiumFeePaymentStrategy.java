package strategy.fee;

import strategy.ParkingFeeStrategy;
import utils.VehicleType;

public class PremiumFeePaymentStrategy implements ParkingFeeStrategy {
    @Override
    public double calculateFee(VehicleType vehicleType, int totalHours) {

        int days = totalHours / 24;
        int remainingHours = totalHours % 24;

        double hourlyRate;
        double dailyRate;

        switch (vehicleType) {
            case CAR, TRUCK:
                hourlyRate = 25.0;
                dailyRate = hourlyRate * 24;
                break;

            case BIKE:
                hourlyRate = 28.0;
                dailyRate = hourlyRate * 24;
                break;

            case VAN:
                hourlyRate = 22.0;
                dailyRate = hourlyRate * 24;
                break;

            default:
                hourlyRate = 20.0;
                dailyRate = hourlyRate * 24;
        }
        return (days * dailyRate) + (remainingHours * hourlyRate);
    }
}
