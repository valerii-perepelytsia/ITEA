public class Ship extends Vehicle {
    private int passengerCount;
    private String homePort;

    public Ship(double price, int speed, int year, int passengerCount, String homePort) {
        super(price, speed, year);
        this.passengerCount = passengerCount;
        this.homePort = homePort;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Кількість пасажирів: " + passengerCount);
        System.out.println("Порт приписки: " + homePort);
    }
}
