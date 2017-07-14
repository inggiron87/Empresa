package com.renato;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by alumno on 13/07/2017.
 */
public class Automovil {

    private String marca;
    private String annoFabricacion;
    private String modelo;
    private float precio;

    public Automovil(String marca, String annoFabricacion, String modelo, float precio) {
        this.marca = marca;
        this.annoFabricacion = annoFabricacion;
        this.modelo = modelo;
        this.precio = precio;

    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getAnnoFabricacion() {
        return annoFabricacion;
    }

    public void setAnnoFabricacion(String annoFabricacion) {
        this.annoFabricacion = annoFabricacion;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public Automovil(){

    }


}
