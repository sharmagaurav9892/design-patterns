package xyz.gauravsharma.factory;

public class HyundaiVerna implements Car {

    @Override
    public String getName() {
        return "Hyundai Verna";
    }

    @Override
    public int getTopSpeed() {
        return 190;
    }
}
