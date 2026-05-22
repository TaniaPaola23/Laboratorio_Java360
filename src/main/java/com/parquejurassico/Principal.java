package com.parquejurassico; //clase principal del programa donde se ejecuta el sistema del parque jurasico se crean objetos de las clases Dinosaurio, Turista, Trabajador y Zona para simular el funcionamiento del parque se utiliza un menu interactivo para que el usuario pueda realizar diferentes acciones como ver los dinosaurios, generar eventos, ver la configuracion del parque, registrar ingresos y administrar los dinosaurios se utilizan servicios para manejar la logica del parque y utilidades para manejar archivos y configuracion

import com.parquejurassico.eventos.Evento;
import com.parquejurassico.factory.EventoFactory;
import com.parquejurassico.modelos.Dinosaurio;
import com.parquejurassico.modelos.Turista;
import com.parquejurassico.modelos.Trabajador;
import com.parquejurassico.modelos.Zona;
import com.parquejurassico.servicios.DinosaurioService;
import com.parquejurassico.servicios.EventoService;
import com.parquejurassico.servicios.ParqueService;
import com.parquejurassico.utilidades.ArchivoUtil;
import com.parquejurassico.utilidades.ConfiguracionUtil;
import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Parque Turístico de Dinosaurios - Bienvenidos");

        System.out.println();

        Dinosaurio dinosaurio1 = new Dinosaurio( //se crea un objeto de la clase Dinosaurio con sus atributos nombre, especie, tipo, edad y peligroso se utiliza el constructor de la clase Dinosaurio para inicializar los atributos del dinosaurio
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

        System.out.println("DINOSAURIO ACTUALIZADO");

        dinosaurio1.mostrarInformacion();

        System.out.println();

        DinosaurioService dinosaurioService = new DinosaurioService(); //se crea un objeto de la clase DinosaurioService para utilizar los metodos de servicio relacionados con los dinosaurios se utiliza el metodo mostrarDinosaurios para mostrar la lista de dinosaurios del parque se utiliza el metodo contarPeligrosos para contar cuántos dinosaurios peligrosos hay en el parque se utiliza el metodo existeDinosaurio para verificar si un dinosaurio existe por su nombre se utiliza el metodo eliminarDinosaurio para eliminar un dinosaurio por su nombre se utiliza una lista de dinosaurios para almacenar los dinosaurios del parque

        ArrayList<Dinosaurio> dinosaurios = ArchivoUtil.cargarDinosaurios(); //se carga la lista de dinosaurios desde un archivo csv utilizando el metodo cargarDinosaurios de la clase ArchivoUtil si el archivo no existe se crea una nueva lista vacia

        if (dinosaurios.isEmpty()) { //si la lista de dinosaurios esta vacia se agregan algunos dinosaurios por defecto para simular el funcionamiento del parque

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
        }

        dinosaurioService.mostrarDinosaurios(dinosaurios);

        int peligrosos = dinosaurioService.contarPeligrosos(dinosaurios);

        System.out.println("Dinosaurios peligrosos: " + peligrosos);

        System.out.println();

        Turista turista1 = new Turista( //se crea un objeto de la clase Turista con sus atributos nombre, edad, nacionalidad, dineroDisponible y tieneBoleto se utiliza el constructor de la clase Turista para inicializar los atributos del turista se utiliza el metodo mostrarInformacion para mostrar la informacion del turista
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

        Zona zona1 = new Zona( //se crea un objeto de la clase Zona con sus atributos nombre, capacidadMaxima, cantidadActual, tieneDinosaurios se utiliza el constructor de la clase Zona para inicializar los atributos de la zona se utiliza el metodo mostrarInformacion para mostrar la informacion de la zona se utiliza el metodo ingresarTurista para simular el ingreso de un turista a la zona y actualizar la cantidad actual de turistas en la zona
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

        ParqueService parqueService = new ParqueService();

        parqueService.mostrarEstadoParque();

        System.out.println();

        ConfiguracionUtil configuracion = ConfiguracionUtil.getInstance(); //se obtiene la instancia unica de la clase ConfiguracionUtil utilizando el metodo getInstance se utiliza el metodo obtenerValor para obtener los valores de configuracion del parque desde un archivo properties se muestra la configuracion del parque en la consola
        //se obtiene la configuracion del parque desde el archivo properties utilizando el metodo obtenerValor de la clase ConfiguracionUtil se muestra la configuracion del parque en la consola para que el usuario pueda verla antes de interactuar con el menu del parque
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

        System.out.println("CONFIGURACIÓN DEL PARQUE");

        System.out.println("Turistas configurados: " + turistas);

        System.out.println("Dinosaurios configurados: " + dinosauriosConfigurados);

        System.out.println("Energía configurada: " + energia);

        System.out.println("Zonas configuradas: " + zonas);

        System.out.println();

        ArchivoUtil.guardarIngreso("Boleto General,500,Ana Lopez"); //se guarda un ingreso al parque en un archivo csv utilizando el metodo guardarIngreso de la clase ArchivoUtil se registra el tipo de ingreso, el monto y el nombre del turista que ingreso al parque

        System.out.println();

        EventoService eventoService = new EventoService();

        String nombreEvento =
                eventoService
                        .generarEventoAleatorio();

        Evento evento1 = EventoFactory.crearEvento(nombreEvento);

        System.out.println();

        evento1.mostrarEvento();

        System.out.println();

        ArchivoUtil.guardarEvento(nombreEvento + ",ALTO"); //se guarda un evento del parque en un archivo csv utilizando el metodo guardarEvento de la clase ArchivoUtil se registra el nombre del evento y su nivel de peligro

        int opcion = 0;

        while (opcion != 7) {

            System.out.println();
            System.out.println("MENÚ DEL PARQUE");
            System.out.println("1. Ver dinosaurios");
            System.out.println("2. Generar evento");
            System.out.println("3. Ver configuración");
            System.out.println("4. Registrar ingreso");
            System.out.println("5. Registrar dinosaurio");
            System.out.println("6. Eliminar dinosaurio");
            System.out.println("7. Salir");
            System.out.print("Por favor seleccione una opcion: ");

            if (!scanner.hasNextInt()) {

                System.out.println();
                System.out.println("Debe ingresar un número");

                scanner.nextLine();

                continue;
            }

            opcion = scanner.nextInt(); //se lee la opcion seleccionada por el usuario utilizando el metodo nextInt del Scanner se valida que la opcion sea un numero y se maneja el caso en que el usuario ingresa un valor no numerico se utiliza un switch para ejecutar diferentes acciones dependiendo de la opcion seleccionada por el usuario se muestra un menu interactivo para que el usuario pueda elegir entre ver los dinosaurios, generar eventos, ver la configuracion del parque, registrar ingresos y administrar los dinosaurios se utilizan los servicios correspondientes para cada accion y se manejan casos especiales como ingresar datos invalidos o intentar eliminar un dinosaurio que no existe

            switch (opcion) {

                case 1:

                    dinosaurioService
                            .mostrarDinosaurios(
                                    dinosaurios
                            );

                    break;

                case 2:

                    String nuevoEvento =
                            eventoService
                                    .generarEventoAleatorio();

                    Evento evento2 = EventoFactory.crearEvento(nuevoEvento);

                    System.out.println();

                    evento2.mostrarEvento();

                    ArchivoUtil.guardarEvento(nuevoEvento + ",ALTO");

                    break;

                case 3:

                    System.out.println();
                    System.out.println("CONFIGURACIÓN DEL PARQUE");
                    System.out.println("Turistas configurados: " + turistas);
                    System.out.println("Dinosaurios configurados: " + dinosauriosConfigurados);
                    System.out.println("Energía configurada: " + energia);
                    System.out.println("Zonas configuradas: " + zonas);

                    break;

                case 4:

                    scanner.nextLine();

                    System.out.print("Nombre del turista: ");

                    String nombreTurista =
                            scanner.nextLine();

                    System.out.print("Monto del boleto: ");

                    double monto = scanner.nextDouble();

                    ArchivoUtil.guardarIngreso(
                            "Boleto,"
                                    + monto
                                    + ","
                                    + nombreTurista
                    );

                    break;

                case 5:

                    scanner.nextLine();

                    System.out.print("Nombre del dinosaurio: ");

                    String nombreDino = scanner.nextLine();

                    if (nombreDino.trim().isEmpty()) {

                        System.out.println();
                        System.out.println("El nombre no puede estar vacío");

                        break;
                    }

                    if (dinosaurioService
                            .existeDinosaurio(
                                    dinosaurios,
                                    nombreDino
                            )) {

                        System.out.println();
                        System.out.println("Dinosaurio ya registrado");

                        break;
                    }

                    System.out.print(
                            "Especie: "
                    );

                    String especie =
                            scanner.nextLine();

                    if (especie.trim().isEmpty()) {

                        System.out.println();
                        System.out.println("La especie no puede estar vacía");

                        break;
                    }

                    System.out.print("Tipo: ");

                    String tipo = scanner.nextLine();

                    if (tipo.trim().isEmpty()) {

                        System.out.println();
                        System.out.println("El tipo no puede estar vacío");

                        break;
                    }

                    System.out.print("Edad: ");

                    if (!scanner.hasNextInt()) {

                        System.out.println();
                        System.out.println("La edad debe ser numérica");

                        scanner.nextLine();

                        break;
                    }

                    int edad =
                            scanner.nextInt();

                    if (edad < 0) {

                        System.out.println();
                        System.out.println("Edad inválida");

                        break;
                    }

                    System.out.print("¿Es peligroso? true/false: ");

                    String valorPeligroso = scanner.next();

                    if (!valorPeligroso.equalsIgnoreCase(
                            "true"
                    ) && !valorPeligroso.equalsIgnoreCase(
                            "false"
                    )) {

                        System.out.println();
                        System.out.println("Debe ingresar true o false");

                        break;
                    }

                    boolean peligroso =
                            Boolean.parseBoolean(
                                    valorPeligroso
                            );

                    Dinosaurio nuevoDinosaurio =
                            new Dinosaurio(
                                    nombreDino,
                                    especie,
                                    tipo,
                                    edad,
                                    peligroso
                            );

                    dinosaurios.add(nuevoDinosaurio);

                    ArchivoUtil.guardarDinosaurio(nuevoDinosaurio);

                    System.out.println();
                    System.out.println("Dinosaurio registrado correctamente");

                    break;

                case 6:

                    scanner.nextLine();

                    System.out.print("Nombre del dinosaurio a eliminar: ");

                    String nombreEliminar = scanner.nextLine();

                    boolean eliminado =
                            dinosaurioService
                                    .eliminarDinosaurio(
                                            dinosaurios,
                                            nombreEliminar
                                    );

                    System.out.println();

                    if (eliminado) {

                        ArchivoUtil.actualizarArchivoDinosaurios(dinosaurios);

                        System.out.println("Se elimino correctamente el dinosaurio");

                    } else {

                        System.out.println("No se encontro el dinosaurio");
                    }

                    break;

                case 7:

                    System.out.println();
                    System.out.println("Gracias por su visita!");

                    break;

                default:

                    System.out.println();
                    System.out.println("Opcion no valida, por favor intente nuevamente");
            }
        }

        scanner.close(); 
    }
}