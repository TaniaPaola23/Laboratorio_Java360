# Laboratorio_Java360

Este proyecto consiste en el dsarrollo de un sistema de simulación para un parque turístico de dinosaurios en el cual se gesionan dinosaurios, turistas, empleados, zonas y eventos, teniendo como objetivo principal aplicar conceptos fundamentales de desarrollo de software dentro de un entorno practico y muy creativo.

Herramientas utilizadas: Java 17, Visual Studio Code, Maven, JUint5, Git/Github, Archivos CSV

Estructura del proyecto: 

src
 ├── main
 │    ├── java/com/parquejurassico
 │    │     ├── eventos
 │    │     ├── factory
 │    │     ├── modelos
 │    │     ├── servicios
 │    │     ├── utilidades
 │    │     └── Principal.java
 │    └── resources
 │          └── config.properties
 │
 └── test
      └── java/com/parquejurassico/servicios
           └── DinosaurioServiceTest.java

Configuración del sistema; SE necesita tener insalado Java 17, Maven para las dependencias y un entorno de desarrollo

para compilar el proyecto en terminal se ejecuta mvn compile, enseguida de mvn exec:java -Dexec.mainClass="com.parquejurassico.Principal"

para ejecutar las pruebas  en terminal se ejecuta en temrinal l comando mvn test

Explicación general: El sistema permite registrar-eliminar-consultar dinsaurio(s) ademas de generar eventos aleatorios, registrar ingresos, mostrar la configuración del parque, validar entradas del usuario y la peristecia de información con archivos csv          

Patrones de diseño utilizados "Singleton y Factory"