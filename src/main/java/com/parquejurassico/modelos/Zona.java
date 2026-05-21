package com.parquejurassico.modelos;

public class Zona {

    private String nombre;
    private int capacidadMaxima;
    private int visitantesActuales;
    private boolean disponible;

    public Zona(String nombre, int capacidadMaxima,
                int visitantesActuales, boolean disponible) {

        this.nombre = nombre;
        this.capacidadMaxima = capacidadMaxima;
        this.visitantesActuales = visitantesActuales;
        this.disponible = disponible;
    }

    public void mostrarInformacion() {

        System.out.println("ZONA");
        System.out.println("Nombre: " + nombre);
        System.out.println("Capacidad máxima: " + capacidadMaxima);
        System.out.println("Visitantes actuales: " + visitantesActuales);
        System.out.println("Disponible: " + disponible);
    }

    public void ingresarTurista() {

        if (visitantesActuales < capacidadMaxima) {
            visitantesActuales++;
            System.out.println("Un turista ingresó a la zona");
        } else {

            System.out.println("La zona está llena");
        }
    }
}