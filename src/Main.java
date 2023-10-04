public class Main {
    public static void main(String[] args) {
        Car ford = new Car("Ford", 150.0, 200, 25000.0, 1967);
        Car mitsubishi = new Car("Mitsubishi", 180.5, 280, 32000.0, 1967);
        Car toyota = new Car("Toyota", 120.0, 220, 21000.0, 1967);
        Car kia = new Car("KIA", 200.0, 189, 3458.90, 1967);

        CarInfo carInfo = new CarInfo();
        carInfo.addCar(ford);
        carInfo.addCar(mitsubishi);
        carInfo.addCar(toyota);
        carInfo.addCar(kia);

        Car fastestCar = carInfo.getFastestCar();
        Car mostExpensiveCar = carInfo.getMostExpensiveCar();
        Car mostPowerfulCar = carInfo.getMostPowerfulCar();

        System.out.println("Fastest Car:");
        carInfo.printCarInfo(fastestCar);

        System.out.println("\nMost Expensive Car:");
        carInfo.printCarInfo(mostExpensiveCar);

        System.out.println("\nMost Powerful Car:");
        carInfo.printCarInfo(mostPowerfulCar);
    }
}