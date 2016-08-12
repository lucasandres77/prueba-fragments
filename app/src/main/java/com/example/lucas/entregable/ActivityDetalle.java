package com.example.lucas.entregable;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ActivityDetalle extends AppCompatActivity  {

    public static final String NOMBRE = "nombre";
    public static final String PRECIO = "precio";
    public static final String VENDEDOR = "vendedor";
    public static final String DESCRIPCION = "descripcion";
    public static final String IMAGEN = "imagen";

    FragmentManager unFragmentManager;
    FragmentTransaction unFragmentTransaction;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle);


        FragmentDetalle unFragmentDetalle = new FragmentDetalle();

        Intent unIntent = getIntent();

        Bundle unBundle = unIntent.getExtras();

        unFragmentDetalle.setArguments(unBundle);


        unFragmentManager = getFragmentManager();

        unFragmentTransaction = unFragmentManager.beginTransaction();

        unFragmentTransaction.add(R.id.contenedor_De_Fragment_Detalle, unFragmentDetalle);

        unFragmentTransaction.commit();








    }
}
