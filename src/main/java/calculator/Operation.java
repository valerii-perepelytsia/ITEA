package calculator;

import java.lang.annotation.*;

/**
 * Анотація для позначення методів математичних операцій.
 * Параметри:
 * - operation: операція (додавання, віднімання, множення, ділення)
 * - value: значення для виконання операції
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Documented
public @interface Operation {
    String operation();

    double value();
}
