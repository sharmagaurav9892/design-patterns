package abstract_factory.os.win;


import abstract_factory.CheckBox;

public class WinCheckBox implements CheckBox {
    @Override
    public void paint() {
        System.out.println("Win Checkbox");
    }
}
