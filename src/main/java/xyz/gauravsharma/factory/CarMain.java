package xyz.gauravsharma.factory;

public class CarMain {

    public static void main(String[] args) {

        CarFactory carFactory = new CarFactory();

        Car car = carFactory.getCarInstance("TataNexon");
        System.out.println("Selected car " + car.getName() + " with top speed " + car.getTopSpeed() + " km/hour.");
    }
}