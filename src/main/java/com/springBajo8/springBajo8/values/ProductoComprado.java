package com.springBajo8.springBajo8.values;

public class ProductoComprado {
    private final String id;
    private final String nombreProducto;
    private final Double precio;
    private final Integer cantidad;

    public ProductoComprado(String id, String nombreProducto, Double precio, Integer cantidad) {
        this.id = id;
        this.nombreProducto = nombreProducto;
        this.precio = precio;
        this.cantidad = cantidad;
    }


    public String getId() {
        return id;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public Double getPrecio() {
        return precio;
    }

    public Integer getCantidad() {
        return cantidad;
    }
}
