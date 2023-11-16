package calculator;

public class Main {
    public static void main(String[] args) {
        MathOperations mathOperations = new MathOperations();

        // Тестування анотацій для додавання та віднімання
        mathOperations.add(5);
        mathOperations.subtract(3);

        // Тестування анотацій для множення та ділення
        mathOperations.multiply(2);
        mathOperations.divide(4);

        // Отримання та виведення результату
        double result = mathOperations.getResult();
        System.out.println("Результат: " + result);
    }
}