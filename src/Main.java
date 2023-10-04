class Main {
    public static void main(String[] args) {

        double celsius = 25.0;

        celsiusToKelvin kelvin = new celsiusToKelvin();
        System.out.println(celsius + " градусів за Цельсієм = " + kelvin.convert(celsius) + " Кельвінів");

        celsiusToFahrenheit fahrenheit = new celsiusToFahrenheit();
        System.out.println(celsius + " градусів за Цельсієм = " + fahrenheit.convert(celsius) + " Фаренгейтів");
    }
}