package com.parquejurassico.servicios; //clase que representa el servicio de eventos en el parque jurasico

import java.util.Random; //se importa la clase Random para poder generar eventos aleatorios en el parque jurasico

public class EventoService { //clase que representa el servicio de eventos en el parque jurasico

    public String generarEventoAleatorio() { //metodo que genera un evento aleatorio en el parque jurasico

        Random random = new Random();
        int numero = random.nextInt(3);

        if (numero == 0) {

            return "Escape de Dinosaurio";

        } else if (numero == 1) {

            return "Apagon Masivo";

        } else {

            return "Tormenta Torrencial";
        }
    }
}