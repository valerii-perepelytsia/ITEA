package hw1004;

import java.io.Serializable;

public class Animal implements Serializable {
    public String publicField;
    protected String protectedField;
    public static String publicStaticField;

    public Animal(String publicField, String protectedField, String publicStaticField) {
        this.publicField = publicField;
        this.protectedField = protectedField;
        Animal.publicStaticField = publicStaticField;
    }
}