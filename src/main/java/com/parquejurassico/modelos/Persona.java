package com.parquejurassico.modelos; //clase que representa una persona en el parque jurasico

public class Persona { //atributos de la persona

    protected String nombre;
    protected int edad;

    public Persona(String nombre, int edad) { //constructor de la clase persona

        this.nombre = nombre;
        this.edad = edad;
    }

    public void mostrarInformacionBasica() { //metodo para mostrar la información de la persona

        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }
}