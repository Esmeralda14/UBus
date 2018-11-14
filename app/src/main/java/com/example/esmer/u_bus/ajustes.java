package com.example.esmer.u_bus;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.v4.graphics.drawable.RoundedBitmapDrawable;
import android.support.v4.graphics.drawable.RoundedBitmapDrawableFactory;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class ajustes extends AppCompatActivity {
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ajustes);
        setupActionBar();
        imageView= (ImageView) findViewById(R.id.fotoPerfil);
    }

    private void setupActionBar() {
        ActionBar action = getSupportActionBar();
        if (action != null) {
            action.setDisplayHomeAsUpEnabled(true);
            action.setTitle("Ajustes");

        }
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


    public void cambiarImagen(View view) {
        cargarImagen();
    }

    public void cambiarContra(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Ingresa tu nueva contraseña");

        // Set up the input
        final EditText input = new EditText(this);
        // Specify the type of input expected; this, for example, sets the input as a password, and will mask the text
        input.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_NORMAL);
        builder.setView(input);

        builder.setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(ajustes.this, "Contraseña actualizada", Toast.LENGTH_LONG).show();
            }
        });

        builder.create();
        builder.show();
    }

    public void mostrarAgregarTarjeta(View view) {
        Intent intent = new Intent(ajustes.this, agregarTarjeta.class);
        startActivity(intent);
    }

    public void verTarjetasGuardadas(View view) {
        Intent intent = new Intent(ajustes.this, tarjetasGuardadas.class);
        startActivity(intent);
    }

    public void subirCredencial(View view) {
        Intent intent = new Intent(ajustes.this, subirCredencial.class);
        startActivity(intent);

    }


}
