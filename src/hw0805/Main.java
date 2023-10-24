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
        System.out.println(family);
    }
}