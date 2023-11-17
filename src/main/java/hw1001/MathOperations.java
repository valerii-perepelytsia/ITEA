package hw1001;

import java.lang.reflect.Method;

/**
 * Клас для виконання математичних операцій.
 */
public class MathOperations {
    private double result;

    public MathOperations() {
        this.result = 0;
    }

    public void performOperations() {
        Class<? extends MathOperations> clazz = this.getClass();
        Method[] methods = clazz.getDeclaredMethods();

        for (Method method : methods) {
            if (method.isAnnotationPresent(Operation.class)) {
                Operation operation = method.getAnnotation(Operation.class);
                String operationName = operation.operation();
                double value = operation.value();

                System.out.println("Виконується операція: " + operationName + " зі значенням: " + value);

                try {
                    method.invoke(this, value);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public double getResult() {
        return result;
    }

    @Operation(operation = "Додавання", value = 5)
    public void add(double value) {
        result += value;
    }

    @Operation(operation = "Віднімання", value = 3)
    public void subtract(double value) {
        result -= value;
    }

    @Operation(operation = "Множення", value = 2)
    public void multiply(double value) {
        result *= value;
    }

    @Operation(operation = "Ділення", value = 4)
    public void divide(double value) {
        if (value != 0) {
            result /= value;
        } else {
            System.out.println("Помилка: Ділення на нуль.");
        }
    }
}