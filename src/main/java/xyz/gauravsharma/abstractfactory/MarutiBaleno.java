package xyz.gauravsharma.abstractfactory;

public class MarutiBaleno implements Car {

    @Override
    public String getName() {
        return "Maruti Baleno";
    }

    @Override
    public int getTopSpeed() {
        return 160;
    }
}
