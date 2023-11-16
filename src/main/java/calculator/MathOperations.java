package calculator;

import java.lang.annotation.*;

/**
 * Клас для виконання математичних операцій.
 */
public class MathOperations {
    /**
     * Змінна для зберігання поточного результату.
     */
    private double result;

    /**
     * Конструктор за замовчуванням, що встановлює початковий результат на 0.
     */
    public MathOperations() {
        this.result = 0;
    }

    /**
     * Метод для виконання операції додавання.
     *
     * @param value Значення для додавання
     */
    @Operation(operation = "Додавання", value = 0)
    public void add(double value) {
        result += value;
    }

    /**
     * Метод для виконання операції віднімання.
     *
     * @param value Значення для віднімання
     */
    @Operation(operation = "Віднімання", value = 0)
    public void subtract(double value) {
        result -= value;
    }

    /**
     * Метод для виконання операції множення.
     *
     * @param value Значення для множення
     */
    @Operation(operation = "Множення", value = 1)
    public void multiply(double value) {
        result *= value;
    }

    /**
     * Метод для виконання операції ділення.
     *
     * @param value Значення для ділення
     */
    @Operation(operation = "Ділення", value = 1)
    public void divide(double value) {
        if (value != 0) {
            result /= value;
        } else {
            System.out.println("Помилка: Ділення на нуль.");
        }
    }

    /**
     * Метод для отримання поточного результату.
     *
     * @return Поточний результат
     */
    public double getResult() {
        return result;
    }
}