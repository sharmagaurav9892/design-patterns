package xyz.gauravsharma.abstractfactory;

public class LuxuryCarFactory implements AbstractCarFactory {

    public Car getCarInstance(String carName) {

        if (carName.equals("BMWX5")) {
            return new BMWX5();
        } else if (carName.equals("MercedesE220")) {
            return new MercedesE220();
        } else {
            return null;
        }
    }
}
