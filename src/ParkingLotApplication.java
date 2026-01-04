import helper.ParkingLotManager;
import utils.ParkingLot;
import utils.Ticket;
import utils.Vehicle;

import java.util.List;
import java.util.Map;

public class ParkingLotApplication {
    private static volatile ParkingLotApplication parkingLotApplicationInstance;
    private List<ParkingLot> parkingLots;
    private ParkingLotManager parkingLotManager;
    private Map<String, Ticket> tickets;

    private ParkingLotApplication() {
    }

    public static ParkingLotApplication getInstance() {
        if (parkingLotApplicationInstance == null) {
            synchronized (ParkingLotApplication.class) {
                if (parkingLotApplicationInstance == null) {
                    parkingLotApplicationInstance = new ParkingLotApplication();
                }
            }
        }
        return parkingLotApplicationInstance;
    }

    public void createParkingLot() {
        System.out.print("");
    }

    public Ticket parkVehicle(ParkingLot parkingLot, Vehicle vehicle, int totalHours){
        return parkingLotManager.parkVehicle(parkingLot, vehicle, totalHours);
    }

    public String vacateVehicle(String ticketNumber){
        Ticket ticket = tickets.get(ticketNumber);
        if(ticket==null) return "Enter a valid ticketNumber";
        return parkingLotManager.vacateSpot(ticket);
    }

}
