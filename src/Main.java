import helper.ParkingLotManager;

public class Main {
    public static void main(String[] args) {
        ParkingLotApplication parkingLotApplication = ParkingLotApplication.getInstance();
        System.out.println("Welcome to parking lot!!!");
        parkingLotApplication.createParkingLot();
    }
}