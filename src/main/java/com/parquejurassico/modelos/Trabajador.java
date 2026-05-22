package com.parquejurassico.modelos; //clase que representa un trabajador en el parque jurasico

public class Trabajador extends Persona { //atributos del trabajador

    private String puesto;
    private double salario;
    private boolean disponible;

    public Trabajador(String nombre, int edad, String puesto, double salario, boolean disponible) { //constructor de la clase trabajador

        super(nombre, edad);

        this.puesto = puesto;
        this.salario = salario;
        this.disponible = disponible;
    }

    public void mostrarInformacion() { //metodo para mostrar la información del trabajador

        System.out.println("TRABAJADOR");

        mostrarInformacionBasica();

        System.out.println("Puesto: " + puesto);
        System.out.println("Salario: $" + salario);
        System.out.println("Disponible: " + disponible);
    }
}