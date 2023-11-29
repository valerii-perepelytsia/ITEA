package hw1202;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("Test title", "Test Author", 2023);

        Runnable anonymousClass = new Runnable() {
            @Override
            public void run() {
                System.out.println("Anonymous class: " + book.getTitle());
            }
        };
        anonymousClass.run();

        Runnable lambdaExpression = () -> System.out.println("Lambda expression: " + book.getAuthor());
        lambdaExpression.run();
    }
}