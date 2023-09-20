package org.example;

import org.example.Cuadratica;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import static org.junit.jupiter.api.Assertions.*;

public class CuadraticaTest {

    @Test
    public void ingresarAValidoTest() {
        // Simular entrada de usuario (por ejemplo, "2.0\n")
        String input = "2.0\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        // Ejecutar el método y verificar si devuelve el valor correcto
        double a = Cuadratica.ingresarA(0.0);
        assertEquals(2.0, a, 0.0001); // Verifica que el valor ingresado sea igual a 2.0

        // Restaurar la entrada estándar original
        System.setIn(System.in);
    }




    @Test
    public void calcularCuadratica1Test() {
        double x1 = Cuadratica.calcularCuadratica1(0, 1.0, -3.0, 2.0, 1.0);
        assertEquals(2.0, x1, 0.0001); // Verifica que el cálculo de la primera raíz sea correcto
    }
}
