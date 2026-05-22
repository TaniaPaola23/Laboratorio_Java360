package com.parquejurassico.modelos; //clase que representa un dinosaurio en el parque jurasico

public class Dinosaurio { //atributos del dinosaurio

    private String nombre;
    private String especie;
    private String tipo;
    private int edad;
    private boolean peligroso;

    public Dinosaurio(String nombre, String especie, String tipo, int edad, boolean peligroso) { //constructor de la clase dinosaurio

        this.nombre = nombre;
        this.especie = especie;
        this.tipo = tipo;
        this.edad = edad;
        this.peligroso = peligroso;
    }

    public void mostrarInformacion() { //metodo para mostrar la información del dinosaurio

        System.out.println("DINOSAURIO");
        System.out.println("Nombre: " + nombre);
        System.out.println("Especie: " + especie);
        System.out.println("Tipo: " + tipo);
        System.out.println("Edad: " + edad);
        System.out.println("Peligroso: " + peligroso);
    }

    public String getNombre() {
        return nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public String getTipo() {
        return tipo;
    }

    public int getEdad() {
        return edad;
    }

    public boolean isPeligroso() {
        return peligroso;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setPeligroso(boolean peligroso) {
        this.peligroso = peligroso;
    }
}