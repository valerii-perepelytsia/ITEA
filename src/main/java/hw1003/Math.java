package hw1003;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Math {
    int num1() default 0;
    int num2() default 0;
}