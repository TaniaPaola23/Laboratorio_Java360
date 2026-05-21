package com.parquejurassico.modelos;

public class Persona {

    protected String nombre;
    protected int edad;

    public Persona(String nombre, int edad) {

        this.nombre = nombre;
        this.edad = edad;
    }

    public void mostrarInformacionBasica() {

        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }
}