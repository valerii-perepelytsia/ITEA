package hw1201;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 7, 1, 8, 3, 5, 9, 6, 4, 10);

        System.out.println("Список чисел: " + numbers);

        int sumOfSquares = numbers.stream()
                .map(x -> x * x)
                .reduce(0, Integer::sum);

        System.out.println("Сума квадратів чисел: " + sumOfSquares);
    }
}