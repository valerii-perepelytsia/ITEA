class FurnitureFactory {
    public void produceFurnitureSet(String style) {
        System.out.println("Детальний опис:");
        double totalCost = 0.0;

        switch (style) {
            case "Ар-деко":
                AbstractFurniture chair1 = new AbstractFurniture("Тиха гавань", 2340.0) {};
                AbstractFurniture sofa1 = new AbstractFurniture("Мудрість віків", 7340.57) {};
                AbstractFurniture table1 = new AbstractFurniture("Місце роздумів", 4340.0) {};

                System.out.println(chair1.getName() + " - " + chair1.getPrice() + " грн.");
                System.out.println(sofa1.getName() + " - " + sofa1.getPrice() + " грн.");
                System.out.println(table1.getName() + " - " + table1.getPrice() + " грн.");

                totalCost = chair1.getPrice() + sofa1.getPrice() + table1.getPrice();
                break;

            case "Вікторіанській":
                AbstractFurniture chair2 = new AbstractFurniture("Стар шіп", 1340.0) {};
                AbstractFurniture sofa2 = new AbstractFurniture("Гіпер портал", 5340.17) {};
                AbstractFurniture table2 = new AbstractFurniture("Пульт керування", 4340.0) {};

                System.out.println(chair2.getName() + " - " + chair2.getPrice() + " грн.");
                System.out.println(sofa2.getName() + " - " + sofa2.getPrice() + " грн.");
                System.out.println(table2.getName() + " - " + table2.getPrice() + " грн.");

                totalCost = chair2.getPrice() + sofa2.getPrice() + table2.getPrice();
                break;

            case "Модерн":
                // Тут додаємо нові меблі :)
                break;

            default:
                System.out.println("Невірний стиль меблів.");
                return;
        }

        System.out.println("Загальна сума: " + totalCost + " грн.");
    }
}