package xyz.gauravsharma.factory;

public class CarFactory {

    public Car getCarInstance(String carName) {

        if (carName.equals("TataNexon")) {
            return new TataNexon();
        } else if (carName.equals("TataAltroz")) {
            return new TataAltroz();
        } else if (carName.equals("HyundaiVerna")) {
            return new HyundaiVerna();
        } else if (carName.equals("MarutiBaleno")) {
            return new MarutiBaleno();
        } else if (carName.equals("BMWX5")) {
            return new BMWX5();
        } else if (carName.equals("MercedesE220")) {
            return new MercedesE220();
        } else {
            return null;
        }
    }
}
