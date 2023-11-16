package calculator;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator(4, 2);

        System.out.println("Addition: " + calculator.add());
        System.out.println("Subtraction: " + calculator.subtract());
        System.out.println("Multiplication: " + calculator.multiply());
        System.out.println("Division: " + calculator.divide());
    }
}