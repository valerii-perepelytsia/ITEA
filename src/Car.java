public class Car extends Vehicle {
    private int passengerCount;

    public Car(double price, int speed, int year, int passengerCount) {
        super(price, speed, year);
        this.passengerCount = passengerCount;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Кількість пасажирів: " + passengerCount);
    }
}
