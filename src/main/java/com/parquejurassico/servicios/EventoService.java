package com.parquejurassico.servicios;

import java.util.Random;

public class EventoService {

    public String generarEventoAleatorio() {

        Random random = new Random();
        int numero = random.nextInt(3);

        if (numero == 0) {

            return "Escape de Dinosaurio";

        } else if (numero == 1) {

            return "Apagón Masivo";

        } else {

            return "Tormenta Torrencial";
        }
    }
}