package xyz.gauravsharma.factory;

public class BMWX5 implements Car {

    @Override
    public String getName() {
        return "BMW X5";
    }

    @Override
    public int getTopSpeed() {
        return 250;
    }
}
