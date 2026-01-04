package helper;

import strategy.payment.CreditCardPaymentStrategy;
import utils.*;

public class ParkingLotManager {

    private final ParkingSpotManager spotManager = new ParkingSpotManager();

    public ParkingSpot findAvailableSpot(ParkingLot lot, Vehicle vehicle) {
        for (ParkingFloor floor : lot.getFloors()) {
            ParkingSpot spot = floor.findParkingSpot(vehicle.getVehicleType());
            if (spot != null) {
                return spot;
            }
        }
        return null;
    }

    public Ticket parkVehicle(ParkingLot lot, Vehicle vehicle, int totalHours) {

        ParkingSpot spot = findAvailableSpot(lot, vehicle);

        if (spot == null) {
            System.out.println("No parking spots available for " + vehicle.getVehicleType());
            return null;
        }

        boolean parked = spotManager.parkVehicle(spot, vehicle);
        if (!parked) {
            return null;
        }
        double amount = vehicle.calculateFee(totalHours);

        boolean paymentStatus = new Payment(amount, new CreditCardPaymentStrategy()).processPayment(amount);
        Ticket ticket = new Ticket(vehicle, spot, amount, paymentStatus);
        System.out.println("Ticket generated: " + ticket.getTicketNumber());
        return ticket;
    }

    public String vacateSpot(Ticket ticket) {

        ParkingSpot parkingSpot = ticket.getParkingSpot();
        if (parkingSpot != null) {
            return spotManager.vacateSpot(parkingSpot) ? "vacated successfully" : "Spot already available";
        }
        return "Invalid spot / vehicle mismatch";
    }
}
