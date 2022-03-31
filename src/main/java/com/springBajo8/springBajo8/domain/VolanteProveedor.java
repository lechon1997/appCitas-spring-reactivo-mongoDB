package com.springBajo8.springBajo8.domain;

import com.springBajo8.springBajo8.values.InfoProductoProveedor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.util.List;

@Document(collection = "volantes")
public class VolanteProveedor {
    @Id
    private String identificacionProveedor;
    private String nombreProveedor;
    private LocalDate fecha;
    private List<Producto> productos;

    public VolanteProveedor(String identificacionProveedor, String nombreProveedor, LocalDate fecha, List<Producto> productos) {
        this.identificacionProveedor = identificacionProveedor;
        this.nombreProveedor = nombreProveedor;
        this.fecha = fecha;
        this.productos = productos;
    }

    public String getIdentificacionProveedor() {
        return identificacionProveedor;
    }

    public void setIdentificacionProveedor(String identificacionProveedor) {
        this.identificacionProveedor = identificacionProveedor;
    }

    public String getNombreProveedor() {
        return nombreProveedor;
    }

    public void setNombreProveedor(String nombreProveedor) {
        this.nombreProveedor = nombreProveedor;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }
}
