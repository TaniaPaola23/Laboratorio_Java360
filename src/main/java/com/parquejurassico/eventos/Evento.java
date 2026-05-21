package com.parquejurassico.eventos;

public class Evento {

    private String nombre;
    private String descripcion;
    private String nivelRiesgo;

    public Evento(String nombre, String descripcion,
                  String nivelRiesgo) {

        this.nombre = nombre;
        this.descripcion = descripcion;
        this.nivelRiesgo = nivelRiesgo;
    }

    public void mostrarEvento() {

        System.out.println("EVENTO");
        System.out.println("Nombre: " + nombre);
        System.out.println("Descripción: " + descripcion);
        System.out.println("Nivel de riesgo: " + nivelRiesgo);
    }
}