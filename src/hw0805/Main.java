package hw0805;

import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        TreeMap<String, String> cityToFamilyMap = new TreeMap<>();

        cityToFamilyMap.put("Львів", "Іванови");
        cityToFamilyMap.put("Київ", "Петрови");
        cityToFamilyMap.put("Лондон", "Абрамовичі");
        System.out.println(cityToFamilyMap);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть назву міста:");
        String city = scanner.nextLine();

        String family = cityToFamilyMap.get(city);

        if (family != null) {
            System.out.println(family);

            System.out.println("Видалити цей запис? (Так/Ні):");
            String deleteChoice = scanner.nextLine();
            if (deleteChoice.equalsIgnoreCase("Так")) {
                cityToFamilyMap.remove(city);
                System.out.println("Запис видалено.");
            }
        } else {
            System.out.println("Місто не знайдено у списку.");
        }
    }
}