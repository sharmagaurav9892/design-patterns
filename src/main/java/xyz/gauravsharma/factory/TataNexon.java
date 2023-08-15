package xyz.gauravsharma.factory;

public class TataNexon implements Car {

    @Override
    public String getName() {
        return "Tata Nexon";
    }

    @Override
    public int getTopSpeed() {
        return 190;
    }
}
