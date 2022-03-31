package com.springBajo8.springBajo8.values;

public class InfoProductoProveedor {

    private final String nombreProducto;
    private final Integer cantidad;
    private final Double costoProducto;

    public InfoProductoProveedor(String nombreProducto, Integer cantidad, Double costoProducto) {
        this.nombreProducto = nombreProducto;
        this.cantidad = cantidad;
        this.costoProducto = costoProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public Double getCostoProducto() {
        return costoProducto;
    }
}
