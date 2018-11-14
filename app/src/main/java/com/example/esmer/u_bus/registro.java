package com.example.esmer.u_bus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class registro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);
    }

    public void mostrarSiguiente(View view) {
        Intent intent = new Intent(registro.this, registroFoto.class);
        startActivity(intent);
    }
}
