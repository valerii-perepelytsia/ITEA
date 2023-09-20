public class Car {
    private int year;
    private double speed;
    private int weight;
    private String color;

    public Car() {
        this.year = 0;
        this.speed = 0.0;
        this.weight = 0;
        this.color = "Невідомий";
    }

    public Car(int year) {
        this();
        this.year = year;
    }

    public Car(int year, double speed) {
        this(year);
        this.speed = speed;
    }

    public Car(int year, double speed, int weight) {
        this(year, speed);
        this.weight = weight;
    }

    public Car(int year, double speed, int weight, String color) {
        this(year, speed, weight);
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public double getSpeed() {
        return speed;
    }

    public int getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }
}
