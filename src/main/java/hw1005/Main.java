package hw1005;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Валерій - тест", 33);

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("person.ser"))) {
            oos.writeObject(person);
            System.out.println("Об'єкт серіалізовано.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("person.ser"))) {
            Person deserializedPerson = (Person) ois.readObject();
            System.out.println("Об'єкт десеріалізовано: " + deserializedPerson.getName() + ", " +
                    deserializedPerson.getAge());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}