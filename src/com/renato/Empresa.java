package com.renato;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by alumno on 13/07/2017.
 */
public class Empresa {

    private String empresa;
    private String direccion;
    private int cantEmpleados;
    private String fechaCreacion;
    private String areaEspecialidad;

    private List<Automovil> automoviles;
    private List<Empleado> empleados;

    public Empresa(String empresa, String direccion, int cantEmpleados, String fechaCreacion, String areaEspecialidad) {
        this.empresa = empresa;
        this.direccion = direccion;
        this.cantEmpleados = cantEmpleados;
        this.fechaCreacion = fechaCreacion;
        this.areaEspecialidad = areaEspecialidad;
        this.automoviles = new ArrayList<>();
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCantEmpleados() {
        return cantEmpleados;
    }

    public void setCantEmpleados(int cantEmpleados) {
        this.cantEmpleados = cantEmpleados;
    }

    public String getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(String fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getAreaEspecialidad() {
        return areaEspecialidad;
    }

    public void setAreaEspecialidad(String areaEspecialidad) {
        this.areaEspecialidad = areaEspecialidad;
    }

    public List<Automovil> getAutomoviles() {
        return automoviles;
    }

    public void setAutomoviles(List<Automovil> automoviles) {
        this.automoviles = automoviles;
    }

    public Empresa(){
        automoviles = new ArrayList<>();
        empleados = new ArrayList<>();
    }

    public void agregarAutomovil(Automovil a){
        automoviles.add(a);
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(List<Empleado> empleados) {
        this.empleados = empleados;
    }

    public void agregarEmpleado(Empleado e){
        empleados.add(e);
    }



}
