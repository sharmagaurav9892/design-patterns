package abstract_factory.os.mac;


import abstract_factory.Button;

public class MacButton implements Button {
    @Override
    public void paint() {
        System.out.println("Mac Button");
    }
}
