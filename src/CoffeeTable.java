class CoffeeTable implements Furniture {
    private String name;
    private double price;

    public CoffeeTable(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}