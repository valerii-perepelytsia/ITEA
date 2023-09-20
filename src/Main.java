class Main {
    public static void main(String[] args) {
        Vehicle vehicle1 = new Plane(5000000, 900, 2020, 12000, 250);
        Vehicle vehicle2 = new Car(25000, 180, 2022, 5);
        Vehicle vehicle3 = new Ship(8000000, 60, 2015, 1500, "Одеса");

        System.out.println("Інформація про транспортні засоби:");
        vehicle1.displayInfo();
        System.out.println();
        vehicle2.displayInfo();
        System.out.println();
        vehicle3.displayInfo();
    }
}