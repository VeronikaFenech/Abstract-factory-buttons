package com.everbill.buttons;

import com.everbill.buttons.buttons.Button;
import com.everbill.buttons.checkboxes.Checkbox;
import com.everbill.buttons.factories.GUIFactory;

public class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckBox();
    }

    public Button getButton(){
        return button;
    }

    public Checkbox getCheckbox(){
        return checkbox;
    }

    public void paint(){
        checkbox.paint();
        button.paint();
    }
}
