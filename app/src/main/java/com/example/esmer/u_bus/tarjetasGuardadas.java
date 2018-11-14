package com.example.esmer.u_bus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class tarjetasGuardadas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tarjetas_guardadas);
    }

    public void eliminarTarjeta(View view) {
        Toast.makeText(tarjetasGuardadas.this, "Tarjeta guardada", Toast.LENGTH_LONG).show();
    }

    public void mostrarEditarTarjeta(View view) {
        Intent intent = new Intent(tarjetasGuardadas.this, editarTarjeta.class);
        startActivity(intent);
    }
}
