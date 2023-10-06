import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        FurnitureFactory factory = new FurnitureFactory();

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("------------------");
            System.out.println("Який варіант набору Ви хотіли б придбати ?");
            System.out.println("1 -> Ар-деко");
            System.out.println("2 -> Вікторіанській");
            System.out.println("3 -> Модерн");
            System.out.println("------------------");
            System.out.print("Ви обрали варіант: ");
            choice = scanner.nextInt();
            // Додаємо нові варіанти меблів
            switch (choice) {
                case 1:
                    factory.produceFurnitureSet("Ар-деко");
                    break;
                case 2:
                    factory.produceFurnitureSet("Вікторіанській");
                    break;
                case 3:
                    factory.produceFurnitureSet("Модерн");
                    break;
                default:
                    System.out.println("Невірний вибір. Спробуйте ще раз.");
            }
        } while (choice < 1 || choice > 3);
    }
}