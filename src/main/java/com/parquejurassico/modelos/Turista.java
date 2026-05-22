package com.parquejurassico.modelos; //clase que representa a un turista en el parque jurasico

public class Turista extends Persona { //atributos del turista

    private String nacionalidad;
    private double dineroDisponible;
    private boolean tieneBoleto;


    public Turista(String nombre, int edad, String nacionalidad, double dineroDisponible, boolean tieneBoleto) { //constructor de la clase turista

        super(nombre, edad);

        this.nacionalidad = nacionalidad;
        this.dineroDisponible = dineroDisponible;
        this.tieneBoleto = tieneBoleto;
    }

    public void mostrarInformacion() { //metodo para mostrar la información del turista

        System.out.println("TURISTA");

        mostrarInformacionBasica();

        System.out.println("Nacionalidad: " + nacionalidad);
        System.out.println("Dinero disponible: $" + dineroDisponible);
        System.out.println("Tiene boleto: " + tieneBoleto);
    }
}