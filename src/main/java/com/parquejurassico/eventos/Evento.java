package com.parquejurassico.eventos; //clase que representa un evento en el parque jurásico

public class Evento {
//atributos del evento
    private String nombre;
    private String descripcion;
    private String nivelRiesgo;

    public Evento(String nombre, String descripcion,String nivelRiesgo) { //constructor de la clase evento

        this.nombre = nombre;
        this.descripcion = descripcion;
        this.nivelRiesgo = nivelRiesgo;
    }

    public void mostrarEvento() { //metodo para mostrar la información del evento

        System.out.println("EVENTO");
        System.out.println("Nombre: " + nombre);
        System.out.println("Descripción: " + descripcion);
        System.out.println("Nivel de riesgo: " + nivelRiesgo);
    }
}