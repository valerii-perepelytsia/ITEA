class Car {
    private String model;
    private double power;
    private int speed;
    private double price;
    private int yearOfManufacture;

    public Car(String model, double power, int speed, double price, int yearOfManufacture) {
        this.model = model;
        this.power = Math.min(Math.max(power, 0.0), 200.0);
        this.speed = Math.min(Math.max(speed, 0), 320);
        this.price = Math.min(Math.max(price, 0.0), 50000.0);
        this.yearOfManufacture = yearOfManufacture;
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