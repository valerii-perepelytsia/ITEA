public enum Vehicles {
    CAR(20000),
    MOTORCYCLE(8000),
    TRUCK(40000);

    private int price;
    private String color;

    Vehicles(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return this.name() + " [Color: " + color + ", Price: " + price + "]";
    }
}