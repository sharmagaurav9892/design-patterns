package adapter;

public class TemperatureAdapter implements Temperature {
    private FahrenheitThermometer thermometer;

    public TemperatureAdapter(FahrenheitThermometer thermometer) {
        this.thermometer = thermometer;
    }

    @Override
    public double getTemperatureInCelsius() {
        double f = thermometer.getTemperatureInFahrenheit();
        return (f - 32) * 5 / 9;
    }
}
