package com.example.esmer.u_bus;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class agregarTarjeta extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agregar_tarjeta);
        setupActionBar();
    }

    private void setupActionBar() {
        ActionBar action = getSupportActionBar();
        if (action != null) {
            action.setDisplayHomeAsUpEnabled(true);
            action.setTitle("Agregar tarjeta");

        }
    }

    public void agregarTarjeta(View view) {
        Toast.makeText(agregarTarjeta.this, "Tarjeta guardada", Toast.LENGTH_LONG).show();
        onBackPressed();
    }
}
