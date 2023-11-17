package hw1001;

public class Main {
    public static void main(String[] args) {
        MathOperations mathOperations = new MathOperations();

        mathOperations.performOperations();

        double result = mathOperations.getResult();
        System.out.println("Результат: " + result);
    }
}