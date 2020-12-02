package com.everbill.buttons;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.everbill.buttons.buttons.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Application app = DemoApplication.configureApplication(DemoApplication.LINUX_TYPE);

        app.paint();
    }
}