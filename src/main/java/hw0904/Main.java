package hw0904;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Main {
    public static void main(String[] args) {
        Class<?> myClass = MyClass.class;

        Field[] fields = myClass.getDeclaredFields();
        for (Field field : fields) {
            System.out.println("Field: " + field.getName());
            System.out.println("Type: " + field.getType());
            System.out.println("Modifier: " + Modifier.toString(field.getModifiers()));
            System.out.println();
        }

        Constructor<?>[] constructors = myClass.getDeclaredConstructors();
        for (Constructor<?> constructor : constructors) {
            System.out.println("Constructor: " + constructor.getName());
            System.out.println("Modifier: " + Modifier.toString(constructor.getModifiers()));
            System.out.println();
        }

        Method[] methods = myClass.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println("Method: " + method.getName());
            System.out.println("Return Type: " + method.getReturnType());
            System.out.println("Modifier: " + Modifier.toString(method.getModifiers()));
            System.out.println();
        }
    }
}