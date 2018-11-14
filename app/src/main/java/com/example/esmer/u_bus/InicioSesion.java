package com.example.esmer.u_bus;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.content.Intent;
import android.view.View;
public class InicioSesion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio_sesion);
    }

    public void BotonAceptar(View vista) {
        Intent intent = new Intent(InicioSesion.this, drawerMenu.class);
        startActivity(intent);
    }

    public void mostrarRegistro(View view) {
        Intent intent = new Intent(InicioSesion.this, registro.class);
        startActivity(intent);
    }
}
