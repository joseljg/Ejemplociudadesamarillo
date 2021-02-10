package com.example.ejemplociudades;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.SyncStatusObserver;
import android.os.Bundle;
import android.widget.Toast;

import com.example.ejemplociudades.clases.Ciudad;
import com.example.ejemplociudades.clases.ListaCiudadesAdapter;
import com.example.ejemplociudades.controladores.CiudadesController;

import java.util.ArrayList;

public class MostrarCiudadesActivity extends AppCompatActivity {

    RecyclerView rv_ciudades;
    ArrayList<Ciudad> ciudades;
    ListaCiudadesAdapter mAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostrar_ciudades);
        rv_ciudades = findViewById(R.id.rv_ciudades);
        ciudades = CiudadesController.obtenerCiudades();
        if(ciudades != null)
        {
            for(Ciudad c: ciudades)
            {
                System.out.println(c.toString());
            }
            mAdapter = new ListaCiudadesAdapter(this, ciudades);
            rv_ciudades.setAdapter(mAdapter);
            rv_ciudades.setLayoutManager(new LinearLayoutManager(this));

        }
        else{
            Toast.makeText(this, "no pude recuperar las ciudades ", Toast.LENGTH_SHORT).show();
        }
    }
}