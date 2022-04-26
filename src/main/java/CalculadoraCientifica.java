import java.util.LinkedList;
import java.util.Scanner;

public class CalculadoraCientifica {
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
                        raiz();
                        break;
                    case 6:
                        mayor();
                        break;
                    case 7:
                        menor();
                        break;
                    case 8:
                        potencia();
                        break;
                    case 9:
                        porcentaje();
                        break;
                    case 10:
                        ecuacionCuadratica();
                        break;
                    case 11:
                        figurasGeometricas();
                        break;
                    case 12:
                        sistemaEcuaciones();
                        break;
                    case 13:
                        ecuacionRecta();
                        break;
                    case 14:
                        factoriales();
                        break;
                    case 15:
                        divisores();
                        break;
                    case 16:
                        logaritmoNatural();
                        break;
                    case 17:
                        logaritmo10();
                        break;
                    case 18:
                        seno();
                        break;
                    case 19:
                        coseno();
                        break;
                    case 20:
                        tangente();
                        break;
                    case 21:
                        multiplicaSuma();
                        break;
                    case 22:
                        senoHiperbolico();
                        break;
                    case 23:
                        cosenoHiperbolico();
                        break;
                    case 24:
                        tangenteHiperbolica();
                        break;
                    case 25:
                        menuMatriz();
                        break;
                    case 26:
                        break;
                }
            } while (eleccion < 1 || eleccion > 26);
        }while (eleccion != 26);
    }

    public static void mostrarOpcionesMenu() {
        System.out.println("Qué operación desea realizar? ");
        System.out.println("[1] Sumar");
        System.out.println("[2] Restar");
        System.out.println("[3] Multiplicar");
        System.out.println("[4] Dividir");
        System.out.println("[5] Raiz");
        System.out.println("[6] Sacar el número mayor");
        System.out.println("[7] Sacar el número menor");
        System.out.println("[8] Potencia");
        System.out.println("[9] Porcentaje");
        System.out.println("[10] Ecuación Cuadrática");
        System.out.println("[11] Perímetros, Áreas o Volúmenes");
        System.out.println("[12] Sistema de Ecuaciones (2 incógnitas)");
        System.out.println("[13] Ecuaciones de la recta");
        System.out.println("[14] Factoriales");
        System.out.println("[15] Divisores");
        System.out.println("[16] Logaritmo natural");
        System.out.println("[17] Logaritmo base 10");
        System.out.println("[18] Seno");
        System.out.println("[19] Coseno");
        System.out.println("[20] Tangeno");
        System.out.println("[21] Multiplica dos numeros y suma un tercero");
        System.out.println("[22] Seno hiperbolico");
        System.out.println("[23] Coseno hiperbolico");
        System.out.println("[24] Tangente hiperbolica");
        System.out.println("[25] Matriz");
        System.out.println("[26] Salir");
    }

    public static void sumar() {
        String[] operadores = {"el 1er número: ","el 2do número: "};
        double[] numeros = ingresarNumeros(operadores);
        double a = numeros[0];
        double b = numeros[1];
        double suma = a+b;
        resultado(suma);
    }

    public static void restar() {
        String[] operadores = {"el 1er número: ","el 2do número: "};
        double[] numeros = ingresarNumeros(operadores);
        double a = numeros[0];
        double b = numeros[1];
        double resta = a-b;
        resultado(resta);
    }

    public static void multiplicar() {
        String[] operadores = {"el 1er factor: ","el 2do factor: "};
        double[] numeros = ingresarNumeros(operadores);
        double a = numeros[0];
        double b = numeros[1];
        double multiplicacion = a*b;
        resultado(multiplicacion);
    }

    public static void dividir(){
        String[] operadores = {"el dividendo: ","el divisor: "};
        double[] numeros = ingresarNumeros(operadores);
        if(numeros[1]==0){
            System.out.println("No existe solucion");
        }else{
        double a = numeros[0];
        double b = numeros[1];
        double division = a/b;
        resultado(division);
    }
    }

    public static void raiz(){
        String[] operadores={"numero: "};
        double[] numero=ingresarNumeros(operadores);
        if(numero[0]<0){
            String[] imaginario ={Math.sqrt(numero[0]*(-1))+"i"};
            String b= (imaginario[0]);
            System.out.println(b);
        }
        if(numero[0]>=0){
        double a=Math.sqrt(numero[0]);
        resultado(a);
        }
    }

    public static void mayor() {
        String[] operadores = {"el 1er número: ","el 2do número: "};
        double[] numeros = ingresarNumeros(operadores);
        double a = numeros[0];
        double b = numeros[1];
        double numeroMayor = Math.max(a,b);
        resultado(numeroMayor);
    }

    public static void menor() {
        String[] operadores = {"el 1er número: ","el 2do número: "};
        double[] numeros = ingresarNumeros(operadores);
        double a = numeros[0];
        double b = numeros[1];
        double numeroMenor = Math.min(a,b);
        resultado(numeroMenor);
    }

    public static void potencia() {
        String[] operadores = {"la base","el exponente: "};
        double[] numeros = ingresarNumeros(operadores);
        double a = numeros[0];
        double b = numeros[1];
        double potenciaNumero = Math.pow(a,b);
        resultado(potenciaNumero);
    }

    public static void porcentaje() {
        String[] operadores = {"el 1er número","el 2do número: "};
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
            System.out.println("Ingrese "+operadores[i]);
            numeros[i] = leer.nextDouble();
        }
        return numeros;
    }

    public static void figurasGeometricas() {
        int eleccion;
        do {
            mostrarOpcionesFiguras();
            eleccion = leer.nextInt();
            switch (eleccion) {
                case 1 -> perimetros();
                case 2 -> areas();
            }
        }while (eleccion < 1 || eleccion > 2);
    }

    public static void mostrarOpcionesFiguras() {
        System.out.println("¿Qué desea calcular?");
        System.out.println("[1] Perimetros");
        System.out.println("[2] Areas");
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
        String[] operadores = {"el valor del lado del cuadrado: "};
        double[] numeros = ingresarNumeros(operadores);
        double a=numeros[0];
        double perimetro = (4*a);
        resultado(perimetro);
    }

    public static void perimetroRectangulo(){
        String[] operadores = {"el alto del rectangulo: ","el ancho del rectangulo: "};
        double[] numeros=ingresarNumeros(operadores);
        double a=numeros[0];
        double b=numeros[1];
        double perimetro = (a*b);
        resultado(perimetro);
    }

    public static void perimetroCirculo(){
        String[] operadores={"el radio del circulo: "};
        double[] numeros=ingresarNumeros(operadores);
        double a = numeros[0];
        double perimetro = (2*a*Math.PI);
        resultado(perimetro);
    }

    public static void volumenEsfera(){
        String[] operadores={"el radio de su esfera: "};
        double[] numeros=ingresarNumeros(operadores);
        double a = numeros[0];
        double volumen = ((4*Math.pow(a,3)*Math.PI)/3);
        resultado(volumen);
    }

    public static void volumenCubo(){
        String[] operadores={"el valor de un lado de su cubo: "};
        double[] numeros=ingresarNumeros(operadores);
        double a = numeros[0];
        double volumen = (4*a);
        resultado(volumen);
    }

    public static void volumenCono() {
        String[] opradores={"el radio del cono: ","la altura del cono: "};
        double[] numeros=ingresarNumeros(opradores);
        double a = numeros[0];
        double b = numeros[1];
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

    public static void divisores() {
        String[] operadores ={"numero"};
        double[] numeros=ingresarNumeros(operadores);
        Double a=numeros[0];
        LinkedList<Double>Divisores=new LinkedList<>();
        agregarDivisores(Divisores,a);
    }

    public static void logaritmoNatural(){
        String[] operadores={"numero: "};
        double[] numeros=ingresarNumeros(operadores);
        double a=Math.log(numeros[0]);
        resultado(a);
    }

    public static void seno(){
        String[] operadores={"numero: "};
        double[] numeros=ingresarNumeros(operadores);
        double a=Math.sin(numeros[0]);
        resultado(a);
    }

    public static void coseno(){
        String[] operadores={"numero: "};
        double[] numeros=ingresarNumeros(operadores);
        double a=Math.cos(numeros[0]);
        resultado(a);
    }

    public static void tangente(){
        String[] operadores={"numero: "};
        double[] numeros=ingresarNumeros(operadores);
        double a=Math.tan(numeros[0]);
        resultado(a);
    }

    public static void logaritmo10(){
        String[] operadores={"numero: "};
        double[] numeros=ingresarNumeros(operadores);
        double a=Math.log10(numeros[0]);
        resultado(a);
    }

    public static void multiplicaSuma() {
        String[] operadores = {"primer factor: ","segundo factor: ","sumando: "};
        double[] numeros = ingresarNumeros(operadores);
        double a = numeros[0];
        double b = numeros[1];
        double c = numeros[2];
        resultado(Math.fma(a,b,c));
    }

    public static void senoHiperbolico(){
        String[] operadores={"numero: "};
        double[] numeros=ingresarNumeros(operadores);
        double a=Math.sinh(numeros[0]);
        resultado(a);
    }

    public static void cosenoHiperbolico(){
        String[] operadores={"numero: "};
        double[] numeros=ingresarNumeros(operadores);
        double a=Math.cosh(numeros[0]);
        resultado(a);
    }

    public static void tangenteHiperbolica(){
        String[] operadores={"numero: "};
        double[] numeros=ingresarNumeros(operadores);
        double a=Math.tanh(numeros[0]);
        resultado(a);
    }

    public static void menuMatriz(){
        int eleccion;
        do{
            do {
                opcionesMatriz();
                eleccion=leer.nextInt();
                switch (eleccion){
                    case 1:
                        generarMatriz2();
                        break;
                    case 2:
                        generarMatriz3();
                        break;
                    case 3:
                        break;
                }
            }while (eleccion<1 || eleccion>3);
        }while(eleccion != 3);

    }

    public static void opcionesMatriz(){
        System.out.println("----MENU----");
        System.out.println("[1] Generar matriz 2x2");
        System.out.println("[2] Generar matriz 3x3");
        System.out.println("[3] Salir");
    }

    public static void generarMatriz2(){
       double[][] matriz2x2 = new double[2][2];
       ingresarcoeficientes(matriz2x2);
    }

    public static void ingresarcoeficientes(double[][] matriz){
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz[i].length;j++){
                matriz[i][j]=1;
            }
        }
        mostrarMatriz(matriz);
    }

    public static void generarMatriz3(){
        double[][] matriz3x3 = new double[3][3];
        ingresarcoeficientes(matriz3x3);
        menu3x3(matriz3x3);
    }

    public static void menu3x3(double[][] matriz){
        int eleccion;

        do {
            do {
                opcionesMenu3x3();
                eleccion=leer.nextInt();
                switch (eleccion){
                    case 1:
                        llenarMatriz(matriz);
                        break;
                    case 2:
                        llenarAll(matriz);
                        break;
                    case 3:
                        determinante(matriz);
                        break;
                    case 4:
                        break;
                }
            }while (eleccion<1 || eleccion>4);
        }while (eleccion!=4);
    }

    public static void opcionesMenu3x3(){
        System.out.println("[1] Llenar matriz");
        System.out.println("[2] Llenar matriz aleatoriamente");
        System.out.println("[3] Determinante");
        System.out.println("[4] Salir");
    }

    public static void llenarMatriz(double[][] matriz){
         double numero;
        for (int x=0; x < matriz.length; x++) {
            for (int y=0; y < matriz[x].length; y++) {
                System.out.println("ingrese valor para la casilla "+"["+x+"] ["+y+"]");
                numero=leer.nextInt();
                matriz[x][y]=numero;
                if (y!=matriz[x].length-1) System.out.print("\t");
            }
        }
    }

    public static void llenarAll(double[][] matriz){
        double numero;
        for (int x=0; x < matriz.length; x++) {
            for (int y=0; y < matriz[x].length; y++) {
                numero=(Math.random()*9);
                matriz[x][y]=numero;
                if (y!=matriz[x].length-1) System.out.print("\t");
            }
        }
        mostrarMatriz(matriz);
    }

    public static void mostrarMatriz(double[][] matriz){
        for (int x=0; x < matriz.length; x++) {
            System.out.print("[");
            for (int y=0; y < matriz[x].length; y++) {
                System.out.print (matriz[x][y]);
                if (y!=matriz[x].length-1) System.out.print("\t");
            }
            System.out.println("]");
        }
    }

    public static void determinante(double[][] matriz){
        double sumado1=(matriz[0][0]*matriz[1][1]*matriz[2][2]);
        double sumado2=(matriz[1][0]*matriz[2][1]*matriz[0][2]);
        double sumado3=(matriz[2][0]*matriz[0][1]*matriz[1][2]);
        double restado1=-(matriz[0][2]*matriz[1][1]*matriz[2][0]);
        double restado2=-(matriz[1][2]*matriz[2][1]*matriz[0][0]);
        double restado3=-(matriz[2][2]*matriz[0][1]*matriz[1][0]);
        double sumadoT=sumado1+sumado2+sumado3;
        double restadoT=restado1+restado2+restado3;
        double resutado=sumadoT+restadoT;
        resultado(resutado);
    }

    public static void agregarDivisores(LinkedList<Double> Divisores, Double numero) {
            for (int i=1;i<(numero+1);i++){
                if(numero%i==0) {
                    Divisores.add((double) i);
                }
            }
        mostrarDivisores(Divisores);
    }

    private static void mostrarDivisores(LinkedList<Double> divisores) {
        System.out.println(divisores);
    }

    public static void resultado(double resultado){
        System.out.println("El resultado es = "+resultado);
    }
}