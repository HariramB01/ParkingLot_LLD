    import factory.VehicleFactory;
    import factory.spot.BikeParkingSpot;
    import factory.spot.CarParkingSpot;
    import factory.spot.TruckParkingSpot;
    import factory.spot.VanParkingSpot;
    import helper.ParkingLotManager;
    import strategy.fee.PremiumFeePaymentStrategy;
    import utils.*;

    import java.util.*;

    public class ParkingLotApplication {

        private static volatile ParkingLotApplication instance;

        private final ParkingLotManager parkingLotManager = new ParkingLotManager();
        private final Map<String, Ticket> tickets = new HashMap<>();
        private ParkingLot parkingLot;

        private ParkingLotApplication() {
        }

        public static ParkingLotApplication getInstance() {
            if (instance == null) {
                synchronized (ParkingLotApplication.class) {
                    if (instance == null) {
                        instance = new ParkingLotApplication();
                    }
                }
            }
            return instance;
        }

        public void createParkingLot() {

            parkingLot = new ParkingLot("Mall Parking", new ArrayList<>());

            for (int i = 1; i <= 2; i++) {
                ParkingFloor floor = new ParkingFloor(i);

                floor.addParkingSpot(new CarParkingSpot(i * 100 + 1));
                floor.addParkingSpot(new BikeParkingSpot(i * 100 + 2));
                floor.addParkingSpot(new TruckParkingSpot(i * 100 + 3));
                floor.addParkingSpot(new VanParkingSpot(i * 100 + 4));

                parkingLot.addParkingFloor(floor);
            }

            System.out.println("Parking Lot created successfully");
        }

        public void showAvailability() {
            parkingLot.displayAvailability();
        }

        public Ticket parkVehicle(Scanner sc) {
            System.out.println("Enter vehicle type (CAR/BIKE/TRUCK/VAN): ");
            VehicleType vehicleType = VehicleType.valueOf(sc.next().toUpperCase());

            System.out.println("Enter license plate:");
            String plate = sc.next();

            System.out.println("Enter owner name:");
            String owner = sc.next();

            System.out.println("Enter parking duration (hours):");
            int hours = sc.nextInt();

            Vehicle vehicle = VehicleFactory.createVehicle(
                    plate,
                    vehicleType,
                    owner,
                    new PremiumFeePaymentStrategy()
            );
            Ticket ticket = parkingLotManager.parkVehicle(parkingLot, vehicle, hours);
            if (ticket != null) {
                System.out.println("Vehicle parked successfully!");
                System.out.println("Ticket Number: " + ticket.getTicketNumber());
                tickets.put(ticket.getTicketNumber(), ticket);
            }
            return ticket;
        }

        public String vacateVehicle(String ticketNumber) {
            Ticket ticket = tickets.remove(ticketNumber);
            if (ticket == null) return "Invalid ticket number";
            return parkingLotManager.vacateSpot(ticket);
        }
    }
