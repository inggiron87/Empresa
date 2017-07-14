package com.renato;

import com.sun.org.apache.regexp.internal.RE;
import com.renato.Empresa;
import com.renato.Empleado;
import com.renato.Automovil;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
	// write your code here

        Scanner sn = new Scanner(System.in);

        Empresa empresas = new Empresa();

        empresas.setEmpresa("Toyota");
        empresas.setDireccion("Zona 5");
        empresas.setCantEmpleados(10);
        empresas.setFechaCreacion("01/01/1970");
        empresas.setAreaEspecialidad("Todo Terreno");

        /*
        System.out.println("Nombre Empresa: ");
        empresas.setEmpresa(sn.next());
        System.out.println("Dirección ");
        empresas.setDireccion(sn.next());
        System.out.println("Cantidad de empleados ");
        empresas.setCantEmpleados(Integer.parseInt(sn.next()));
        System.out.println("Fecha creación: ");
        empresas.setFechaCreacion(sn.next());
        System.out.println("Área especialidad: ");
        empresas.setFechaCreacion(sn.next());
*/

        Automovil automovil = new Automovil();
        automovil.setMarca("Mazda");
        automovil.setAnnoFabricacion("01/01/2015");
        automovil.setModelo("2015");
        automovil.setPrecio(150000);
        empresas.agregarAutomovil(automovil);

        Automovil automovil2 = new Automovil();
        automovil2.setMarca("Toyota");
        automovil2.setAnnoFabricacion("01/01/2015");
        automovil2.setModelo("2015");
        automovil2.setPrecio(180000);
        empresas.agregarAutomovil(automovil2);



        //empleados

        Empleado empleado = new Empleado();
        empleado.setEmpleado("Renato");
        empleado.setEdad(30);
        empleado.setAnnosExperiencia(12);
        empleado.setCargo("Director");
        empresas.agregarEmpleado(empleado);

        Empleado empleado2 = new Empleado();
        empleado2.setEmpleado("Esteban");
        empleado2.setEdad(28);
        empleado2.setAnnosExperiencia(9);
        empleado2.setCargo("Vendedor");
        empresas.agregarEmpleado(empleado2);

        //System.out.println(automovil.getMarca());

        System.out.println("El precio de los automoviles Toyota son: " + "Q. " + automovil.getPrecio()
                                                                       + "\n Q. " + automovil2.getPrecio());

        float resultado;
        resultado = (empleado.getEdad() + empleado2.getEdad())/2;

        //System.out.println(empleado.getEdad());
        //System.out.println(empleado2.getEdad());

        System.out.println("\nEl promedio de edad de los empleados es: \n" + resultado);

    }
}
