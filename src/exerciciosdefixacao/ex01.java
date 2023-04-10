package exerciciosdefixacao;

import application.Triangulo;

import java.util.Scanner;

public class ex01 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Triangulo x, y;

        x = new Triangulo();
        y = new Triangulo();

        System.out.println("Insira as medidas do Triângulo X: ");

        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("Insira as medidas do Triângulo Y: ");

        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double areaX = x.area();

        double areaY = y.area();

        System.out.printf("Área do Triângulo X: %.4f%n", areaX);

        System.out.printf("Área do Triângulo Y: %.4f%n", areaY);

    }

}




