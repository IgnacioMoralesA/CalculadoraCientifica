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
        double[] solucionesCuadratica = new double[1];
        int a = 0;
        int b = 0;
        int c = 0;
        double discriminante = (Math.pow(b,2)-(4*a*c));
        double raizDiscriminante = Math.sqrt(discriminante);
        double x1 = -((b + raizDiscriminante/2*a));
        double x2 = -((b - raizDiscriminante/2*a));
        solucionesCuadratica[0] = x1;
        solucionesCuadratica[1] = x2;
        return solucionesCuadratica;
    }

    public static double[] sistemaEcuaciones() {
        double[] solucionesSistema = new double[1];
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        int e = 0;
        int f = 0;
        double x,y;
        y = ((f * a) - (d * c)) / ((e * a) - (d * b));
        x = (c - (b * y)) / a;
        solucionesSistema[0] = x;
        solucionesSistema[1] = y;
        return solucionesSistema;
    }

    public static double[] ecuacionRecta() {
        double[] solucionRecta = new double[1];
        int x1 = 0;
        int x2 = 0;
        int y1 = 0;
        int y2 = 0;
        double pendiente = (y1 - y2) / (x2 - x1);
        double b = (pendiente*(-x1)+y1);
        solucionRecta[0] = pendiente;
        solucionRecta[1] = b;
        return solucionRecta;
    }

    public static void mostrarEcuacionCuadratica(double[] solucionesCuadratica) {
        System.out.println("x1 es: "+solucionesCuadratica[0]);
        System.out.println("x2 es: "+solucionesCuadratica[1]);
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
