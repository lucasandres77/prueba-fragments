package com.example.lucas.entregable;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements FragmentListado.LLamadasDelFragment{

    FragmentManager unFragmentManager;
    FragmentTransaction unFragmentTransaction;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);




        FragmentListado unFragmentListado = new FragmentListado();

        unFragmentManager = getFragmentManager();

        unFragmentTransaction = unFragmentManager.beginTransaction();

        unFragmentTransaction.add(R.id.contenedor_De_Fragment_Listado, unFragmentListado);

        unFragmentTransaction.commit();

    }

    @Override
    public void recibirNotificaciones(Producto unProductoClickeado) {

        //Toast.makeText(this, unProductoClickeado.getNombreDeProducto(),Toast.LENGTH_LONG).show();


        Intent unIntent = new Intent(this, ActivityDetalle.class);

        Bundle unBundle = new Bundle();

        unBundle.putString(ActivityDetalle.NOMBRE, unProductoClickeado.getNombreDeProducto());
        unBundle.putString(ActivityDetalle.PRECIO, unProductoClickeado.getPrecioDelProducto().toString());
        unBundle.putString(ActivityDetalle.VENDEDOR, unProductoClickeado.getVendedor());
        unBundle.putString(ActivityDetalle.DESCRIPCION, unProductoClickeado.getDescripcionDelProducto());
        unBundle.putInt(ActivityDetalle.IMAGEN,unProductoClickeado.getIdImagen());

        unIntent.putExtras(unBundle);

        startActivity(unIntent);

    }

}
