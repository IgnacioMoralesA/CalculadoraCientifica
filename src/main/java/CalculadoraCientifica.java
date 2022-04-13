public class CalculadoraCientifica {
    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        double[] solucionesCuadratica = ecuacionCuadratica();
        mostrarEcuacionCuadratica(solucionesCuadratica);
        double[] solucionesSistema = sistemaEcuaciones();
        mostrarSistemaEcuaciones(solucionesSistema);
        double[] solucionRecta = ecuacionRecta();
        mostrarEcuacionRecta(solucionRecta);
    }

    public static double[] ecuacionCuadratica() {
        double[] solucionesCuadratica = new double[2];
        double a = 0;
        double b = 0;
        double c = 0;
        double discriminante = (Math.pow(b,2)-(4*a*c));
        double raizDiscriminante = Math.sqrt(discriminante);
        double x1 = (-b+raizDiscriminante)/(2*a);
        double x2 = (-b-raizDiscriminante)/(2*a);
        solucionesCuadratica[0] = x1;
        solucionesCuadratica[1] = x2;
        return solucionesCuadratica;
    }

    public static double[] sistemaEcuaciones() {
        double[] solucionesSistema = new double[2];
        double a = 0;
        double b = 0;
        double c = 0;
        double d = 0;
        double e = 0;
        double f = 0;
        double x,y;
        y = ((f * a) - (d * c)) / ((e * a) - (d * b));
        x = (c - (b * y)) / a;
        solucionesSistema[0] = x;
        solucionesSistema[1] = y;
        return solucionesSistema;
    }

    public static double[] ecuacionRecta() {
        double[] solucionRecta = new double[2];
        double x1 = 0;
        double y1 = 0;
        double x2 = 0;
        double y2 = 0;
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
