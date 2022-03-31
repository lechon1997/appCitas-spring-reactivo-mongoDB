package com.springBajo8.springBajo8.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "proveedores")
public class Proveedor {
    @Id
    private String identifiacionProveedor;
    private String nombre;
    private String celular;

    public Proveedor(String identifiacionProveedor, String nombre, String celular) {
        this.identifiacionProveedor = identifiacionProveedor;
        this.nombre = nombre;
        this.celular = celular;
    }

    public String getIdentifiacionProveedor() {
        return identifiacionProveedor;
    }

    public void setIdentifiacionProveedor(String identifiacionProveedor) {
        this.identifiacionProveedor = identifiacionProveedor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }
}


