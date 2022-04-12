import java.util.Scanner;

public class CalculadoraCientifica {
    static Scanner leer = new Scanner(System.in);
    public static void main(String[] args) {
        menu();
    }

    private static void menu() {
        double a=0;
        double b=0;
        double c=0.0;
        preguntar(a,b);
        sumar(a,b);
        restar(a,b);
        multiplicar(a,b);
        dividir(a,b);
        mayor(a,b);
        menor(a,b);
        potencia(a,b);
        porcentaje(a,c);
        perimetros(a,b);
        areas();
    }

    private static void mostrar(double res) {
        System.out.println(res);
    }

    private static void preguntar(double a, double b) {
        System.out.println("primer factor: ");
        a=leer.nextDouble();
        System.out.println("segundo factor: ");
        b=leer.nextDouble();
    }

    public static void areas() {
        cuadrado();
        rectangulo();
        circulo();
        esfera();
        cubo();
        cono();
    }

    public static double cuadrado(){
        double a=0;
        return Math.pow(a,2);
    }

    public static double rectangulo(){
        double a=0;
        double b=0;
        return a*b;
    }

    public static double circulo(){
        double a=0;
        return Math.PI*Math.pow(a,2);
    }

    public static double esfera(){
        double a=0;
        return 4*a*Math.PI;
    }

    public static double cubo(){
        double a=0;
        return Math.pow(a,3);
    }

    public static double cono() {
        double a=0;
        double h=0;
        double b=0;
return (Math.PI*a*(a+b));
    }

    public static void perimetros(double a, double b) {
        cuadradoP();
        rectanguloP();
        circuloP();
        esferaV();
        cuboV();
        conoV();
    }

    public static int cuadradoP(){
        int a=0;
        int resultado=4*a;
        return resultado;
    }

    public static int rectanguloP(){
        int a=0;
        int b=0;
        return a*b;
    }

    public static double circuloP(){
        double r=0;
        return 2*r*Math.PI;
    }

    public static double esferaV(){
        double r=0;
        return ((4*Math.pow(r,3)*Math.PI)/3);
    }

    public static double cuboV(){
        int a=0;
        return 4*a;
    }

    public static double conoV() {
        double a=0;
        double h=0;
        return (Math.PI*Math.pow(a,2)*h)/3;
    }

    public static double porcentaje(double a, double c) {
    return a*c;
    }

    public static double potencia(double a, double b) {
    return Math.pow(a,b);
    }

    public static double menor(double a, double b) {
        return Math.min(a,b);
    }

    public static double mayor(double a, double b) {
    return Math.max(a,b);
    }

    public static double dividir(double a, double b){
        return a/b;
    }

    public static double multiplicar(double a, double b) {
        return a*b;
    }

    public static double restar(double a, double b) {
    return a-b;
    }

    public static double sumar(double a, double b) {
    return a+b;
    }
}
