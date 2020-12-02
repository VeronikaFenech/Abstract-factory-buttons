package com.everbill.buttons;

import com.everbill.buttons.factories.GUIFactory;
import com.everbill.buttons.factories.LinuxFactory;
import com.everbill.buttons.factories.MacOsFactory;
import com.everbill.buttons.factories.WindowsFactory;

public class DemoApplication {
    public static String WINDOWS_TYPE = "WINDOWS_TYPE";
    public static String MAC_TYPE = "MAC_TYPE";
    public static String LINUX_TYPE = "LINUX_TYPE";

    public static Application configureApplication(String type) {
        Application app;
        GUIFactory factory;

        if (type.equals(WINDOWS_TYPE)) {
            factory = new WindowsFactory();
        } else if (type.equals(MAC_TYPE)){
            factory = new MacOsFactory();
        }else{
            factory = new LinuxFactory();
        }
        app = new Application(factory);
        return app;
    }
}
