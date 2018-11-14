package com.example.esmer.u_bus;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class drawerMenu extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drawer_menu);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        navigationView.setBackgroundColor(getResources().getColor(R.color.blanco));
        navigationView.setItemTextColor(ColorStateList.valueOf(getResources().getColor(R.color.negro)));
        navigationView.setItemIconTintList(ColorStateList.valueOf(getResources().getColor(R.color.negro)));
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.drawer_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();


        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_rutas) {
        } else if (id == R.id.nav_rutas) {

        } else if (id == R.id.nav_mapa) {
            mostrarMapaTR();
        } else if (id == R.id.nav_decuentos) {
            mostrarDescuentos();
        } else if (id == R.id.nav_ajustes) {
            mostrarAjustes();
        } else if (id == R.id.nav_emergencia) {
            mostrarNumeros();
        }else if (id == R.id.nav_compra) {
            comprarBoleto();
        }else if (id == R.id.nav_acercaDe) {
            mostrarAcercaDe();
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    public void mostrarCamion(View vista) {
        Intent intent = new Intent(drawerMenu.this, imagenCamion.class);
        startActivity(intent);
    }

    public void mostrarRuta(View vista) {
        Intent intent = new Intent(drawerMenu.this, mapaRuta.class);
        startActivity(intent);
    }
    public void mostrarMapaTR() {
        Intent intent = new Intent(drawerMenu.this, mapaTiempoReal.class);
        startActivity(intent);
    }

    public void comprarBoleto() {
        Intent intent = new Intent(drawerMenu.this, compraBoleto.class);
        startActivity(intent);
    }

    public void mostrarAjustes() {
        Intent intent = new Intent(drawerMenu.this, ajustes.class);
        startActivity(intent);
    }

    public void mostrarDescuentos() {
        Intent intent = new Intent(drawerMenu.this, descuentos.class);
        startActivity(intent);

    }
    public void mostrarAcercaDe(){
        Intent intent = new Intent(drawerMenu.this, acercaDe.class);
        startActivity(intent);
    }

    public void mostrarNumeros() {
        Intent intent = new Intent(drawerMenu.this, emergencia.class);
        startActivity(intent);

    }

}
