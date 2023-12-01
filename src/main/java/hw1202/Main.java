package hw1202;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("Test title", "Test Test", 2023);

        String testClosureInfo = "test string";
        Runnable lambdaClosure = () -> {
            System.out.println("Lambda closure: "
                    + book.getTitle() + ", "
                    + book.getAuthor() + ", "
                    + book.getYear() + ", "
                    + testClosureInfo);
        };
        lambdaClosure.run();
    }
}