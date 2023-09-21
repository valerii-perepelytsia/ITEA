class Main {
    public static void main(String[] args) {
        Printer colorPrinter = new ColorPrint();
        Printer blackPrinter = new BlackPrint();

        ((ColorPrint) colorPrinter).printInColor("Червоний");
        ((BlackPrint) blackPrinter).printInBlack("Чорний");
    }
}