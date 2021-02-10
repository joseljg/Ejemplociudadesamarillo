package com.example.ejemplociudades.tareas;

import com.example.ejemplociudades.clases.Ciudad;
import com.example.ejemplociudades.clases.Provincia;
import com.example.ejemplociudades.modelos.CiudadDB;
import com.example.ejemplociudades.modelos.ProvinciaDB;

import java.util.ArrayList;
import java.util.concurrent.Callable;

public class TareaObtenerCiudades implements Callable<ArrayList<Ciudad>> {

    @Override
    public ArrayList<Ciudad> call() throws Exception {
        ArrayList<Ciudad> ciudades= CiudadDB.obtenerCiudades();
        return ciudades;
    }
}
