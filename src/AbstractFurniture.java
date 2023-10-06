abstract class AbstractFurniture implements Furniture {
    private String name;
    private double price;

    public AbstractFurniture(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}