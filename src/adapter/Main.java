package adapter;

public class Main {

    public static void main(String[] args) {
        FahrenheitThermometer oldThermometer = new FahrenheitThermometer();
        Temperature temp = new TemperatureAdapter(oldThermometer);
        System.out.println("Temperature in Celsius: " + temp.getTemperatureInCelsius());
    }

}






/*


***********************------>>>>>>>>>>
Adapter Design Pattern

Java Example — Object Adapter

Scenario:
	•	We have an old class that gives temperature in Fahrenheit.
	•	The new system works in Celsius.


// Target interface (what client expects)
interface Temperature {
    double getTemperatureInCelsius();
}

// Adaptee (existing class with incompatible interface)
class FahrenheitThermometer {
    double getTemperatureInFahrenheit() {
        return 98.6;
    }
}

// Adapter
class TemperatureAdapter implements Temperature {
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

// Client
public class Main {
    public static void main(String[] args) {
        FahrenheitThermometer oldThermometer = new FahrenheitThermometer();
        Temperature temp = new TemperatureAdapter(oldThermometer);
        System.out.println("Temperature in Celsius: " + temp.getTemperatureInCelsius());
    }
}

***********************------>>>>>>>>>>


 */