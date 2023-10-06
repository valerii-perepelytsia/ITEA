public class Main {
    public static void main(String[] args) {
        Car ford = new Ford("Ford", 150.0, 300, 25000.0);
        Car mitsubishi = new Mitsubishi("Mitsubishi", 180.0, 280, 30000.0);
        Car toyota = new Toyota("Toyota", 120.0, 200, 20000.0);
        Car kia = new KIA("KIA Rio", 600.0, 189, 3458.90);

        CarInfo carInfo = new CarInfo();
        carInfo.addCar(ford);
        carInfo.addCar(mitsubishi);
        carInfo.addCar(toyota);
        carInfo.addCar(kia);

        Car mostExpensiveCar = carInfo.getMostExpensiveCar();
        Car fastestCar = carInfo.getFastestCar();
        Car mostPowerfulCar = carInfo.getMostPowerfulCar();

        System.out.println("Найдорожча машина:");
        carInfo.printCarInfo(mostExpensiveCar);
        System.out.println("\nНайшвидша машина:");
        carInfo.printCarInfo(fastestCar);
        System.out.println("\nНайпотужніша машина:");
        carInfo.printCarInfo(mostPowerfulCar);
    }
}