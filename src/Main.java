
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Car c1 = new Car(190, 8000, "BMW", "Red");
        Car c2 = new Car(190, 2000, "Opel", "Black");
        Car c3 = new Car(185, 10000, "Mercedes", "White");
        Car[] c = {c1, c2, c3};

        for (Car temp : c) {
            System.out.println(temp);
        }
        Arrays.sort(c, new CarComparator());
    }
}

class CarComparator implements Comparator<Car> {
    public int compare(Car car1, Car car2) {
        int result = car1.compareTo(car2);
        System.out.println("Comparison result: " + result);
        return result;
    }
}