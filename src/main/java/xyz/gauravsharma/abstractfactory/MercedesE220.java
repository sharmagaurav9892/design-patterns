package xyz.gauravsharma.abstractfactory;

public class MercedesE220 implements Car {

    @Override
    public String getName() {
        return "Mercedes E220";
    }

    @Override
    public int getTopSpeed() {
        return 240;
    }
}
