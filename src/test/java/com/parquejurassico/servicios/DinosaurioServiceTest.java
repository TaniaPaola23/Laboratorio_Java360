package com.parquejurassico.servicios; //clase de servicio para manejo de dinosaurios en el parque jurasico se implementan metodos para contar dinosaurios peligrosos, verificar si existe un dinosaurio por su nombre y eliminar un dinosaurio por su nombre se utiliza una lista de dinosaurios para almacenar los dinosaurios del parque

import com.parquejurassico.modelos.Dinosaurio;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

public class DinosaurioServiceTest { //clase de test para la clase DinosaurioService se utilizan pruebas unitarias para verificar el correcto funcionamiento de los metodos de la clase DinosaurioService se utiliza el framework JUnit para las pruebas

    @Test
    public void testContarPeligrosos() { //metodo para probar el metodo contarPeligrosos se crea una lista de dinosaurios con diferentes niveles de peligrosidad y se verifica que el resultado del metodo contarPeligrosos sea el esperado

        DinosaurioService service = new DinosaurioService();

        ArrayList<Dinosaurio> dinosaurios = new ArrayList<>();

        dinosaurios.add(
                new Dinosaurio(
                        "Rex",
                        "TRex",
                        "Carnivoro",
                        10,
                        true
                )
        );

        dinosaurios.add(
                new Dinosaurio(
                        "Blue",
                        "Raptor",
                        "Carnivoro",
                        5,
                        false
                )
        );

        int resultado =
                service.contarPeligrosos(
                        dinosaurios
                );

        assertEquals(
                1,
                resultado
        );
    }

    @Test
    public void testExisteDinosaurio() { //metodo para probar el metodo existeDinosaurio se crea una lista de dinosaurios y se verifica que el metodo devuelva true cuando el dinosaurio existe y false cuando no existe

        DinosaurioService service = new DinosaurioService();

        ArrayList<Dinosaurio> dinosaurios = new ArrayList<>();

        dinosaurios.add(
                new Dinosaurio(
                        "Blue",
                        "Raptor",
                        "Carnivoro",
                        5,
                        true
                )
        );

        boolean existe =
                service.existeDinosaurio(
                        dinosaurios,
                        "Blue"
                );

        assertTrue(existe);
    }

    @Test
    public void testEliminarDinosaurio() { //metodo para probar el metodo eliminarDinosaurio se crea una lista de dinosaurios y se verifica que el metodo devuelva true cuando el dinosaurio es eliminado y false cuando no existe

        DinosaurioService service = new DinosaurioService();

        ArrayList<Dinosaurio> dinosaurios = new ArrayList<>();

        dinosaurios.add(
                new Dinosaurio(
                        "Blue",
                        "Raptor",
                        "Carnivoro",
                        5,
                        true
                )
        );

        boolean eliminado =
                service.eliminarDinosaurio(
                        dinosaurios,
                        "Blue"
                );

        assertTrue(eliminado);

        assertEquals(
                0,
                dinosaurios.size()
        );
    }
}