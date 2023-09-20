public class Plane extends Vehicle {
    private double maxHeight;
    private int passengerCount;

    public Plane(double price, int speed, int year, double maxHeight, int passengerCount) {
        super(price, speed, year);
        this.maxHeight = maxHeight;
        this.passengerCount = passengerCount;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Максимальна висота: " + maxHeight + " м");
        System.out.println("Кількість пасажирів: " + passengerCount);
    }
}
