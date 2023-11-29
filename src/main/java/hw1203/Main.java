package hw1203;

public class Main {
    public static void main(String[] args) {
        MathOperation addition = (a, b) -> a + b;
        System.out.println("Додавання: " + addition.operate(5, 3));

        MathOperation subtraction = (a, b) -> a - b;
        System.out.println("Віднімання: " + subtraction.operate(5, 3));

        MathOperation multiplication = (a, b) -> a * b;
        System.out.println("Множення: " + multiplication.operate(5, 3));

        MathOperation division = (a, b) -> a / b;
        System.out.println("Ділення: " + division.operate(5, 3));

        MathOperation power = Math::pow;
        System.out.println("Ступінь: " + power.operate(5, 3));

        MathOperation squareRoot = (a, b) -> Math.pow(a, 1 / b);
        System.out.println("Корінь: " + squareRoot.operate(27, 3));
    }
}