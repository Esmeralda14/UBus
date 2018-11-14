package com.example.esmer.u_bus;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class imagenCamion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imagen_camion);
        setupActionBar();
    }

    private void setupActionBar(){
        ActionBar action = getSupportActionBar();
        if (action != null){
            action.setDisplayHomeAsUpEnabled(true);
            action.setTitle("R- 20 de Noviembre");
        }
    }
}
