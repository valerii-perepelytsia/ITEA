class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car(2022);
        Car car3 = new Car(2019, 120.5);
        Car car4 = new Car(2010, 80.0, 1500);
        Car car5 = new Car(2023, 150.0, 1800, "Синій");

        System.out.println("Машина 1: Рік - " + car1.getYear() + ", Швидкість - " + car1.getSpeed() +
                ", Вага - " + car1.getWeight() + ", Колір - " + car1.getColor());
        System.out.println("Машина 2: Рік - " + car2.getYear() + ", Швидкість - " + car2.getSpeed() +
                ", Вага - " + car2.getWeight() + ", Колір - " + car2.getColor());
        System.out.println("Машина 3: Рік - " + car3.getYear() + ", Швидкість - " + car3.getSpeed() +
                ", Вага - " + car3.getWeight() + ", Колір - " + car3.getColor());
        System.out.println("Машина 4: Рік - " + car4.getYear() + ", Швидкість - " + car4.getSpeed() +
                ", Вага - " + car4.getWeight() + ", Колір - " + car4.getColor());
        System.out.println("Машина 5: Рік - " + car5.getYear() + ", Швидкість - " + car5.getSpeed() +
                ", Вага - " + car5.getWeight() + ", Колір - " + car5.getColor());
    }
}

