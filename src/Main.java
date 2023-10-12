class Main {
    public static void main(String[] args) {
        Vehicles.CAR.setColor("Red");
        Vehicles.MOTORCYCLE.setColor("Black");
        Vehicles.TRUCK.setColor("Blue");

        System.out.println(Vehicles.CAR);
        System.out.println(Vehicles.MOTORCYCLE);
        System.out.println(Vehicles.TRUCK);
    }
}