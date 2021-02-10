package com.example.ejemplociudades;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.ejemplociudades.clases.Ciudad;
import com.example.ejemplociudades.controladores.CiudadesController;

import java.util.ArrayList;

public class MostrarCiudadesActivity extends AppCompatActivity {

    RecyclerView rv_ciudades;
    ArrayList<Ciudad> ciudades;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostrar_ciudades);
        rv_ciudades = findViewById(R.id.rv_ciudades);
        ciudades = CiudadesController.obtenerCiudades();
        if(ciudades != null)
        {
            // aqui se crea el recyclerView
        }
    }
}