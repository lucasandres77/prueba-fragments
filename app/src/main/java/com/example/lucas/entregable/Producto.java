package com.example.lucas.entregable;

/**
 * Created by Lucas on 5/19/16.
 */
public class Producto {
    private String nombreDeProducto;
    private Integer precioDelProducto;
    private String descripcionDelProducto;
    private String vendedor;
    private int IdImagen;


    public Producto(String nombreDeProducto, Integer precioDelProducto, String descripcionDelProducto, String vendedor, int idImagen) {
        this.nombreDeProducto = nombreDeProducto;
        this.precioDelProducto = precioDelProducto;
        this.descripcionDelProducto = descripcionDelProducto;
        this.vendedor = vendedor;
        this.IdImagen = idImagen;
    }

    public String getNombreDeProducto() {
        return nombreDeProducto;
    }

    public void setNombreDeProducto(String nombreDeProducto) {
        this.nombreDeProducto = nombreDeProducto;
    }

    public Integer getPrecioDelProducto() {
        return precioDelProducto;
    }

    public void setPrecioDelProducto(Integer precioDelProducto) {
        this.precioDelProducto = precioDelProducto;
    }

    public String getDescripcionDelProducto() {
        return descripcionDelProducto;
    }

    public void setDescripcionDelProducto(String descripcionDelProducto) {
        this.descripcionDelProducto = descripcionDelProducto;
    }

    public String getVendedor() {
        return vendedor;
    }

    public void setVendedor(String vendedor) {
        this.vendedor = vendedor;
    }

    public int getIdImagen() {
        return IdImagen;
    }

    public void setIdImagen(int idImagen) {
        IdImagen = idImagen;
    }
}
