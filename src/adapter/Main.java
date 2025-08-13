package adapter;

public class Main {

    public static void main(String[] args) {
        FahrenheitThermometer oldThermometer = new FahrenheitThermometer();
        Temperature temp = new TemperatureAdapter(oldThermometer);
        System.out.println("Temperature in Celsius: " + temp.getTemperatureInCelsius());
    }

}
