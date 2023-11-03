package hw0905;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Test Private Value", "Test Public Value",
                "Test Protected Value", "Test Public Static Value",
                "Test Private Static Value");

        Class<?> animalClass = Animal.class;
        try {
            Field privateField = animalClass.getDeclaredField("privateField");
            Field publicField = animalClass.getField("publicField");
            Field protectedField = animalClass.getDeclaredField("protectedField");
            Field finalField = animalClass.getDeclaredField("finalField");
            Field publicStaticField = animalClass.getDeclaredField("publicStaticField");
            Field publicStaticFinalField = animalClass.getDeclaredField("publicStaticFinalField");
            Field privateStaticField = animalClass.getDeclaredField("privateStaticField");
            Field privateStaticFinalField = animalClass.getDeclaredField("privateStaticFinalField");

            privateField.setAccessible(true);
            protectedField.setAccessible(true);
            finalField.setAccessible(true);
            privateStaticField.setAccessible(true);
            privateStaticFinalField.setAccessible(true);

            privateField.set(cat, "New Test Private Value");
            publicField.set(cat, "New Test Public Value");
            protectedField.set(cat, "New Test Protected Value");
            privateStaticField.set(null, "New Test Private Static Value");

            System.out.println("Private Field: " + privateField.get(cat));
            System.out.println("Public Field: " + publicField.get(cat));
            System.out.println("Protected Field: " + protectedField.get(cat));
            System.out.println("Final Field: " + finalField.get(cat));
            System.out.println("Public Static Field: " + Animal.publicStaticField);
            System.out.println("Public Static Final Field: " + Animal.publicStaticFinalField);
            System.out.println("Private Static Field: " + privateStaticField.get(null));
            System.out.println("Private Static Final Field: " + privateStaticFinalField.get(null));

        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}