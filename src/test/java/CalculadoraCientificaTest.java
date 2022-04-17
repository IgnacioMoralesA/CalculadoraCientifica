import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraCientificaTest {
    private double[][] coeficientesCuadraticas;
    private double[][] solucionesCuadraticas;
    private double[][] coeficientesSistemas;
    private double[][] solucionesSistemas;
    private double[][] coeficientesRectas;
    private double[][] solucionesRectas;

    @BeforeEach
    void setUp() {
        coeficientesCuadraticas = new double[][]{{1, -5, 6}, {2, -7, 3}};
        solucionesCuadraticas = new double[][]{{3, 2}, {3, 0.5}};
        coeficientesSistemas = new double[][]{{2, 3, -1, 3, 4, 0}, {2, 1, 6, 4, 3, 14}};
        solucionesSistemas = new double[][]{{4, -3}, {2, 2}};
        coeficientesRectas = new double[][]{{1, 2, -2, 5}, {-2, -1, 1, 2}};
        solucionesRectas = new double[][]{{-1, 3}, {1, 1}};
    }

    @Test
    void calcularEcuacionCuadraticaTest(){
        boolean condicion = true;
        for (int i = 0; i < solucionesCuadraticas.length; i++) {
            double[] solucionesCuadratica = CalculadoraCientifica.calcularEcuacionCuadratica(coeficientesCuadraticas[i]);
            for (int j = 0; j < solucionesCuadraticas[0].length; j++) {
                if (!Arrays.equals(solucionesCuadratica, solucionesCuadraticas[i])) {
                    condicion = false;
                    break;
                }
            }
            CalculadoraCientifica.mostrarEcuacionCuadratica(solucionesCuadratica);
        }
        assertTrue(condicion);
    }

    @Test
    void calcularSistemaEcuacionesTest(){
        boolean condicion = true;
        for (int i = 0; i < solucionesSistemas.length; i++) {
            double[] solucionesSistema = CalculadoraCientifica.calcularSistemaEcuaciones(coeficientesSistemas[i]);
            for (int j = 0; j < solucionesSistemas[0].length; j++) {
                if (!Arrays.equals(solucionesSistema, solucionesSistemas[i])) {
                    condicion = false;
                    break;
                }
            }
            CalculadoraCientifica.mostrarSistemaEcuaciones(solucionesSistema);
        }
        assertTrue(condicion);
    }

    @Test
    void calcularEcuacionRectaTest(){
        boolean condicion = true;
        for (int i = 0; i < solucionesRectas.length; i++) {
            double[] solucionRecta = CalculadoraCientifica.calcularEcuacionRecta(coeficientesRectas[i]);
            for (int j = 0; j < solucionesRectas[0].length; j++) {
                if (!Arrays.equals(solucionRecta, solucionesRectas[i])) {
                    condicion = false;
                    break;
                }
            }
            CalculadoraCientifica.mostrarEcuacionRecta(solucionRecta);
        }
        assertTrue(condicion);
    }

    @AfterEach
    void tearDown() {
        coeficientesCuadraticas = null;
        solucionesCuadraticas = null;
        coeficientesSistemas = null;
        solucionesSistemas = null;
    }
}