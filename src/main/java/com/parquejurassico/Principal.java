package com.parquejurassico;

import com.parquejurassico.eventos.Evento;
import com.parquejurassico.modelos.Dinosaurio;
import com.parquejurassico.modelos.Turista;
import com.parquejurassico.modelos.Trabajador;
import com.parquejurassico.modelos.Zona;
import com.parquejurassico.servicios.ParqueService;
import com.parquejurassico.servicios.EventoService;
import com.parquejurassico.utilidades.ArchivoUtil;
import com.parquejurassico.utilidades.ConfiguracionUtil;
import java.util.ArrayList;
import java.util.Scanner;


public class Principal {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println(
                "Parque Turístico de Dinosaurios - Bienvenidos"
        );

        System.out.println();

        Dinosaurio dinosaurio1 = new Dinosaurio(
                "Rexy",
                "Tyrannosaurus Rex",
                "Carnívoro",
                12,
                true
        );

        dinosaurio1.mostrarInformacion();

        System.out.println();

        dinosaurio1.setEdad(13);

        dinosaurio1.setPeligroso(false);

        System.out.println(
                "DINOSAURIO ACTUALIZADO"
        );

        dinosaurio1.mostrarInformacion();

        System.out.println();

        ArrayList<Dinosaurio> dinosaurios =
                new ArrayList<>();

        dinosaurios.add(dinosaurio1);

        dinosaurios.add(new Dinosaurio(
                "Blue",
                "Velociraptor",
                "Carnívoro",
                6,
                true
        ));

        dinosaurios.add(new Dinosaurio(
                "Triceratops Max",
                "Triceratops",
                "Herbívoro",
                15,
                false
        ));

        System.out.println(
                "LISTA DE DINOSAURIOS"
        );

        for (Dinosaurio dino : dinosaurios) {

            dino.mostrarInformacion();

            System.out.println();
        }

        int peligrosos = 0;

        for (Dinosaurio dino : dinosaurios) {

            if (dino.isPeligroso()) {

                peligrosos++;
            }
        }

        System.out.println(
                "Dinosaurios peligrosos:"
                        + peligrosos
        );

        System.out.println();

        Turista turista1 = new Turista(
                "Ana Lopez",
                28,
                "Mexicana",
                3500.50,
                true
        );

        turista1.mostrarInformacion();

        System.out.println();

        Trabajador trabajador1 = new Trabajador(
                "Carlos García",
                35,
                "Cuidador",
                2500.00,
                true
        );

        trabajador1.mostrarInformacion();

        System.out.println();

        Zona zona1 = new Zona(
                "Recinto Central",
                100,
                45,
                true
        );

        zona1.mostrarInformacion();

        System.out.println();

        zona1.ingresarTurista();

        System.out.println();

        zona1.mostrarInformacion();

        System.out.println();

        ParqueService parqueService =
                new ParqueService();

        parqueService.mostrarEstadoParque();

        System.out.println();

        ConfiguracionUtil configuracion =
                new ConfiguracionUtil();

        String turistas =
                configuracion.obtenerValor(
                        "turistas"
                );

        String dinosauriosConfigurados =
                configuracion.obtenerValor(
                        "dinosaurios"
                );

        String energia =
                configuracion.obtenerValor(
                        "energia"
                );

        String zonas =
                configuracion.obtenerValor(
                        "zonas"
                );

        System.out.println(
                "CONFIGURACIÓN DEL PARQUE"
        );

        System.out.println(
                "Turistas configurados:"
                        + turistas
        );

        System.out.println(
                "Dinosaurios configurados:"
                        + dinosauriosConfigurados
        );

        System.out.println(
                "Energía configurada:"
                        + energia
        );

        System.out.println(
                "Zonas configuradas:"
                        + zonas
        );

        System.out.println();

        ArchivoUtil.guardarIngreso(
                "Boleto General,500,Ana Lopez"
        );

        System.out.println();

        EventoService eventoService =
                new EventoService();

        String nombreEvento =
                eventoService
                        .generarEventoAleatorio();

        Evento evento1 = new Evento(
                nombreEvento,
                "Evento generado automáticamente "
                        + "por el sistema",
                "ALTO"
        );

        System.out.println();

        evento1.mostrarEvento();

        System.out.println();

        ArchivoUtil.guardarEvento(
                nombreEvento + ",ALTO"
        );

                System.out.println();

        System.out.println(
                "MENÚ DEL PARQUE"
        );

        System.out.println(
                "1. Ver dinosaurios"
        );

        System.out.println(
                "2. Generar evento"
        );

        System.out.println(
                "3. Salir"
        );

        System.out.print(
                "Seleccione una opción:"
        );

        int opcion = scanner.nextInt();

        switch (opcion) {

            case 1:

                System.out.println();

                System.out.println(
                        "LISTA DE DINOSAURIOS"
                );

                for (Dinosaurio dino : dinosaurios) {

                    dino.mostrarInformacion();

                    System.out.println();
                }

                break;

            case 2:

                System.out.println();

                String eventoNuevo =
                        eventoService
                                .generarEventoAleatorio();

                System.out.println(
                        "Evento generado:"
                                + eventoNuevo
                );

                break;

            case 3:

                System.out.println();

                System.out.println(
                        "Saliendo del sistema"
                );

                break;

            default:

                System.out.println();

                System.out.println(
                        "Opcion invalida"
                );

                scanner.close();
        }
    }
}