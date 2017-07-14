package com.renato;

/**
 * Created by alumno on 13/07/2017.
 */
public class Empleado {

    private String empleado;
    private int edad;
    private int annosExperiencia;
    private String cargo;

    public Empleado(String empleado, int edad, int annosExperiencia, String cargo) {
        this.empleado = empleado;
        this.edad = edad;
        this.annosExperiencia = annosExperiencia;
        this.cargo = cargo;
    }

    public String getEmpleado() {
        return empleado;
    }

    public void setEmpleado(String empleado) {
        this.empleado = empleado;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getAnnosExperiencia() {
        return annosExperiencia;
    }

    public void setAnnosExperiencia(int annosExperiencia) {
        this.annosExperiencia = annosExperiencia;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Empleado(){

    }


}
