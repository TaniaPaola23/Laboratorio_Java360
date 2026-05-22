package com.parquejurassico.servicios;//clase que representa el servicio de dinosaurios en el parque jurasico

import com.parquejurassico.modelos.Dinosaurio; //importamos la clase Dinosaurio para poder usarla en esta clase
import java.util.ArrayList; //se importa la clase ArrayList para poder usarla en esta clase

public class DinosaurioService { //clase que representa el servicio de dinosaurios en el parque jurasico

    public void mostrarDinosaurios( //metodo que muestra la información de los dinosaurios en el parque jurasico
            ArrayList<Dinosaurio> dinosaurios) {

        System.out.println();
        System.out.println("LISTA DE DINOSAURIOS");

        for (Dinosaurio dino : dinosaurios) {

            dino.mostrarInformacion();
            System.out.println();
        }
    }

    public int contarPeligrosos( //metodo que cuenta el numero de dinosaurios peligrosos en el parque jurasico
            ArrayList<Dinosaurio> dinosaurios) {

        int peligrosos = 0;

        for (Dinosaurio dino : dinosaurios) {

            if (dino.isPeligroso()) {
                peligrosos++;
            }
        }

        return peligrosos;
    }

    public boolean eliminarDinosaurio( //metodo que elimina un dinosaurio del parque jurasico
            ArrayList<Dinosaurio> dinosaurios, String nombre) {

        for (Dinosaurio dino : dinosaurios) {

            if (dino.getNombre().equalsIgnoreCase(nombre)) {

                dinosaurios.remove(dino);

                return true;
            }
        }

        return false;
    }

    public boolean existeDinosaurio(ArrayList<Dinosaurio> dinosaurios, String nombre) { //metodo que verifica si un dinosaurio existe en el parque jurasico

        for (Dinosaurio dinosaurio : dinosaurios) {

            if (dinosaurio.getNombre().equalsIgnoreCase(nombre)) {

                return true;
            }
        }

        return false;
    }
}