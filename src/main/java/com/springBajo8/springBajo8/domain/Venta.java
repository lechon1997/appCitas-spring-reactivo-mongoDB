package com.springBajo8.springBajo8.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "ventas")
public class Venta {
    @Id
    private String id;
    private Cliente cliente;
    private List<Producto> productos;
    private Double total;

    public Venta(Cliente cliente, List<Producto> productos, Double total) {
        this.cliente = cliente;
        this.productos = productos;
        this.total = total;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Double calcularTotal(List<Producto> productosVendidos){
        return productosVendidos.stream().map(p -> p.getPrecio()).reduce(Double.valueOf(0), Double::sum);
    }
}
