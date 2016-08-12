package com.example.lucas.entregable;


import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentDetalle extends Fragment {




    TextView nombre;
    TextView precio;
    TextView vendedor;
    TextView descripcion;
    ImageView imagen;


    @Override
    public View onCreateView(LayoutInflater infladorDeLayouts, ViewGroup grupoActual, Bundle savedInstanceState) {

        View vistaADevolver;
        vistaADevolver = infladorDeLayouts.inflate(R.layout.fragment_detalle, grupoActual, false);

        Bundle paqueteRecibido;
        paqueteRecibido = getArguments();


        nombre =(TextView)vistaADevolver.findViewById(R.id.fragment_detalle_nombreProducto);

        precio =(TextView)vistaADevolver.findViewById(R.id.fragment_detalle_precioProducto);

        vendedor =(TextView)vistaADevolver.findViewById(R.id.fragment_detalle_vendedor);

        descripcion =(TextView)vistaADevolver.findViewById(R.id.fragment_detalle_descripcionProducto);

        imagen =(ImageView)vistaADevolver.findViewById(R.id.fragment_detalle_imagen);


        nombre.setText(paqueteRecibido.getString(ActivityDetalle.NOMBRE));
        precio.setText(paqueteRecibido.getString(ActivityDetalle.PRECIO));
        vendedor.setText(paqueteRecibido.getString(ActivityDetalle.VENDEDOR));
        descripcion.setText(paqueteRecibido.getString(ActivityDetalle.DESCRIPCION));
        imagen.setImageResource(paqueteRecibido.getInt(ActivityDetalle.IMAGEN));

        return vistaADevolver;



    }

}
