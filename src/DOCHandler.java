public class DOCHandler extends AbstractHandler {
    public void open() {
        System.out.println("DOCHandler opens a document");
    }

    public void create() {
        System.out.println("DOCHandler creates a document");
    }

    public void change() {
        System.out.println("DOCHandler changes a document");
    }

    public void save() {
        System.out.println("DOCHandler saves a document");
    }
}