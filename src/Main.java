import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ParkingLotApplication app = ParkingLotApplication.getInstance();
        app.createParkingLot();

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== Parking Lot Menu =====");
            System.out.println("1. Show available parking spots");
            System.out.println("2. Park vehicle");
            System.out.println("3. Vacate vehicle");
            System.out.println("4. Exit");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    app.showAvailability();
                    break;
                case 2:
                    app.parkVehicle(sc);
                    break;
                case 3:
                    System.out.println("Enter ticket number:");
                    String ticketNumber = sc.next();
                    System.out.println(app.vacateVehicle(ticketNumber));
                    break;
                case 4:
                    System.out.println("Thank you! Exiting...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}