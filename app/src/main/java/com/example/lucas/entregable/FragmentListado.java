package com.example.lucas.entregable;


import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentListado extends Fragment {

    ArrayList<Producto> arrProductos;
    LLamadasDelFragment activityQueContieneElFragment;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View unaView = inflater.inflate(R.layout.fragment_listado, container, false);

        arrProductos = new ArrayList<Producto>();

        llenarlistaProductos();

        ListView unListView = (ListView) unaView.findViewById(R.id.lista_Productos_ListView);

        AdaptadorDeProductos unAdaptadorDeProductos = new AdaptadorDeProductos(unaView.getContext(), arrProductos);

        unListView.setAdapter(unAdaptadorDeProductos);

        ListenerDeProductos unListenerDeProductos = new ListenerDeProductos();

        unListView.setOnItemClickListener(unListenerDeProductos);

        return unaView;


    }


    public void llenarlistaProductos() {
        arrProductos.add(new Producto("Camara Kodak", 5000, "camaa de fotos", "Juan Pedro", R.drawable.camara_kodak));
        arrProductos.add(new Producto("Computadora Asus", 15000, "computadora", "Juan Pedro", R.drawable.computadora_asus));
        arrProductos.add(new Producto("Cuchcillo usado", 35000, "cuchillo usado en asesinato", "Lucas", R.drawable.cuchillo_usado));
        arrProductos.add(new Producto("Ford Fiesta", 190900, "auto con kinetic design", "Juan Francisco", R.drawable.ford_fiesta));
        arrProductos.add(new Producto("Libro android", 500, "libro sumamente necesario para el curso", "Martin Palermo", R.drawable.libro_android));
        arrProductos.add(new Producto("Libro Clean Code", 389, "libro para leer", "Diego Armando", R.drawable.libro_clean_code));
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        activityQueContieneElFragment = (LLamadasDelFragment) activity;
    }

    public interface LLamadasDelFragment {

        public void recibirNotificaciones(Producto unProductoClickeado);
    }

    private class ListenerDeProductos implements AdapterView.OnItemClickListener {

        @Override
        public void onItemClick(AdapterView<?> adapaterQueMeLLamo, View view, int position, long id) {

            Producto unProductoClickeado = (Producto) adapaterQueMeLLamo.getItemAtPosition(position);


            activityQueContieneElFragment.recibirNotificaciones(unProductoClickeado);
        }

    }

}