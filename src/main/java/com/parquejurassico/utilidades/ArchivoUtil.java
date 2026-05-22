package com.parquejurassico.utilidades; //clase de utilidad para manejo de archivos en el parque jurasico

import com.parquejurassico.modelos.Dinosaurio;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ArchivoUtil { //clase de utilidad para manejo de archivos en el parque jurasico

    public static void guardarIngreso(String informacion) { //metodo para guardar ingresos al parque en un archivo csv

        try {

            FileWriter writer = new FileWriter("ingresos.csv", true);

            writer.write(informacion + "\n");

            writer.close();

            System.out.println("Ingreso guardado correctamente");

        } catch (IOException e) {

            System.out.println("Error al guardar archivo: " + e.getMessage());
        }
    }

    public static void guardarEvento(String evento) { //metodo para guardar eventos del parque en un archivo csv

        try {

            FileWriter writer = new FileWriter("eventos.csv", true); //se abre el archivo en modo append para no sobrescribir los eventos anteriores

            writer.write(evento + "\n");

            writer.close();

            System.out.println("Evento guardado correctamente");

        } catch (IOException e) {

            System.out.println("Error al guardar evento: " + e.getMessage());
        }
    }

    public static void guardarDinosaurio(Dinosaurio dinosaurio) { //metodo para guardar dinosaurios en un archivo csv

        try {

            FileWriter writer = new FileWriter("dinosaurios.csv", true); //se abre el archivo en modo append para no sobrescribir los dinosaurios anteriores

            writer.write
                            (dinosaurio.getNombre()
                            + ","
                            + dinosaurio.getEspecie()
                            + ","
                            + dinosaurio.getTipo()
                            + ","
                            + dinosaurio.getEdad()
                            + ","
                            + dinosaurio.isPeligroso()
                            + "\n"
            );

            writer.close();

            System.out.println("Dinosaurio guardado correctamente");

        } catch (IOException e) {

            System.out.println("Error al guardar dinosaurio: " + e.getMessage()); //se maneja la excepcion en caso de que ocurra un error al guardar el dinosaurio
        }
    }

    public static ArrayList<Dinosaurio>cargarDinosaurios() { //metodo para cargar dinosaurios desde un archivo csv se lee el archivo y se crea un objeto Dinosaurio por cada linea del archivo, luego se agrega a la lista de dinosaurios y se retorna la lista

        ArrayList<Dinosaurio> dinosaurios = new ArrayList<>();

        try {

            BufferedReader reader = new BufferedReader(new FileReader("dinosaurios.csv")); //se lee el archivo de dinosaurios y se crea un objeto Dinosaurio por cada linea del archivo, luego se agrega a la lista de dinosaurios

            String linea;

            while ((linea = reader.readLine()) != null) {

                String[] datos =
                        linea.split(",");

                Dinosaurio dinosaurio =
                        new Dinosaurio(
                                datos[0],
                                datos[1],
                                datos[2],
                                Integer.parseInt(
                                        datos[3]
                                ),
                                Boolean.parseBoolean(
                                        datos[4]
                                )
                        );

                dinosaurios.add(dinosaurio);
            }

            reader.close();

        } catch (IOException e) {

            System.out.println("No se encontraron dinosaurios guardados");
        }

        return dinosaurios;
    }

    public static void actualizarArchivoDinosaurios( //metodo para actualizar el archivo de dinosaurios se recibe la lista de dinosaurios y se escribe en el archivo, sobrescribiendo el contenido anterior
            ArrayList<Dinosaurio> dinosaurios) {

        try {

            FileWriter writer = new FileWriter("dinosaurios.csv"); //se abre el archivo en modo overwrite para sobrescribir el contenido anterior

            for (Dinosaurio dinosaurio : dinosaurios) {

                writer.write(
                        dinosaurio.getNombre()
                                + ","
                                + dinosaurio.getEspecie()
                                + ","
                                + dinosaurio.getTipo()
                                + ","
                                + dinosaurio.getEdad()
                                + ","
                                + dinosaurio.isPeligroso()
                                + "\n"
                );
            }

            writer.close();

        } catch (IOException e) {

            System.out.println("Error al actualizar dinosaurios: " + e.getMessage());
        }
    }
}