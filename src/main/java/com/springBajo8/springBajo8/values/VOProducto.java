package com.springBajo8.springBajo8.values;

public class VOProducto {
    private String nombre;
    private Double precio;
    private Integer minimo;
    private Integer cantidad;

    public VOProducto(String nombre, Double precio, Integer minimo,Integer cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.minimo = minimo;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Integer getMinimo() {
        return minimo;
    }

    public void setMinimo(Integer minimo) {
        this.minimo = minimo;
    }
}
