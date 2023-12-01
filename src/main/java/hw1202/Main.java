package hw1202;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("Test title", "Test author", 2023);

        String testInfo1 = "Test closure inf1";
        BookOperation testClosure1 = new BookOperation() {
            @Override
            public void performOperation() {
                System.out.println("Test closure1: " + book.getTitle() + ", " + testInfo1);
            }
        };
        testClosure1.performOperation();

        String testInfo2 = "Test closure inf2";
        BookOperation testClosure2 = () -> {
            System.out.println("Test closure2: " + book.getAuthor() + ", " + testInfo2);
        };
        testClosure2.performOperation();
    }
}