class Book {
    Title title = new Title();
    Author author = new Author();
    Content content = new Content();

    public void show() {
        title.show();
        author.show();
        content.show();
    }
}