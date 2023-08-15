package xyz.gauravsharma.factory;

public class TataAltroz implements Car {

    @Override
    public String getName() {
        return "Tata Altroz";
    }

    @Override
    public int getTopSpeed() {
        return 160;
    }
}
