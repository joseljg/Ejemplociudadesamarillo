package com.example.ejemplociudades.clases;

import android.content.Intent;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ejemplociudades.DetallesCiudadActivity;
import com.example.ejemplociudades.R;

public class CiudadesViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
    public static final String EXTRA_OBJETO_CIUDAD = "com.example.ejemplociudadesamarillo.objetociudad";
    public TextView txt_rv_nombrec;
    public TextView txt_rv_habitantes;
    public TextView txt_rv_provincia;
    public ListaCiudadesAdapter lcAdapter;

    public CiudadesViewHolder(@NonNull View itemView, ListaCiudadesAdapter listaCiudadesAdapter) {
        super(itemView);
        txt_rv_nombrec = (TextView) itemView.findViewById(R.id.txt_rv_nombrec);
        txt_rv_habitantes = (TextView) itemView.findViewById(R.id.txt_rv_habitantes);
        txt_rv_provincia = (TextView) itemView.findViewById(R.id.txt_rv_provincia);
        lcAdapter = listaCiudadesAdapter;
        itemView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int mPosition = getLayoutPosition();
        Ciudad ciudad = this.lcAdapter.getListaCiudades().get(mPosition);
        //---------------------------------------------------------------
        Intent intent = new Intent(lcAdapter.getC(), DetallesCiudadActivity.class);
        intent.putExtra(EXTRA_OBJETO_CIUDAD, ciudad);
        lcAdapter.getC().startActivity(intent);
    }
}
