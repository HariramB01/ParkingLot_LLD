package utils;

import java.time.LocalDateTime;
import java.util.UUID;

public class Ticket {

    private final UUID ticketNumber;
    private final Vehicle vehicle;
    private final ParkingSpot parkingSpot;
    private final LocalDateTime entryTime;
    private final double amount;
    private final boolean paymentStatus;

    public Ticket(Vehicle vehicle, ParkingSpot parkingSpot, double amount, boolean paymentStatus) {
        this.ticketNumber = UUID.randomUUID();
        this.vehicle = vehicle;
        this.parkingSpot = parkingSpot;
        this.amount = amount;
        this.entryTime = LocalDateTime.now();
        this.paymentStatus = paymentStatus;
    }

    public UUID getTicketNumber() {
        return ticketNumber;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public ParkingSpot getParkingSpot() {
        return parkingSpot;
    }

    public LocalDateTime getEntryTime() {
        return entryTime;
    }
}
