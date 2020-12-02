package com.everbill.buttons.factories;

import com.everbill.buttons.buttons.Button;
import com.everbill.buttons.buttons.LinuxButton;
import com.everbill.buttons.checkboxes.Checkbox;
import com.everbill.buttons.checkboxes.LinuxCheckbox;

public class LinuxFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new LinuxButton();
    }

    @Override
    public Checkbox createCheckBox() {
        return new LinuxCheckbox();
    }
}
