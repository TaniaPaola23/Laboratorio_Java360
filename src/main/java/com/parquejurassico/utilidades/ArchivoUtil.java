package com.parquejurassico.utilidades;

import java.io.FileWriter;
import java.io.IOException;

public class ArchivoUtil {

    public static void guardarIngreso(String informacion) {

        try {

            FileWriter writer = new FileWriter("ingresos.csv", true);
            writer.write(informacion + "\n");
            writer.close();
            System.out.println("Ingreso guardado correctamente");

        } catch (IOException e) {

            System.out.println("Error al guardar archivo: " + e.getMessage());
        }
    }

    public static void guardarEvento(String evento) {

        try {

            FileWriter writer = new FileWriter("eventos.csv", true);
            writer.write(evento + "\n");
            writer.close();
            System.out.println("Evento guardado correctamente");

        } catch (IOException e) {

            System.out.println("Error al guardar evento: " + e.getMessage());
        }
    }
}