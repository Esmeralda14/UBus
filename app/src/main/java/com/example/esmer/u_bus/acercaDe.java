package com.example.esmer.u_bus;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class acercaDe extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acerca_de);
        setupActionBar();
    }

    private void setupActionBar() {
        ActionBar action = getSupportActionBar();
        if (action != null) {
            action.setDisplayHomeAsUpEnabled(true);
            action.setTitle("Acerca de...");

        }
    }
}
