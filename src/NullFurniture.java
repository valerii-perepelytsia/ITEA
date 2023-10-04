class NullFurniture implements Furniture {
    public double getPrice() {
        return 0.0;
    }

    public String getName() {
        return "Відсутній";
    }
}