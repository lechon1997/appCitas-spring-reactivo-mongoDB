package com.springBajo8.springBajo8.domain;

import com.springBajo8.springBajo8.values.ProductoComprado;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.util.List;

@Document(collection = "facturas")
public class Factura {
    @Id
    private String id;
    private LocalDate fecha;
    private String nombreCliente;
    private String nombreUsuario;
    private List<ProductoComprado> productoComprados;
    private Double precioFinal;

    public Factura(LocalDate fecha, String nombreCliente, String nombreUsuario, List<ProductoComprado> productoComprados) {
        this.fecha = fecha;
        this.nombreCliente = nombreCliente;
        this.nombreUsuario = nombreUsuario;
        this.productoComprados = productoComprados;
        this.precioFinal = calcularPrecioFinal(productoComprados); //con parametro es reutilizable en otro contexto
    }

    private Double calcularPrecioFinal(List<ProductoComprado> productoComprados){
        return productoComprados.stream().map(p -> p.getPrecio()).reduce(Double.valueOf(0), Double::sum);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public List<ProductoComprado> getProductoComprados() {
        return productoComprados;
    }

    public void setProductoComprados(List<ProductoComprado> productoComprados) {
        this.productoComprados = productoComprados;
    }

    public Double getPrecioFinal() {
        return precioFinal;
    }

    public void setPrecioFinal(Double precioFinal) {
        this.precioFinal = precioFinal;
    }
}
