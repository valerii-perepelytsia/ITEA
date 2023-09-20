class Main {
    public static void main(String[] args) {
        Book book = new Book();

        book.title.title = "Тестова книга";
        book.author.author = "Тест Тестов";
        book.content.content = "Тестовий зміст";

        book.show();
    }
}
