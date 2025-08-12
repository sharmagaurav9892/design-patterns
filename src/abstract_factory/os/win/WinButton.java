package abstract_factory.os.win;


import abstract_factory.Button;

public class WinButton implements Button {
    @Override
    public void paint() {
        System.out.println("Win Button");
    }
}
