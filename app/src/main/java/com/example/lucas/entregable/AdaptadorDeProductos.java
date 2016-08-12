package com.example.lucas.entregable;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Lucas on 5/19/16.
 */
public class AdaptadorDeProductos extends BaseAdapter {

    Context contextoAdaptador;
    ArrayList<Producto> arrProductos;

    public AdaptadorDeProductos(Context contextoAdaptador, ArrayList<Producto> arrProductos) {
        this.contextoAdaptador = contextoAdaptador;
        this.arrProductos = arrProductos;
    }

    @Override
    public int getCount() {
        return arrProductos.size();
    }

    @Override
    public Producto getItem(int position) {
        return arrProductos.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int posicionActual, View vistaActual, ViewGroup grupoActual) {

        LayoutInflater unInflador = (LayoutInflater) contextoAdaptador.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        vistaActual = unInflador.inflate(R.layout.fragment_listado_detalle, grupoActual, false);

        Producto productoActual;
        productoActual = getItem(posicionActual);

        ImageView unImageview;
        unImageview = (ImageView)vistaActual.findViewById(R.id.fragment_listado_detalle_imagen);

        TextView txtNombre;
        txtNombre = (TextView)vistaActual.findViewById(R.id.fragment_listado_detalle_nombre_producto);

        TextView txtPrecio;
        txtPrecio = (TextView)vistaActual.findViewById(R.id.fragment_listado_detalle_precio);

        unImageview.setImageResource(productoActual.getIdImagen());

        txtNombre.setText(productoActual.getNombreDeProducto());

        txtPrecio.setText(productoActual.getPrecioDelProducto().toString());

        return vistaActual;


    }
}
