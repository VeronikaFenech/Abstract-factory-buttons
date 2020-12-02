package com.everbill.buttons.factories;


import com.everbill.buttons.buttons.Button;
import com.everbill.buttons.checkboxes.Checkbox;

public interface GUIFactory {
    Button createButton(); //Abstract method
    Checkbox createCheckBox(); //Abstract method
}
