package calculator;

public class Calculator {
    @CalculatorOperation(operand1 = 5, operand2 = 3)
    public double add() {
        return operand1 + operand2;
    }

    @CalculatorOperation(operand1 = 5, operand2 = 3)
    public double subtract() {
        return operand1 - operand2;
    }

    @CalculatorOperation(operand1 = 5, operand2 = 3)
    public double multiply() {
        return operand1 * operand2;
    }

    @CalculatorOperation(operand1 = 6, operand2 = 2)
    public double divide() {
        if (operand2 != 0) {
            return operand1 / operand2;
        } else {
            throw new ArithmeticException("Cannot divide by zero");
        }
    }

    public Calculator(double operand1, double operand2) {
        this.operand1 = operand1;
        this.operand2 = operand2;
    }

    private double operand1;
    private double operand2;
}