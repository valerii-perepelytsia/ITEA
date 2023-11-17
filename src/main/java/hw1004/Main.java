package hw1004;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("publicValue", "protectedValue", "publicStaticValue");

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("animal.ser"))) {
            oos.writeObject(animal);
            System.out.println("Serialization successful. Animal object is saved to animal.ser");
        } catch (Exception e) {
            e.printStackTrace();
        }
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("animal.ser"))) {
            Animal anser = (Animal) ois.readObject();
            System.out.println("Deserialization successful. Content of Animal object:");
            System.out.println("publicField: " + anser.publicField);
            System.out.println("protectedField: " + anser.protectedField);
            System.out.println("publicStaticField: " + anser.publicStaticField);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}