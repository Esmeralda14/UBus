package com.example.esmer.u_bus;

import android.content.Intent;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class subirCredencial extends AppCompatActivity {
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subir_credencial);
        imageView= (ImageView) findViewById(R.id.fotoCredencial);
        setupActionBar();
    }

    private void setupActionBar() {
        ActionBar action = getSupportActionBar();
        if (action != null) {
            action.setDisplayHomeAsUpEnabled(true);
            action.setTitle("Credencial");

        }
    }

    public void subirFoto(View view) {
        cargarImagen();
    }

    public void guardarFoto(View view) {
        onBackPressed();
        Toast.makeText(subirCredencial.this, "Foto guardada", Toast.LENGTH_LONG).show();
    }

    private void cargarImagen() {
        Intent intent=new Intent(Intent.ACTION_GET_CONTENT, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
        intent.setType("image/");
        startActivityForResult(intent.createChooser(intent,"Seleccione la Aplicación"),10);


    }

    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode==RESULT_OK){
            Uri miPath = data.getData();
            imageView.setImageURI(miPath);
        }
    }

}
