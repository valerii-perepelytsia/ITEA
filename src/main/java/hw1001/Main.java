package hw1001;

public class Main {
    public static void main(String[] args) {
        MathOperations mathOperations = new MathOperations();

        mathOperations.add(5);
        mathOperations.subtract(3);

        mathOperations.multiply(2);
        mathOperations.divide(4);

        double result = mathOperations.getResult();
        System.out.println("Результат: " + result);
    }
}