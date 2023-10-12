import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Worker> workers = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.println("Введіть дані працівника " + (i + 1) + ":");
            System.out.print("Прізвище та ініціали: ");
            String fullName = scanner.next();
            scanner.nextLine();

            System.out.print("Назва посади: ");
            String jobTitle = scanner.nextLine();

            int startYear = 0;
            boolean validInput = false;

            while (!validInput) {
                System.out.print("Рік надходження на роботу: ");
                if (scanner.hasNextInt()) {
                    startYear = scanner.nextInt();
                    validInput = true;
                } else {
                    System.out.println("Помилка! Введено не коректний рік.");
                    scanner.next();
                }
            }

            workers.add(new Worker(fullName, jobTitle, startYear));
        }

        workers.sort(new WorkerComparator());

        System.out.print("Введіть рік стажу: ");
        int requiredYear = scanner.nextInt();

        System.out.println("Список працівників із стажем більше " + requiredYear + " років:");

        for (Worker worker : workers) {
            if (2023 - worker.getStartYear() > requiredYear) {
                System.out.println(worker.getFullName());
            }
        }
    }
}