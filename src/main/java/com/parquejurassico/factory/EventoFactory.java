package com.parquejurassico.factory; //clase que representa una fabrica de eventos en el parque jurásico

import com.parquejurassico.eventos.Evento; //importamos la clase evento para poder crear eventos desde la fabrica

public class EventoFactory { //metodo estatico para crear eventos basado en el nombre del evento

    public static Evento crearEvento(String nombreEvento) { //metodo que recibe el nombre del evento y devuelve un objeto de tipo evento

        if (nombreEvento.equalsIgnoreCase("Apagón Masivo")) { 
            return new Evento(nombreEvento,"Falla total de energía " + "en el parque", "ALTO");
        }

        if (nombreEvento.equalsIgnoreCase("Escape de Dinosaurio")) {

            return new Evento(nombreEvento,"Un dinosaurio escapó " + "del recinto", "CRÍTICO");
        }

        if (nombreEvento.equalsIgnoreCase("Tormenta Torrencial")) {

            return new Evento(nombreEvento,"Tormenta intensa " + "en el parque", "MEDIO");
        }

        return new Evento("Evento Desconocido", "Evento no identificado", "BAJO");
    }
}