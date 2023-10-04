class CarInfo {
    private Car[] cars;
    private int carCount;

    public CarInfo() {
        cars = new Car[4];
        carCount = 0;
    }

    public void addCar(Car car) {
        if (carCount < cars.length) {
            cars[carCount] = car;
            carCount++;
        }
    }

    public Car getFastestCar() {
        Car fastestCar = cars[0];
        for (int i = 1; i < carCount; i++) {
            if (cars[i].getSpeed() > fastestCar.getSpeed()) {
                fastestCar = cars[i];
            }
        }
        return fastestCar;
    }

    public Car getMostExpensiveCar() {
        Car mostExpensiveCar = cars[0];
        for (int i = 1; i < carCount; i++) {
            if (cars[i].getPrice() > mostExpensiveCar.getPrice()) {
                mostExpensiveCar = cars[i];
            }
        }
        return mostExpensiveCar;
    }

    public Car getMostPowerfulCar() {
        Car mostPowerfulCar = cars[0];
        for (int i = 1; i < carCount; i++) {
            if (cars[i].getPower() > mostPowerfulCar.getPower()) {
                mostPowerfulCar = cars[i];
            }
        }
        return mostPowerfulCar;
    }

    public void printCarInfo(Car car) {
        System.out.println("Brand: " + car.getModel());
        System.out.println("Power: " + car.getPower());
        System.out.println("Speed: " + car.getSpeed());
        System.out.println("Price: " + car.getPrice());
        System.out.println("Year: " + car.getYearOfManufacture());
    }
}