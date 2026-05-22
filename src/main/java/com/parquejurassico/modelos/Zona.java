package com.parquejurassico.modelos; //clase que representa una zona en el parque jurasico

public class Zona { //atributos de la zona

    private String nombre;
    private int capacidadMaxima;
    private int visitantesActuales;
    private boolean disponible;

    public Zona(String nombre, int capacidadMaxima, int visitantesActuales, boolean disponible) { //constructor de la clase zona

        this.nombre = nombre;
        this.capacidadMaxima = capacidadMaxima;
        this.visitantesActuales = visitantesActuales;
        this.disponible = disponible;
    }

    public void mostrarInformacion() { //metodo para mostrar la información de la zona

        System.out.println("ZONA");
        System.out.println("Nombre: " + nombre);
        System.out.println("Capacidad máxima: " + capacidadMaxima);
        System.out.println("Visitantes actuales: " + visitantesActuales);
        System.out.println("Disponible: " + disponible);
    }

    public void ingresarTurista() { //metodo para ingresar un turista a la zona

        if (visitantesActuales < capacidadMaxima) {
            visitantesActuales++;
            System.out.println("Un turista ingresó a la zona");
        } else {

            System.out.println("La zona está llena");
        }
    }
}