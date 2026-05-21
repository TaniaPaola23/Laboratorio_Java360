package com.parquejurassico.modelos;

public class Trabajador extends Persona {

    private String puesto;
    private double salario;
    private boolean disponible;

    public Trabajador(String nombre, int edad, String puesto,
                      double salario, boolean disponible) {

        super(nombre, edad);

        this.puesto = puesto;
        this.salario = salario;
        this.disponible = disponible;
    }

    public void mostrarInformacion() {

        System.out.println("TRABAJADOR");

        mostrarInformacionBasica();

        System.out.println("Puesto: " + puesto);
        System.out.println("Salario: $" + salario);
        System.out.println("Disponible: " + disponible);
    }
}