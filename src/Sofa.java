class Sofa implements Furniture {
    private String name;
    private double price;

    public Sofa(String name, double price) {
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