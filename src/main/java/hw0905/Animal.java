package hw0905;

public class Animal {
    private String privateField;
    public String publicField;
    protected String protectedField;
    final String finalField = "This is a final field";
    public static String publicStaticField;
    public static final String publicStaticFinalField = "This is a public static final field";
    private static String privateStaticField;
    private static final String privateStaticFinalField = "This is a private static final field";

    // Конструктор
    public Animal(String privateField, String publicField, String protectedField, String publicStaticField, String privateStaticField) {
        this.privateField = privateField;
        this.publicField = publicField;
        this.protectedField = protectedField;
        this.publicStaticField = publicStaticField;
        this.privateStaticField = privateStaticField;
    }
}