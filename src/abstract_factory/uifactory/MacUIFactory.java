package abstract_factory.uifactory;


import abstract_factory.Button;
import abstract_factory.CheckBox;
import abstract_factory.os.mac.MacButton;
import abstract_factory.os.mac.MacCheckBox;

public class MacUIFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new MacCheckBox();
    }
}
