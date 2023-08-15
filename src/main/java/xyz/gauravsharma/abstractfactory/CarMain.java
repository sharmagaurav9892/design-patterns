package xyz.gauravsharma.abstractfactory;

public class CarMain {

    public static void main(String[] args) {

        AbstractCarFactoryProducer abstractCarFactoryProducer = new AbstractCarFactoryProducer();
        AbstractCarFactory carFactory = abstractCarFactoryProducer.getCarFactoryInstance("LuxuryCarFactory");
        Car car = carFactory.getCarInstance("BMWX5");
        System.out.println("Selected car " + car.getName() + " with top speed " + car.getTopSpeed() + " km/hour.");
    }
}