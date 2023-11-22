package hw1104;


public class Main {

    public static void main(String[] args) {
        Thread firstThread = new Thread(() -> {
            System.out.println("Завершення first");
        });

        Thread secondThread = new Thread(() -> {
            System.out.println("Завершення second");
        });

        firstThread.start();

        try {
            firstThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Завершення main");

        secondThread.start();

        try {
            secondThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}