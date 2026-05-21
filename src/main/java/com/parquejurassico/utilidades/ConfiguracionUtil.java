package com.parquejurassico.utilidades;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfiguracionUtil {

    private Properties properties;

    public ConfiguracionUtil() {

        properties = new Properties();

        try {

            InputStream input =
                    getClass().getClassLoader()
                            .getResourceAsStream("config.properties");

            properties.load(input);

        } catch (IOException e) {

            System.out.println("Error al cargar configuracion");
        }
    }

    public String obtenerValor(String clave) {

        return properties.getProperty(clave);
    }
}