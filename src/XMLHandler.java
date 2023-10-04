public class XMLHandler extends AbstractHandler {
    public void open() {
        System.out.println("XMLHandler opens a document");
    }

    public void create() {
        System.out.println("XMLHandler creates a document");
    }

    public void change() {
        System.out.println("XMLHandler changes a document");
    }

    public void save() {
        System.out.println("XMLHandler saves a document");
    }
}