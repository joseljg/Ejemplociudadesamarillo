package com.example.ejemplociudades.clases;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ejemplociudades.R;

import java.util.ArrayList;

public class ListaCiudadesAdapter extends RecyclerView.Adapter<CiudadesViewHolder> {

    private Context c;
    private ArrayList<Ciudad> listaCiudades;
    private LayoutInflater mInflater;

    public ListaCiudadesAdapter(Context c, ArrayList<Ciudad> listaCiudades) {
        this.c = c;
        this.listaCiudades = listaCiudades;
        mInflater = LayoutInflater.from(c);
    }

    public Context getC() {
        return c;
    }

    public void setC(Context c) {
        this.c = c;
    }

    public ArrayList<Ciudad> getListaCiudades() {
        return listaCiudades;
    }

    public void setListaCiudades(ArrayList<Ciudad> listaCiudades) {
        this.listaCiudades = listaCiudades;
    }

    public LayoutInflater getmInflater() {
        return mInflater;
    }

    public void setmInflater(LayoutInflater mInflater) {
        this.mInflater = mInflater;
    }

    @NonNull
    @Override
    public CiudadesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View mItemView = mInflater.inflate(R.layout.item_rv_ciudades, parent, false);
        return new CiudadesViewHolder(mItemView, this);
    }

    @Override
    public void onBindViewHolder(@NonNull CiudadesViewHolder holder, int position) {
        Ciudad ciudadActual = listaCiudades.get(position);
        holder.txt_rv_nombrec.setText("Ciudad: " + ciudadActual.getNombre());
        holder.txt_rv_habitantes.setText(String.valueOf("habitantes: " + ciudadActual.getHabitantes()));
        holder.txt_rv_provincia.setText(String.valueOf("idprovincia: " + ciudadActual.getIdprovincia()));
    }

    @Override
    public int getItemCount() {
        return listaCiudades.size();
    }
}
