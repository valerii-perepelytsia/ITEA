import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Worker[] workers = new Worker[5];

        for (int i = 0; i < workers.length; i++) {
            try {
                System.out.println("Введіть дані для працівника " + (i + 1) + ":");
                System.out.print("Прізвище та ініціали: ");
                String fullName = scanner.next();
                System.out.print("Назва посади: ");
                String jobTitle = scanner.next();
                System.out.print("Рік надходження на роботу: ");
                int hireYear = scanner.nextInt();

                workers[i] = new Worker(fullName, jobTitle, hireYear);
            } catch (InputMismatchException e) {
                System.out.println("Помилка: Введено некоректний формат року.");
                return;
            }
        }

        Arrays.sort(workers);

        System.out.print("Введіть рік для пошуку працівників з більшим стажем: ");
        int searchYear = scanner.nextInt();

        System.out.println("Прізвища працівників зі стажем більше " + searchYear + ":");
        for (Worker worker : workers) {
            if (worker.getHireYear() > searchYear) {
                System.out.println(worker.getFullName() + " (Стаж: " + (2023 - worker.getHireYear()) + " роки)");
            }
        }
    }
}