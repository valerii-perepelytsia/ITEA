public class Main {
    public static void main(String[] args) {
        FurnitureFactory factory = new FurnitureFactory();

        factory.setChair(new Chair("Тиха гавань", 2340.0));
        factory.setSofa(new Sofa("Мудрість віків", 7340.57));
        factory.setCoffeeTable(new CoffeeTable("Місце роздумів", 4340.0));

        java.util.Scanner scanner = new java.util.Scanner(System.in);

        while (true) {
            System.out.println("------------------");
            System.out.println("Який варіант набору Ви хотіли б придбати ?");
            System.out.println("1 -> Ар-деко");
            System.out.println("2 -> Вікторіанській");
            System.out.println("3 -> Модерн");
            System.out.println("------------------");

            int choice = scanner.nextInt();

            if (choice == 1) {
                System.out.println("Ви обрали варіант: Ар-деко");
                setFurnitureForArtDeco(factory);
                showFurnitureDetails(factory.getChair(), factory.getSofa(), factory.getCoffeeTable());
            } else if (choice == 2) {
                System.out.println("Ви обрали варіант: Вікторіанській");
                setFurnitureForVictorian(factory);
                showFurnitureDetails(factory.getChair(), factory.getSofa(), factory.getCoffeeTable());
            } else if (choice == 3) {
                System.out.println("Ви обрали варіант: Модерн");
                setFurnitureForModern(factory);
                showFurnitureDetails(factory.getChair(), factory.getSofa(), factory.getCoffeeTable());
            } else {
                System.out.println("Невірний вибір. Спробуйте ще раз.");
            }

            System.out.println("------------------");
        }
    }

    private static void setFurnitureForArtDeco(FurnitureFactory factory) {
        factory.setChair(new Chair("Тиха гавань", 2340.0));
        factory.setSofa(new Sofa("Мудрість віків", 7340.57));
        factory.setCoffeeTable(new CoffeeTable("Місце роздумів", 4340.0));
    }

    private static void setFurnitureForVictorian(FurnitureFactory factory) {
        factory.setChair(new NullFurniture());
        factory.setSofa(new NullFurniture());
        factory.setCoffeeTable(new NullFurniture());
    }

    private static void setFurnitureForModern(FurnitureFactory factory) {
        factory.setChair(new Chair("Сучасне крісло", 2000.0));
        factory.setSofa(new Sofa("Модерний диван", 5000.0));
        factory.setCoffeeTable(new CoffeeTable("Сучасний столик", 3000.0));
    }

    private static void showFurnitureDetails(Furniture chair, Furniture sofa, Furniture coffeeTable) {
        double totalCost = 0;

        System.out.println(chair.getName() + " - \"" + chair.getName() + "\", " + chair.getPrice() + " грн.");
        totalCost += chair.getPrice();

        System.out.println(sofa.getName() + " - \"" + sofa.getName() + "\", " + sofa.getPrice() + " грн.");
        totalCost += sofa.getPrice();

        System.out.println(coffeeTable.getName() + " - \"" + coffeeTable.getName() + "\", " + coffeeTable.getPrice() + " грн.");
        totalCost += coffeeTable.getPrice();

        System.out.println("Загальна сума: " + totalCost + " грн.");
    }
}