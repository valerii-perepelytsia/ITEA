class ColorPrint extends Printer {
    public void printInColor(String value) {
        System.out.println("\u001B[31m" + value + "\u001B[0m");
    }
}