public class Main {
    public static void main(String[] args) {
        XMLHandler xmlHandler = new XMLHandler();
        TXTHandler txtHandler = new TXTHandler();
        DOCHandler docHandler = new DOCHandler();

        xmlHandler.open();
        txtHandler.create();
        docHandler.change();
        docHandler.save();
    }
}