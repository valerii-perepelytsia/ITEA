public class Car {
    private int year;
    private String color;

    public Car() {
        this.year = 0;
        this.color = "Невідомий";
    }

    public Car(int year) {
        this.year = year;
        this.color = "Невідомий";
    }

    public Car(int year, String color) {
        this.year = year;
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }
}