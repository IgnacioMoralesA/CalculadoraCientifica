import java.util.Scanner;

public class CalculadoraCientifica {
    static Scanner leer = new Scanner(System.in);
    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        ecuacionCuadratica();
        sistemaEcuaciones();
        ecuacionRecta();
    }

    public static void ecuacionCuadratica() {
        String[] parametrosCuadratica = {"a","b","c"};
        double[] coeficientes = ingresarCoeficientes(parametrosCuadratica);
        double[] solucionesCuadratica = calcularEcuacionCuadratica(coeficientes);
        mostrarEcuacionCuadratica(solucionesCuadratica);
    }

    public static void sistemaEcuaciones() {
        String[] parametrosSistemaEcuaciones = {"a1","b1","c1","a2","b2","c2"};
        double[] coeficientes = ingresarCoeficientes(parametrosSistemaEcuaciones);
        double[] solucionesSistema = calcularSistemaEcuaciones(coeficientes);
        mostrarSistemaEcuaciones(solucionesSistema);
    }

    public static void ecuacionRecta() {
        String[] parametrosRecta = {"x1","y1","x2","y2"};
        double[] coeficientes = ingresarCoeficientes(parametrosRecta);
        double[] solucionRecta = calcularEcuacionRecta(coeficientes);
        mostrarEcuacionRecta(solucionRecta);
    }

    public static double[] ingresarCoeficientes(String[] parametros) {
        double[] coeficientes = new double[parametros.length];
        for (int i = 0; i < coeficientes.length; i++) {
            System.out.println(parametros[i]+"?:");
            coeficientes[i] = leer.nextDouble();
        }
        return coeficientes;
    }

    public static double[] calcularEcuacionCuadratica(double[] coeficientes) {
        double[] solucionesCuadratica = new double[2];
        double a = coeficientes[0];
        double b = coeficientes[1];
        double c = coeficientes[2];
        double discriminante = (Math.pow(b,2)-(4*a*c));
        double raizDiscriminante = Math.sqrt(discriminante);
        double x1 = (-b+raizDiscriminante)/(2*a);
        double x2 = (-b-raizDiscriminante)/(2*a);
        solucionesCuadratica[0] = x1;
        solucionesCuadratica[1] = x2;
        return solucionesCuadratica;
    }

    public static double[] calcularSistemaEcuaciones(double[] coeficientes) {
        double[] solucionesSistema = new double[2];
        double a1 = coeficientes[0];
        double b1 = coeficientes[1];
        double c1 = coeficientes[2];
        double a2 = coeficientes[3];
        double b2 = coeficientes[4];
        double c2 = coeficientes[5];
        double x,y;
        y = ((c2 * a1) - (a2 * c1)) / ((b2 * a1) - (a2 * b1));
        x = (c1 - (b1 * y)) / a1;
        solucionesSistema[0] = x;
        solucionesSistema[1] = y;
        return solucionesSistema;
    }

    public static double[] calcularEcuacionRecta(double[] coeficientes) {
        double[] solucionRecta = new double[2];
        double x1 = coeficientes[0];
        double y1 = coeficientes[1];
        double x2 = coeficientes[2];
        double y2 = coeficientes[3];
        double pendiente = (y2 - y1) / (x2 - x1);
        double b = ((-x1)*pendiente)+y1;
        solucionRecta[0] = pendiente;
        solucionRecta[1] = b;
        return solucionRecta;
    }

    public static void mostrarEcuacionCuadratica(double[] solucionesCuadratica) {
        System.out.println("Las soluciones de la ecuación son: ");
        System.out.println("x1 = "+solucionesCuadratica[0]);
        System.out.println("x2 = "+solucionesCuadratica[1]);
    }

    public static void mostrarSistemaEcuaciones(double[] solucionesSistema) {
        System.out.println("Las soluciones del sistema son: ");
        System.out.println("x = "+solucionesSistema[0]);
        System.out.println("y = "+solucionesSistema[1]);
    }

    public static void mostrarEcuacionRecta(double[] solucionRecta) {
        System.out.println("La ecuación de la recta es: "+"y = "+solucionRecta[0]+"x + "+solucionRecta[1]);
    }
}
