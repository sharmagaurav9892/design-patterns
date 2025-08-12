package abstract_factory.uifactory;

import abstract_factory.Button;
import abstract_factory.CheckBox;
import abstract_factory.os.win.WinButton;
import abstract_factory.os.win.WinCheckBox;

public class WinUIFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new WinButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new WinCheckBox();
    }
}
