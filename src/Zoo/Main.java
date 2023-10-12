package Zoo;

public class  Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();

        zoo.add(0, "Лев");
        zoo.add(1, "Зебра");
        zoo.add(2, "Слон");
        zoo.add(3, "Тигр");
        zoo.add(4, "Гіпопотам");
        zoo.add(5, "Жираф");
        zoo.add(6, "Крокодил");
        zoo.add(7, "Пінгвін");

        zoo.display();

        zoo.remove(7);
        zoo.remove(5);
        zoo.remove(3);

        zoo.display();

        int size = zoo.size();
        System.out.println("Розмір списку тварин: " + size);
    }
}
