package com.example.ejemplociudades;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.example.ejemplociudades.clases.Ciudad;
import com.example.ejemplociudades.clases.CiudadesViewHolder;

public class DetallesCiudadActivity extends AppCompatActivity {

    TextView txt_detalles_nombrec;
    TextView txt_detalles_habitantes;
    TextView txt_detalles_idprovincia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalles_ciudad);
        txt_detalles_nombrec = (TextView) findViewById(R.id.txt_detalles_nombrec);
        txt_detalles_habitantes = (TextView) findViewById(R.id.txt_detalles_habitantes);
        txt_detalles_idprovincia =(TextView) findViewById(R.id.txt_detalles_provincia);
        Intent intent = getIntent();
        if(intent != null)
        {
            Ciudad c = (Ciudad) intent.getSerializableExtra(CiudadesViewHolder.EXTRA_OBJETO_CIUDAD);
            txt_detalles_nombrec.setText(c.getNombre());
            txt_detalles_habitantes.setText(String.valueOf(c.getHabitantes()));
            txt_detalles_idprovincia.setText(String.valueOf(c.getIdprovincia()));

        }
    }
}