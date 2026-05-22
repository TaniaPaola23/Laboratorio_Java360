package com.parquejurassico.utilidades;
//clase de utilidad para manejo de configuracion en el parque jurasico se implementa el patron singleton para asegurar que solo exista una instancia de esta clase y se pueda acceder a la configuracion desde cualquier parte del programa
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfiguracionUtil { 

    private static ConfiguracionUtil instancia; //instancia unica de la clase

    private Properties properties; //objeto Properties para cargar la configuracion desde un archivo properties

    private ConfiguracionUtil() { //constructor privado para evitar que se creen instancias de esta clase desde fuera de la clase

        properties = new Properties();

        try {

            InputStream input =
                    getClass().getClassLoader()
                            .getResourceAsStream(
                                    "config.properties");

            properties.load(input);

        } catch (IOException e) {

            System.out.println("Error al cargar configuracion");
        }
    }

    public static ConfiguracionUtil getInstance() { //metodo para obtener la instancia unica de la clase si no existe se crea una nueva instancia y se retorna, si ya existe se retorna la instancia existente

        if (instancia == null) {

            instancia = new ConfiguracionUtil();
        }

        return instancia;
    }

    public String obtenerValor(
            String clave
    ) {

        return properties.getProperty(
                clave);
    }
}