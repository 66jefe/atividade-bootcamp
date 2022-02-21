package br.com.digitalinnovationone.aula2;

public class Main {
    public static void main(String[] args) {
        System.out.println("Quadrilatero");

        double areaQuadrado = Quadrilatero.area(7);
        System.out.println("Area do quadrado "+areaQuadrado);

        double areaRetangulo = Quadrilatero.area(5d,5d);
        System.out.println("Area do retangulo "+areaRetangulo);

        double areaTrapezio = Quadrilatero.area(10,7,8);
        System.out.println("Area do trapezio "+areaTrapezio);

        double areaLosango = Quadrilatero.area(3f,3f);
        System.out.println("Area do losango "+areaLosango);
    }
}
