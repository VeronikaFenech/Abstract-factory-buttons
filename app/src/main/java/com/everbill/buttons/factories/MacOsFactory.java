package com.everbill.buttons.factories;

import com.everbill.buttons.buttons.Button;
import com.everbill.buttons.buttons.MacOsButton;
import com.everbill.buttons.checkboxes.Checkbox;
import com.everbill.buttons.checkboxes.MacOsCheckBox;

public class MacOsFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacOsButton();
    }

    @Override
    public Checkbox createCheckBox() {
        return new MacOsCheckBox();
    }
}
