public class Car implements Comparable<Car> {
    int speed;
    int price;
    String model;
    String color;

    Car(int speed, int price, String model, String color) {
        this.speed = speed;
        this.price = price;
        this.model = model;
        this.color = color;
    }

    public String toString() {
        return this.model + " " + this.color + " " + this.speed + " " + this.price;
    }

    public int compareTo(Car o) {
        int speedComparison = this.speed - o.speed;
        if (speedComparison != 0) {
            return speedComparison;
        }

        int priceComparison = this.price - o.price;
        if (priceComparison != 0) {
            return priceComparison;
        }
        return this.color.compareTo(o.color);
    }
}