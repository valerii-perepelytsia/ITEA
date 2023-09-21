class BlackPrint extends Printer {
    public void printInBlack(String value) {
        System.out.println("\u001B[30m" + value + "\u001B[0m"); // Додаємо ANSI-код для чорно-білого кольору
    }
}