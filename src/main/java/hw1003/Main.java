package hw1003;

public class Main {

    public static void main(String[] args) throws NoSuchMethodException {
        Main main = new Main();
        main.mathSum();
    }

    @Math(num1 = 100, num2 = 200)
    public void mathSum() throws NoSuchMethodException {
        Math mathAnnotation = Main.class.getDeclaredMethod("mathSum").getAnnotation(Math.class);
        int num1 = mathAnnotation.num1();
        int num2 = mathAnnotation.num2();
        printSum(num1, num2);
    }

    private void printSum(int num1, int num2) {
        int sum = num1 + num2;
        System.out.println("Сума чисел " + num1 + " та " + num2 + " дорівнює " + sum);
    }
}