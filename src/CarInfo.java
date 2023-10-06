public class CarInfo {
    private Car[] carArray = new Car[4];
    private int carCount = 0;

    public void addCar(Car car) {
        if (carCount < 4) {
            carArray[carCount] = car;
            carCount++;
        }
    }

    public Car getMostExpensiveCar() {
        Car mostExpensive = carArray[0];
        for (int i = 1; i < carCount; i++) {
            if (carArray[i].getPrice() > mostExpensive.getPrice()) {
                mostExpensive = carArray[i];
            }
        }
        return mostExpensive;
    }

    public Car getFastestCar() {
        Car fastest = carArray[0];
        for (int i = 1; i < carCount; i++) {
            if (carArray[i].getSpeed() > fastest.getSpeed()) {
                fastest = carArray[i];
            }
        }
        return fastest;
    }

    public Car getMostPowerfulCar() {
        Car mostPowerful = carArray[0];
        for (int i = 1; i < carCount; i++) {
            if (carArray[i].getPower() > mostPowerful.getPower()) {
                mostPowerful = carArray[i];
            }
        }
        return mostPowerful;
    }

    public void printCarInfo(Car car) {
        System.out.println("Brand: " + car.getModel());
        System.out.println("Power: " + car.getPower());
        System.out.println("Speed: " + car.getSpeed());
        System.out.println("Price: " + car.getPrice());
        System.out.println("Year: " + car.getYearOfManufacture());
    }
}