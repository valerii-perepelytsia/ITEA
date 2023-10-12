package Zoo;

import java.util.ArrayList;

public class Zoo {
    private ArrayList<String> animals;

    public Zoo() {
        this.animals = new ArrayList<>();
    }

    public void add(int index, String element) {
        if (index >= 0 && index <= animals.size()) {
            animals.add(index, element);
        } else {
            throw new ArrayIndexOutOfBoundsException("Неприпустимий індекс для додавання тварини");
        }
    }

    public void remove(int index) {
        if (index >= 0 && index <= animals.size()) {
            animals.remove(index);
        } else {
            throw new ArrayIndexOutOfBoundsException("Неприпустимий індекс для додавання тварини");
        }
    }
    public int size() {
        return this.animals.size();
    }

    public void display() {
        System.out.println("Список тварин у зоопарку:");
        for (String animal : animals) {
            System.out.println(animal);
        }
    }
}