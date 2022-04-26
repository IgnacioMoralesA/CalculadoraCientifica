import java.util.Scanner;

public class CodigoNacho {
    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        try{
            menuCalculadora();
        }catch (Exception e){
            System.out.println("Valor no valido.");
        }
    }

    public static void menuCalculadora() {
        int eleccion;
        do {
            do {
                mostrarOpcionesMenu();
                eleccion = leer.nextInt();
                switch (eleccion) {
                    case 1:
                        sumar();
                        break;
                    case 2:
                        restar();
                        break;
                    case 3:
                        multiplicar();
                        break;
                    case 4:
                        dividir();
                        break;
                    case 5:
                        mayor();
                        break;
                    case 6:
                        menor();
                        break;
                    case 7:
                        potencia();
                        break;
                    case 8:
                        porcentaje();
                        break;
                    case 9:
                        ecuacionCuadratica();
                        break;
                    case 10:
                        figurasGeometricas();
                        break;
                    case 11:
                        sistemaEcuaciones();
                        break;
                    case 12:
                        ecuacionRecta();
                        break;
                    case 13:
                        factoriales();
                        break;
                    case 14:
                        break;
                }
            } while (eleccion < 1 || eleccion > 14);
        }while (eleccion != 14);
    }

    public static void mostrarOpcionesMenu() {
        System.out.println("Qué operación desea realizar? ");
        System.out.println("[1] Sumar");
        System.out.println("[2] Restar");
        System.out.println("[3] Multiplicar");
        System.out.println("[4] Dividir");
        System.out.println("[5] Sacar el número mayor");
        System.out.println("[6] Sacar el número menor");
        System.out.println("[7] Potencia");
        System.out.println("[8] Porcentaje");
        System.out.println("[9] Ecuación Cuadrática");
        System.out.println("[10] Perímetros, Áreas o Volúmenes");
        System.out.println("[11] Sistema de Ecuaciones (2 incógnitas)");
        System.out.println("[12] Ecuaciones de la recta");
        System.out.println("[13] Factoriales");
        System.out.println("[14] Salir");
    }

    public static void sumar() {
        String[] operadores = {"el 1er número","el 2do número"};
        double[] numeros = ingresarNumeros(operadores);
        double a = numeros[0];
        double b = numeros[1];
        double suma = a+b;
        resultado(suma);
    }

    public static void restar() {
        String[] operadores = {"el 1er número","el 2do número"};
        double[] numeros = ingresarNumeros(operadores);
        double a = numeros[0];
        double b = numeros[1];
        double resta = a-b;
        resultado(resta);
    }

    public static void multiplicar() {
        String[] operadores = {"el 1er factor","el 2do factor"};
        double[] numeros = ingresarNumeros(operadores);
        double a = numeros[0];
        double b = numeros[1];
        double multiplicacion = a*b;
        resultado(multiplicacion);
    }

    public static void dividir(){
        String[] operadores = {"el dividendo","el divisor"};
        double[] numeros = ingresarNumeros(operadores);
        double a = numeros[0];
        double b = numeros[1];
        double division = a/b;
        resultado(division);
    }

    public static void mayor() {
        String[] operadores = {"el 1er número","el 2do número"};
        double[] numeros = ingresarNumeros(operadores);
        double a = numeros[0];
        double b = numeros[1];
        double numeroMayor = Math.max(a,b);
        resultado(numeroMayor);
    }

    public static void menor() {
        String[] operadores = {"el 1er número","el 2do número"};
        double[] numeros = ingresarNumeros(operadores);
        double a = numeros[0];
        double b = numeros[1];
        double numeroMenor = Math.min(a,b);
        resultado(numeroMenor);
    }

    public static void potencia() {
        String[] operadores = {"la base","el exponente"};
        double[] numeros = ingresarNumeros(operadores);
        double a = numeros[0];
        double b = numeros[1];
        double potenciaNumero = Math.pow(a,b);
        resultado(potenciaNumero);
    }

    public static void porcentaje() {
        String[] operadores = {"el 1er número","el 2do número"};
        double[] numeros = ingresarNumeros(operadores);
        double a = numeros[0];
        double b = numeros[1];
        b /= 100;
        double porcentajeNumero = a*b;
        resultado(porcentajeNumero);
    }

    public static double[] ingresarNumeros(String[] operadores) {
        double[] numeros = new double[operadores.length];
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Ingrese "+operadores[i]+": ");
            numeros[i] = leer.nextDouble();
        }
        return numeros;
    }

    public static void figurasGeometricas() {
        int eleccion;
        do {
            mostrarOpcionesFiguras();
            eleccion = leer.nextInt();
            if(eleccion == 3){
                eleccion = 1;
            }
            switch (eleccion) {
                case 1:
                    perimetros();
                    break;
                case 2:
                    areas();
                    break;
            }
        }while (eleccion < 1 || eleccion > 3);
    }

    public static void mostrarOpcionesFiguras() {
        System.out.println("¿Qué desea calcular?");
        System.out.println("[1] Perimetros");
        System.out.println("[2] Areas");
        System.out.println("[3] Volumenes");
    }

    public static void perimetros() {
        int eleccion;
        do {
            mostrarOpcionesPerimetros();
            eleccion = leer.nextInt();
            switch (eleccion) {
                case 1:
                    perimetroCuadrado();
                    break;
                case 2:
                    perimetroRectangulo();
                    break;
                case 3:
                    perimetroCirculo();
                    break;
                case 4:
                    volumenEsfera();
                    break;
                case 5:
                    volumenCubo();
                    break;
                case 6:
                    volumenCono();
                    break;
                case 7:
                    break;
            }
        }while (eleccion<1 || eleccion>7);
    }

    public static void mostrarOpcionesPerimetros() {
        System.out.println(" ====MENU==== ");
        System.out.println("[1] Cuadrado");
        System.out.println("[2] Rectangulo");
        System.out.println("[3] Circulo");
        System.out.println("[4] Volumen Esfera");
        System.out.println("[5] Volumen Cubo");
        System.out.println("[6] Volumen Cono");
        System.out.println("[7] Salir");

    }

    public static void perimetroCuadrado(){
        System.out.println("Ingrese el valor del lado del cuadrado: ");
        double a = leer.nextDouble();
        double perimetro = (4*a);
        resultado(perimetro);
    }

    public static void perimetroRectangulo(){
        System.out.println("Ingrese el alto del rectangulo: ");
        double a = leer.nextDouble();
        System.out.println("Ingrese el ancho del rectangulo: ");
        double b = leer.nextDouble();
        double perimetro = (a*b);
        resultado(perimetro);
    }

    public static void perimetroCirculo(){
        System.out.println("Ingrese el radio del circulo: ");
        double a = leer.nextDouble();
        double perimetro = (2*a*Math.PI);
        resultado(perimetro);
    }

    public static void volumenEsfera(){
        System.out.println("Ingrese el radio de su esfera: ");
        double a = leer.nextDouble();
        double volumen = ((4*Math.pow(a,3)*Math.PI)/3);
        resultado(volumen);
    }

    public static void volumenCubo(){
        System.out.println("Ingrese el valor de un lado de su cubo: ");
        double a = leer.nextDouble();
        double volumen = (4*a);
        resultado(volumen);
    }

    public static void volumenCono() {
        System.out.println("Ingrese el radio del cono: ");
        double a = leer.nextDouble();
        System.out.println("Ingrese la altura de su cono: ");
        double b = leer.nextDouble();
        double volumen = ((Math.PI*Math.pow(a,2)*b)/3);
        resultado(volumen);
    }

    public static void areas() {
        int eleccion;
        do {
            mostrarOpcionesAreas();
            eleccion = leer.nextInt();
            switch (eleccion) {
                case 1:
                    areaCuadrado();
                    break;
                case 2:
                    areaRectangulo();
                    break;
                case 3:
                    areaCirculo();
                    break;
                case 4:
                    areaEsfera();
                    break;
                case 5:
                    areaCubo();
                    break;
                case 6:
                    areaCono();
                    break;
                case 7:
                    break;
            }
        }while (eleccion<1 || eleccion>7);
    }

    public static void mostrarOpcionesAreas() {
        System.out.println("Seleccione el área que desea calcular: ");
        System.out.println("[1] Area de un cuadrado");
        System.out.println("[2] Area de un rectangulo");
        System.out.println("[3] Area de un circulo");
        System.out.println("[4] Area de una esfera");
        System.out.println("[5] Area de un cubo");
        System.out.println("[6] Area de un cono");
        System.out.println("[7] Salir");

    }

    public static void areaCuadrado(){
        System.out.println("Cual es el lado de su cuadrado?");
        double a = leer.nextDouble();
        double area = Math.pow(a,2);
        resultado(area);
    }

    public static void areaRectangulo(){
        System.out.println("Ingrese el ancho de su rectangulo: ");
        double a = leer.nextDouble();
        System.out.println("Ingrese el alto de su rectangulo: ");
        double b = leer.nextDouble();
        double area = a*b;
        resultado(area);
    }

    public static void areaCirculo(){
        System.out.println("Ingrese el radio de su circulo: ");
        double a = leer.nextDouble();
        double area = (Math.PI*Math.pow(a,2));
        resultado(area);
    }

    public static void areaEsfera(){
        System.out.println("Ingrese el radio de su esfera: ");
        double a = leer.nextDouble();
        double area = (4*a*Math.PI);
        resultado(area);
    }

    public static void areaCubo(){
        System.out.println("Ingrese el valor de un lado de su cubo: ");
        double a = leer.nextDouble();
        double area = (6*Math.pow(a,2));
        resultado(area);
    }

    public static void areaCono(){
        System.out.println("Ingrese el radio de el cono: ");
        double a = leer.nextDouble();
        System.out.println("Ingrese el alto de el cono: ");
        double b = leer.nextDouble();
        double g = Math.sqrt((Math.pow(a,2)+Math.pow(b,2)));
        double area = (Math.PI*Math.pow(a,2)+Math.PI*a*g);
        resultado(area);
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
            System.out.println("Valor de "+parametros[i]+"?:");
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
        if(discriminante<0){
            System.out.println("Solución no real");
        }else{
            double raizDiscriminante = Math.sqrt(discriminante);
            double x1 = (-b+raizDiscriminante)/(2*a);
            double x2 = (-b-raizDiscriminante)/(2*a);
            solucionesCuadratica[0] = x1;
            solucionesCuadratica[1] = x2;
        }
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

    public static void factoriales() {
        System.out.println("ingrese dato: ");
        double a = leer.nextDouble();
        int fact = 1;
        for( int i = 0; i <= a; i++ ) {
            fact *= (i+1);
        }
        resultado(fact);
    }

    public static void logaritmo(){
        String[] operadores = {"el logaritmo de "};
        double[] numeros = ingresarNumeros(operadores);
        double a = numeros[0];
        double log = Math.log10(a);
        resultado(log);
    }

    public static void logaritmoNatural(){
        String[] operadores = {"el logaritmo natural de "};
        double[] numeros = ingresarNumeros(operadores);
        double a = numeros[0];
        double ln = Math.log(a);
        resultado(ln);
    }

    public static void numeroEuler(){
        String[] operadores = {"el exponente de euler "};
        double[] numeros = ingresarNumeros(operadores);
        double a = numeros[0];
        double exp = Math.exp(a);
        resultado(exp);
    }

    public static void coseno(){
        String[] operadores = {"el coseno de "};
        double[] numeros = ingresarNumeros(operadores);
        double a = numeros[0];
        double cos = Math.cos(a);
        resultado(cos);
    }

    public static void seno(){
        String[] operadores = {"el seno de "};
        double[] numeros = ingresarNumeros(operadores);
        double a = numeros[0];
        double sin = Math.sin(a);
        resultado(sin);
    }

    public static void tangente(){
        String[] operadores = {"la tangente de "};
        double[] numeros = ingresarNumeros(operadores);
        double a = numeros[0];
        double tan = Math.tan(a);
        resultado(tan);
    }

    public static void resultado(double resultado){
        System.out.println("El resultado es = "+resultado);
    }


}
