public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car(2022);
        Car car3 = new Car(2019, "Червоний");

        System.out.println("Машина 1: Рік - " + car1.getYear() + ", Колір - " + car1.getColor());
        System.out.println("Машина 2: Рік - " + car2.getYear() + ", Колір - " + car2.getColor());
        System.out.println("Машина 3: Рік - " + car3.getYear() + ", Колір - " + car3.getColor());
    }
}





