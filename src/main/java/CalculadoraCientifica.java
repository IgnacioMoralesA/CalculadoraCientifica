import java.util.Scanner;

public class CalculadoraCientifica {
    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        try{
        menu();
        }catch (Exception e){
            System.out.println("Valor no valido.");
        }
    }

    public static void menu() {
        double a=0;
        double b=0;
        double c=0;
        int eleccion;
        do {
            do {
                System.out.println("que operacion desea hacer? ");
                System.out.println("[1] Sumar");
                System.out.println("[2] Restar");
                System.out.println("[3] Multiplicar");
                System.out.println("[4] Dividir");
                System.out.println("[5] Sacar el numero mayor");
                System.out.println("[6] Sacar el numero menor");
                System.out.println("[7] Potencia");
                System.out.println("[8] Porcentaje");
                System.out.println("[9] Ecuaciones");
                System.out.println("[10] Perimetros, Areas o Volumenes");
                System.out.println("[11] Sistema de DOS ecuaciones");
                System.out.println("[12] Ecuaciones de la recta");
                System.out.println("[13] Factoriales");
                System.out.println("[14] Salir");
                eleccion = leer.nextInt();
                switch (eleccion) {
                    case 1:
                        sumar(a, b);
                        break;
                    case 2:
                        restar(a, b);
                        break;
                    case 3:
                        multiplicar(a, b);
                        break;
                    case 4:
                        dividir(a, b);
                        break;
                    case 5:
                        mayor(a, b);
                        break;
                    case 6:
                        menor(a, b);
                        break;
                    case 7:
                        potencia(a, b);
                        break;
                    case 8:
                        porcentaje(a, c);
                        break;
                    case 9:
                        ecuacionescuadradas();
                        break;
                    case 10:
                        PerimetrosAreas(a, b);
                        break;
                    case 11:
                        sistemaEcuaciones();
                        break;
                    case 12:
                        ecuacionRecta();
                        break;
                    case 13:
                        Factoriales(a);
                        break;
                    case 14:
                        break;
                }
            } while (eleccion < 1 || eleccion > 14);
        }while (eleccion != 14);
        }

    public static void Factoriales(Double a) {
        System.out.println("ingrese dato: ");
        a=leer.nextDouble();
        int fact = 1;
        for( int i = 0; i <= a; i++ ) {
            fact *= (i+1);
        }
        resultado(fact);
    }

    public static double[] ecuacionRecta() {
        double[] solucionRecta = new double[2];
        System.out.println("Ingrese X1: ");
        double x1 = leer.nextDouble();
        System.out.println("Ingrese Y1: ");
        double y1 = leer.nextDouble();
        System.out.println("Ingrese X2: ");
        double x2 = leer.nextDouble();
        System.out.println("Ingrese Y2: ");
        double y2 = leer.nextDouble();
        double pendiente = (y2 - y1) / (x2 - x1);
        double b = ((-x1)*pendiente)+y1;
        solucionRecta[0] = pendiente;
        solucionRecta[1] = b;
        mostrarEcuacionRecta(solucionRecta);
        return solucionRecta;
    }

    public static void mostrarEcuacionRecta(double[] solucionRecta) {
        System.out.println("La ecuación de la recta es: "+"y = "+solucionRecta[0]+"x + "+solucionRecta[1]);
    }

    public static double[] sistemaEcuaciones() {
        double[] solucionesSistema = new double[2];
        System.out.println("Ingrese el numero que acompaña a X en la primera ecuacion");
        double a = leer.nextDouble();
        System.out.println("Ingrese el numero que acompaña a Y en la primera ecuacion");
        double b = leer.nextDouble();
        System.out.println("Ingrese el resultado de la primera ecuacion");
        double c = leer.nextDouble();
        System.out.println("Ingrese el numero que acompaña a X en la segunda ecuacion");
        double d = leer.nextDouble();
        System.out.println("Ingrese el numero que acompaña a Y en la segunda ecuacion");
        double e = leer.nextDouble();
        System.out.println("Ingrese el resultado de la segunda ecuacion");
        double f = leer.nextDouble();
        double x,y;
        y = ((f * a) - (d * c)) / ((e * a) - (d * b));
        x = (c - (b * y)) / a;
        solucionesSistema[0] = x;
        solucionesSistema[1] = y;
        mostrarSistemaEcuaciones(solucionesSistema);
        return solucionesSistema;
    }

    public static void mostrarSistemaEcuaciones(double[] solucionesSistema) {
        System.out.println("Las soluciones del sistema son: ");
        System.out.println("x = "+solucionesSistema[0]);
        System.out.println("y = "+solucionesSistema[1]);
    }

    public static void ecuacionescuadradas() {
        double a =0;
        do {
        System.out.println("Ingrese A: ");
        a=leer.nextDouble();
        }while (a == 0);
        System.out.println("Ingrese B: ");
        double b=leer.nextDouble();
        System.out.println("Ingrese C: ");
        double c=leer.nextDouble();
        if(Math.pow(b,2)<(4*a*c)){
            System.out.println("Solucion no real");
        }
        double raiz=Math.sqrt(Math.pow(b,2)-4*a*c);
        if(Math.pow(b,2)>(4*a*c)){
        double X1=(((-b)+raiz))/(2*a);
        double X2=(((-b)-raiz))/(2*a);
        ResultadoEcuaciones(X1,X2);
        }
    }

    public static void PerimetrosAreas(double a, double b) {
        int eleccion1=0;
        do {
            System.out.println("Que quiere hacer?");
            System.out.println("[1] Perimetros");
            System.out.println("[2] Areas");
            System.out.println("[3] Volumenes");
            eleccion1 = leer.nextInt();
            if(eleccion1==3){
                eleccion1=1;
            }
            switch (eleccion1) {
                case 1:
                    perimetros(a, b);
                    break;
                case 2:
                    areas(a, b);
                    break;
            }
        }while (eleccion1<1 || eleccion1>3);
    }

    public static void areas(double a, double b) {
        int eleccion=0;
        do {
            System.out.println("De que quiere sacar el Area?");
            System.out.println("[1] Area de un cuadrado");
            System.out.println("[2] Area de un rectangulo");
            System.out.println("[3] Area de un circulo");
            System.out.println("[4] Area de una esfera");
            System.out.println("[5] Area de un cubo");
            System.out.println("[6] Area de un cono");
            System.out.println("[7] Salir");
            eleccion = leer.nextInt();
            switch (eleccion) {
                case 1:
                    cuadrado(a);
                    break;
                case 2:
                    rectangulo(a, b);
                    break;
                case 3:
                    circulo(a);
                    break;
                case 4:
                    esfera(a);
                    break;
                case 5:
                    cubo(a);
                    break;
                case 6:
                    cono(a, b);
                    break;
                case 7:
                    break;
            }
        }while (eleccion<1 || eleccion>7);
    }

    public static double cuadrado(double a){
        System.out.println("Cual es el lado de su cuadrado?");
        a=leer.nextDouble();
        double resultado=Math.pow(a,2);
        resultado(resultado);
        return Math.pow(a,2);
    }

    public static double rectangulo(double a, double b){
        System.out.println("Ingrese el ancho de su rectangulo: ");
        a=leer.nextDouble();
        System.out.println("Ingrese el alto de su rectangulo: ");
        b=leer.nextDouble();
        double resultado=a*b;
        resultado(resultado);
        return a*b;
    }

    public static double circulo(double a){
        System.out.println("Ingrese el radio de su circulo: ");
        a=leer.nextDouble();
        double resultado=(Math.PI*Math.pow(a,2));
        resultado(resultado);
        return Math.PI*Math.pow(a,2);
    }

    public static double esfera(double a){
        System.out.println("Ingrese el radio de su esfera: ");
        a=leer.nextDouble();
        double resultado=(4*a*Math.PI);
        resultado(resultado);
        return 4*a*Math.PI;
    }

    public static double cubo(double a){
        System.out.println("Ingrese el valor de un lado de su cubo: ");
        a=leer.nextDouble();
        double resultado=(6*Math.pow(a,2));
        resultado(resultado);
        return 6*Math.pow(a,2);
    }

    public static double cono(double a, double b){
        System.out.println("Ingrese el radio de el cono: ");
        a=leer.nextDouble();
        System.out.println("Ingrese el alto de el cono: ");
        b=leer.nextDouble();
        double g=Math.sqrt((Math.pow(a,2)+Math.pow(b,2)));
        double resultado=(Math.PI*Math.pow(a,2)+Math.PI*a*g);
        resultado(resultado);
        return (Math.PI*a*(a+b));
    }

    public static void perimetros(double a, double b) {
        int eleccion=0;
        do {
            System.out.println(" ====MENU==== ");
            System.out.println("[1] Cuadrado");
            System.out.println("[2] Rectangulo");
            System.out.println("[3] Circulo");
            System.out.println("[4] Volumen Esfera");
            System.out.println("[5] Volumen Cubo");
            System.out.println("[6] Volumen Cono");
            System.out.println("[7] Salir");
            eleccion = leer.nextInt();
            switch (eleccion) {
                case 1:
                    cuadradoP(a);
                    break;
                case 2:
                    rectanguloP(a, b);
                    break;
                case 3:
                    circuloP(a);
                    break;
                case 4:
                    esferaV(a);
                    break;
                case 5:
                    cuboV(a);
                    break;
                case 6:
                    conoV(a, b);
                    break;
                case 7:
                    break;
            }
        }while (eleccion<1 || eleccion>7);
    }

    public static double cuadradoP(double a){
        System.out.println("Ingrese el valor del lado del cuadrado: ");
        a=leer.nextDouble();
        double resultado=(4*a);
        resultado(resultado);
        return 4*a;
    }

    public static double rectanguloP(double a, double b){
        System.out.println("Ingrese el alto del rectangulo: ");
        a=leer.nextDouble();
        System.out.println("Ingrese el ancho del rectangulo: ");
        b=leer.nextDouble();
        double resultado=(a*b);
        resultado(resultado);
        return a*b;
    }

    public static double circuloP(double a){
        System.out.println("Ingrese el radio del circulo: ");
        a=leer.nextDouble();
        double resultado=(2*a*Math.PI);
        resultado(resultado);
        return 2*a*Math.PI;
    }

    public static double esferaV(double a){
        System.out.println("Ingrese el radio de su esfera: ");
        a=leer.nextDouble();
        double resultado=((4*Math.pow(a,3)*Math.PI)/3);
        resultado(resultado);
        return (((4/3)*Math.pow(a,3)*Math.PI));
    }

    public static double cuboV(double a){
        System.out.println("Ingrese el valor de un lado de su cubo: ");
        a=leer.nextDouble();
        double resultado=(4*a);
        resultado(resultado);
        return 4*a;
    }

    public static double conoV(double a,double b) {
        System.out.println("Ingrese el radio del cono: ");
        a=leer.nextDouble();
        System.out.println("Ingrese la altura de su cono: ");
        b=leer.nextDouble();
        double resultado=((Math.PI*Math.pow(a,2)*b)/3);
        resultado(resultado);
         return (Math.PI*Math.pow(a,2)*b);
    }

    public static double porcentaje(double a, double c) {
        System.out.println("digite el primer numero: ");
        a=leer.nextDouble();
        System.out.println("digite el segundo numero(numero entero): ");
        c=leer.nextDouble();
        c=c/100;
        double resultado=a*c;
        resultado(resultado);
    return a*c;
    }

    public static double potencia(double a, double b) {
        System.out.println("digite la base: ");
        a=leer.nextDouble();
        System.out.println("digite la potencia: ");
        b=leer.nextDouble();
        double resultado=Math.pow(a,b);
        resultado(resultado);
    return Math.pow(a,b);
    }

    public static double menor(double a, double b) {
        System.out.println("digite su primer numero: ");
        a=leer.nextDouble();
        System.out.println("digite su segundo numero: ");
        b=leer.nextDouble();
        double resultado=Math.min(a,b);
        resultado(resultado);
        return Math.min(a,b);
    }

    public static double mayor(double a, double b) {
        System.out.println("digite su primer numero: ");
        a=leer.nextDouble();
        System.out.println("digite su segundo numero: ");
        b=leer.nextDouble();
        double resultado=Math.max(a,b);
        resultado(resultado);
    return Math.max(a,b);
    }

    public static double dividir(double a, double b){
        System.out.println("digite el dividendo: ");
        a=leer.nextDouble();
        System.out.println("digite su divisor: ");
        b=leer.nextDouble();
        double resultado=a/b;
        resultado(resultado);
        return a/b;
    }

    public static double multiplicar(double a, double b) {
        System.out.println("digite su primer factor: ");
        a=leer.nextDouble();
        System.out.println("digite su segundo factor: ");
        b=leer.nextDouble();
        double resultado=a*b;
        resultado(resultado);
        return a*b;
    }

    public static double restar(double a, double b) {
        System.out.println("digite el minuendo: ");
        a=leer.nextDouble();
        System.out.println("digite el sustraendo: ");
        b=leer.nextDouble();
        double resultado=a-b;
        resultado(resultado);
        return a-b;
    }

    public static double sumar(double a, double b) {
        System.out.println("digite su primer sumando: ");
        a=leer.nextDouble();
        System.out.println("digite su segundo sumando: ");
        b=leer.nextDouble();
        double resultado=a+b;
        resultado(resultado);
    return a+b;
    }

    public static void resultado(double resultado){
        System.out.println("="+resultado);
    }

    public static void ResultadoEcuaciones(double X1, double X2){
        System.out.println("Las soluciones a su ecuacion son: ");
        System.out.println("X1= "+X1);
        System.out.println("X2= "+X2);
    }
}