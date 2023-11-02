import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть ім'я класу: ");
        String className = scanner.nextLine();

        try {
            Class<?> selectedClass = Class.forName(className);
            displayClassInfo(selectedClass);
        } catch (ClassNotFoundException e) {
            System.out.println("Клас не знайдено.");
        }
    }

    private static void displayClassInfo(Class<?> clazz) {
        System.out.println("Ім'я класу: " + clazz.getName());
        System.out.println("Загальний пакет: " + clazz.getPackage().getName());

        System.out.println("Конструктори:");
        for (var constructor : clazz.getDeclaredConstructors()) {
            System.out.println("  " + constructor.toString());
        }

        System.out.println("Поля:");
        for (var field : clazz.getDeclaredFields()) {
            System.out.println("  " + field.toString());
        }

        System.out.println("Методи:");
        for (var method : clazz.getDeclaredMethods()) {
            System.out.println("  " + method.toString());
        }
    }
}