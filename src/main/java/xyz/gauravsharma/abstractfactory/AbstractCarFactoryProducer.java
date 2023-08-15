package xyz.gauravsharma.abstractfactory;

public class AbstractCarFactoryProducer {

    public AbstractCarFactory getCarFactoryInstance(String carFactoryName) {

        if (carFactoryName.equals("BudgetCarFactory")) {
            return new BudgetCarFactory();
        } else if (carFactoryName.equals("LuxuryCarFactory")) {
            return new LuxuryCarFactory();
        } else {
            return null;
        }
    }
}
