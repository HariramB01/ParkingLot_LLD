package utils;

import java.time.LocalDateTime;
import java.util.UUID;

public class Ticket {

    private final String ticketNumber;
    private final Vehicle vehicle;
    private final ParkingSpot parkingSpot;
    private final LocalDateTime entryTime;
    private final double amount;

    public Ticket(Vehicle vehicle, ParkingSpot parkingSpot, double amount) {
        this.ticketNumber = UUID.randomUUID().toString();
        this.vehicle = vehicle;
        this.parkingSpot = parkingSpot;
        this.amount = amount;
        this.entryTime = LocalDateTime.now();
    }

    public String getTicketNumber() {
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
