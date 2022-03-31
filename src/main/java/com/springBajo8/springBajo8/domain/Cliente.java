package com.springBajo8.springBajo8.domain;

import org.springframework.data.annotation.Id;

public class Cliente {
    @Id
    private String documentoIdentificacion;
    private String nombre;
    private String celular;

    public Cliente(String documentoIdentificacion, String nombre, String celular) {
        this.documentoIdentificacion = documentoIdentificacion;
        this.nombre = nombre;
        this.celular = celular;
    }

    public String getDocumentoIdentificacion() {
        return documentoIdentificacion;
    }

    public void setDocumentoIdentificacion(String documentoIdentificacion) {
        this.documentoIdentificacion = documentoIdentificacion;
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
