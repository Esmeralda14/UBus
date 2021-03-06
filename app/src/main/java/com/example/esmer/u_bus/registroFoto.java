package com.example.esmer.u_bus;

import android.content.Intent;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class registroFoto extends AppCompatActivity {
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_foto);
        imageView= (ImageView) findViewById(R.id.fotoRegistro);
    }

    public void mostrarInicioSesion(View view) {
        Intent intent = new Intent(registroFoto.this, InicioSesion.class);
        startActivity(intent);

    }

    public void subirFoto(View view) {
    cargarImagen();
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
