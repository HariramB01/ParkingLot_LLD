import helper.ParkingLotManager;

public class Main {
    public static void main(String[] args) {
        ParkingLotManager parkingLotManager = ParkingLotManager.getInstance();
        System.out.println("Welcome to parking lot!!!");
        parkingLotManager.createParkingLot();
    }
}