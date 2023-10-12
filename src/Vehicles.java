public enum Vehicles {
    CAR(20000, "Red"),
    MOTORCYCLE(8000, "Black"),
    TRUCK(35000, "Blue");

    private int price;
    private String color;

    Vehicles(int price, String color) {
        this.price = price;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public String toString() {
        return "Vehicle: " + name() + ", Color: " + color + ", Price: $" + price;
    }
}