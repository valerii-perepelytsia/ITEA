public class TXTHandler extends AbstractHandler {
    public void open() {
        System.out.println("TXTHandler opens a document");
    }

    public void create() {
        System.out.println("TXTHandler creates a document");
    }

    public void change() {
        System.out.println("TXTHandler changes a document");
    }

    public void save() {
        System.out.println("TXTHandler saves a document");
    }
}