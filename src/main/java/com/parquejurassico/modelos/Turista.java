package com.parquejurassico.modelos;

public class Turista extends Persona {

    private String nacionalidad;
    private double dineroDisponible;
    private boolean tieneBoleto;


    public Turista(String nombre, int edad, String nacionalidad,
                   double dineroDisponible, boolean tieneBoleto) {

        super(nombre, edad);

        this.nacionalidad = nacionalidad;
        this.dineroDisponible = dineroDisponible;
        this.tieneBoleto = tieneBoleto;
    }

    public void mostrarInformacion() {

        System.out.println("TURISTA");

        mostrarInformacionBasica();

        System.out.println("Nacionalidad: " + nacionalidad);
        System.out.println("Dinero disponible: $" + dineroDisponible);
        System.out.println("Tiene boleto: " + tieneBoleto);
    }
}