package xyz.gauravsharma.abstractfactory;

public class BudgetCarFactory implements AbstractCarFactory {

    public Car getCarInstance(String carName) {

        if (carName.equals("TataNexon")) {
            return new TataNexon();
        } else if (carName.equals("TataAltroz")) {
            return new TataAltroz();
        } else if (carName.equals("HyundaiVerna")) {
            return new HyundaiVerna();
        } else if (carName.equals("MarutiBaleno")) {
            return new MarutiBaleno();
        } else {
            return null;
        }
    }
}
