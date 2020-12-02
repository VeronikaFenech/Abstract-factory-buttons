package com.everbill.buttons.factories;

import com.everbill.buttons.buttons.Button;
import com.everbill.buttons.buttons.WindowsButton;
import com.everbill.buttons.checkboxes.Checkbox;
import com.everbill.buttons.checkboxes.WindowsCheckBox;

public class WindowsFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckBox() {
        return new WindowsCheckBox();
    }
}
