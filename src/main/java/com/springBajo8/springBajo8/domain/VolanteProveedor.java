package com.springBajo8.springBajo8.domain;

import com.springBajo8.springBajo8.values.InfoProductoProveedor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.util.List;

@Document(collection = "volantes")
public class VolanteProveedor {
    @Id
    private String Id;
    private List<InfoProductoProveedor> productos;
    private LocalDate fecha;
    private String documentoProveedor;

    public VolanteProveedor(List<InfoProductoProveedor> productos, LocalDate fecha, String documentoProveedor) {
        this.productos = productos;
        this.fecha = fecha;
        this.documentoProveedor = documentoProveedor;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public List<InfoProductoProveedor> getProductos() {
        return productos;
    }

    public void setProductos(List<InfoProductoProveedor> productos) {
        this.productos = productos;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getDocumentoProveedor() {
        return documentoProveedor;
    }

    public void setDocumentoProveedor(String documentoProveedor) {
        this.documentoProveedor = documentoProveedor;
    }
}
