package hw1105;

public class Main {

    public static void main(String[] args) {
        Deadlock d1 = new Deadlock();
        Deadlock d2 = new Deadlock();

        Thread t1 = new Thread(() -> d1.lockA(d2));
        Thread t2 = new Thread(() -> d2.lockB(d1));

        t1.start();
        t2.start();
    }
}