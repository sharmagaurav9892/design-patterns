package abstract_factory.uifactory;

import abstract_factory.Button;
import abstract_factory.CheckBox;

public interface UIFactory {
    Button createButton();
    CheckBox createCheckBox();
}
