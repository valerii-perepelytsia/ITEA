public abstract class Car {
    private String model;
    private double power;
    private int speed;
    private double price;
    private final int yearOfManufacture = 1967;

    public Car(String model, double power, int speed, double price) {
        this.model = model;
        if (power < 0.0) {
            this.power = 0.0;
        } else if (power > 200.0) {
            this.power = 200.0;
        } else {
            this.power = power;
        }
        if (speed < 0) {
            this.speed = 0;
        } else if (speed > 320) {
            this.speed = 320;
        } else {
            this.speed = speed;
        }
        if (price < 0.0) {
            this.price = 0.0;
        } else if (price > 50000.0) {
            this.price = 50000.0;
        } else {
            this.price = price;
        }
    }

    public String getModel() {
        return model;
    }

    public double getPower() {
        return power;
    }

    public int getSpeed() {
        return speed;
    }

    public double getPrice() {
        return price;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }
}