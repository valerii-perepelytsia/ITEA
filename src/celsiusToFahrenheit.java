public class celsiusToFahrenheit implements ConverterTemperature{
    @Override
    public double convert(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
}
